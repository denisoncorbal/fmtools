package br.com.dgc.fmtools.application.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.dgc.fmtools.application.ports.outbound.PlayerRepositoryPort;
import br.com.dgc.fmtools.application.ports.outbound.TacticalPositionRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.PlayerMapper;
import br.com.dgc.fmtools.application.services.mappers.TacticalPositionMapper;
import br.com.dgc.fmtools.domain.exceptions.InvalidFieldPositionAndRoleCombination;
import br.com.dgc.fmtools.domain.exceptions.InvalidRoleAndDutyCombination;
import br.com.dgc.fmtools.domain.model.Calculator;
import br.com.dgc.fmtools.domain.model.Player;
import br.com.dgc.fmtools.domain.model.TacticalPosition;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.CalculateBestFormationRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.CalculateBestFormationResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.PlayerEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalPositionEntity;

@Service
public class CalculatorService {

    private final PlayerRepositoryPort playerRepositoryPort;
    private final TacticalPositionRepositoryPort tacticalPositionRepositoryPort;
    private final PlayerMapper playerMapper;
    private final TacticalPositionMapper tacticalPositionMapper;

    public CalculatorService(PlayerRepositoryPort playerRepositoryPort,
            TacticalPositionRepositoryPort tacticalPositionRepositoryPort,
            PlayerMapper playerMapper, TacticalPositionMapper tacticalPositionMapper) {
        this.playerRepositoryPort = playerRepositoryPort;
        this.tacticalPositionRepositoryPort = tacticalPositionRepositoryPort;
        this.playerMapper = playerMapper;
        this.tacticalPositionMapper = tacticalPositionMapper;
    }

    public CalculateBestFormationResponseDto calculateBestFormation(
            CalculateBestFormationRequestDto calculateBestFormationRequestDto) {
        if (calculateBestFormationRequestDto.players().isEmpty()
                && calculateBestFormationRequestDto.squadId().isEmpty()) {
            return null;
        }

        if (calculateBestFormationRequestDto.tacticalPositions().isEmpty()
                && calculateBestFormationRequestDto.formationId().isEmpty()
                && calculateBestFormationRequestDto.tacticalStyleId().isEmpty()
                && calculateBestFormationRequestDto.tacticId().isEmpty()) {
            return null;
        }

        List<PlayerEntity> playerEntities = new ArrayList<>();
        List<TacticalPositionEntity> tacticalPositionEntities = new ArrayList<>();

        if (calculateBestFormationRequestDto.players().isPresent()) {
            playerEntities = this.getPlayersFromList(calculateBestFormationRequestDto.players().get());
        } else {
            playerEntities = this.getPlayersFromSquad(calculateBestFormationRequestDto.squadId().get());
        }

        if (calculateBestFormationRequestDto.tacticalPositions().isPresent()) {
            tacticalPositionEntities = this
                    .getTacticalPositionsFromList(calculateBestFormationRequestDto.tacticalPositions().get());
        } else {
            if (calculateBestFormationRequestDto.formationId().isEmpty()) {
                tacticalPositionEntities = this
                        .getTacticalPositionsFromFormation(calculateBestFormationRequestDto.formationId().get());
            } else {
                if (calculateBestFormationRequestDto.tacticalStyleId().isPresent()) {
                    tacticalPositionEntities = this.getTacticalPositionsFromTacticalStyle(
                            calculateBestFormationRequestDto.tacticalStyleId().get());
                } else {
                    tacticalPositionEntities = this
                            .getTacticalPositionsFromTactic(calculateBestFormationRequestDto.tacticId().get());
                }
            }
        }

        Calculator calculator = new Calculator();

        List<Player> players = playerEntities.stream().map(pe -> {
            try {
                return this.playerMapper.toPlayer(pe);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return null;
            }
        }).toList();
        List<TacticalPosition> tacticalPositions = tacticalPositionEntities.stream()
                .map(tpe -> {
                    try {
                        return this.tacticalPositionMapper.toTacticalPosition(tpe);
                    } catch (InvalidFieldPositionAndRoleCombination | InvalidRoleAndDutyCombination e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .toList();

        double percentageSuitability = calculator.calculateBestPlayersForFormation(
                players,
                tacticalPositions);

        tacticalPositionEntities.get(0).getFormation().setSuitability(percentageSuitability);

        for (TacticalPosition tp : tacticalPositions) {
            TacticalPositionEntity tacticalPositionEntity = tacticalPositionEntities.stream()
                    .filter(tpe -> tp.getId().equals(tpe.getId())).findFirst().get();

            tacticalPositionEntity.setPlayer(
                    playerEntities.stream().filter(pe -> pe.getId().equals(tp.getPlayer().getId())).findFirst().get());

            tacticalPositionEntity.setSuitability(tp.getSuitability());

            this.tacticalPositionRepositoryPort.saveToDatabase(tacticalPositionEntity);
        }

        return new CalculateBestFormationResponseDto(percentageSuitability);
    }

    private List<PlayerEntity> getPlayersFromList(List<UUID> ids) {
        List<PlayerEntity> players = new ArrayList<>();
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        ids.forEach((id) -> {
            PlayerEntity pe = this.playerRepositoryPort.getFromDatabase(id);
            if (pe.getOwnerId().equals(ownerId)) {
                players.add(pe);
            }
        });
        return players;
    }

    private List<PlayerEntity> getPlayersFromSquad(UUID squadId) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        return this.playerRepositoryPort.getPlayersBySquadIdAndOwnerId(squadId, ownerId);
    }

    private List<TacticalPositionEntity> getTacticalPositionsFromList(List<UUID> ids) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<TacticalPositionEntity> tacticalPositions = new ArrayList<>();
        ids.forEach(id -> {
            TacticalPositionEntity tpe = this.tacticalPositionRepositoryPort.getFromDatabase(id);
            if (tpe.getOwnerId().equals(ownerId)) {
                tacticalPositions.add(tpe);
            }
        });
        return tacticalPositions;
    }

    private List<TacticalPositionEntity> getTacticalPositionsFromFormation(UUID formationId) {
        return null;
    }

    private List<TacticalPositionEntity> getTacticalPositionsFromTacticalStyle(UUID tacticalStyleId) {
        return null;
    }

    private List<TacticalPositionEntity> getTacticalPositionsFromTactic(UUID tacticId) {
        return null;
    }
}
