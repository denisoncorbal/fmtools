package br.com.dgc.fmtools.application.services;

import java.util.List;
import java.util.UUID;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.dgc.fmtools.application.ports.outbound.TacticRepositoryPort;
import br.com.dgc.fmtools.application.ports.outbound.TeamRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.TacticMapper;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTacticsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TacticResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TeamEntity;

@Service
public class TacticService {

    private final TacticMapper tacticMapper;
    private final TacticRepositoryPort tacticRepositoryPort;
    private final TeamRepositoryPort teamRepositoryPort;

    public TacticService(TacticMapper tacticMapper, TacticRepositoryPort tacticRepositoryPort,
            TeamRepositoryPort teamRepositoryPort) {
        this.tacticMapper = tacticMapper;
        this.tacticRepositoryPort = tacticRepositoryPort;
        this.teamRepositoryPort = teamRepositoryPort;
    }

    public TacticResponseDto createTactic(TacticRequestDto tacticRequestDto) {
        TacticEntity te = this.tacticMapper.toTacticEntity(tacticRequestDto);
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        te.setOwnerId(ownerId);
        TeamEntity teamEntity = this.teamRepositoryPort.getFromDatabase(tacticRequestDto.teamId());
        if (!teamEntity.getOwnerId().equals(ownerId))
            return null;
        te.setTeam(teamEntity);
        te = this.tacticRepositoryPort.saveToDatabase(te);
        return this.tacticMapper.toTacticResponseDto(te);
    }

    public List<GetAllTacticsResponseDto> getAllTacticsByTeamId(UUID teamId) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<TacticEntity> teList = this.tacticRepositoryPort.getAllTacticsFromDatabaseByTeamIdAndOwnerId(teamId,
                ownerId);
        return teList.stream().map(this.tacticMapper::toGetAllTacticsResponseDto).toList();
    }

    public List<GetAllTacticsResponseDto> getAllTactics() {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<TacticEntity> teList = this.tacticRepositoryPort.getAllTacticsFromDatabaseByOwnerId(ownerId);
        return teList.stream().map(this.tacticMapper::toGetAllTacticsResponseDto).toList();
    }
}
