package br.com.dgc.fmtools.application.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dgc.fmtools.application.ports.outbound.FormationRepositoryPort;
import br.com.dgc.fmtools.application.ports.outbound.TacticalStyleRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.FormationMapper;
import br.com.dgc.fmtools.application.services.mappers.TacticalPositionMapper;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.FormationRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.FormationResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllFormationsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.FormationEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalPositionEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalStyleEntity;

@Service
public class FormationService {
    private final FormationMapper formationMapper;
    private final FormationRepositoryPort formationRepositoryPort;
    private final TacticalStyleRepositoryPort tacticalStyleRepositoryPort;
    private final TacticalPositionMapper tacticalPositionMapper;

    public FormationService(FormationMapper formationMapper, FormationRepositoryPort formationRepositoryPort,
            TacticalStyleRepositoryPort tacticalStyleRepositoryPort,
            TacticalPositionMapper tacticalPositionMapper) {
        this.formationMapper = formationMapper;
        this.formationRepositoryPort = formationRepositoryPort;
        this.tacticalStyleRepositoryPort = tacticalStyleRepositoryPort;
        this.tacticalPositionMapper = tacticalPositionMapper;
    }

    @Transactional
    public FormationResponseDto createFormation(FormationRequestDto formationRequestDto) {
        if (formationRequestDto.tacticalPositions().size() != 11) {
            return null;
        }
        FormationEntity fe = this.formationMapper.toFormationEntity(formationRequestDto);
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        fe.setOwnerId(ownerId);
        TacticalStyleEntity ts = this.tacticalStyleRepositoryPort
                .getFromDatabase(formationRequestDto.tacticalStyleId());
        if (!ts.getOwnerId().equals(ownerId)) {
            return null;
        }
        fe.setTacticalStyle(ts);
        fe.setTacticalPositions(formationRequestDto.tacticalPositions().stream().map(tp -> {
            TacticalPositionEntity tpe = this.tacticalPositionMapper.toTacticalPositionEntity(tp);
            tpe.setOwnerId(ownerId);
            return tpe;
        }).collect(Collectors.toSet()));
        fe = this.formationRepositoryPort.saveToDatabase(fe);
        return this.formationMapper.toFormationEntity(fe);
    }

    public List<GetAllFormationsResponseDto> getAllFormationsByTacticalStyle(UUID tacticalStyleId) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<FormationEntity> feList = this.formationRepositoryPort.getAllFormationsFromDatabaseByTacticalStyleIdAndOwnerId(tacticalStyleId,
                ownerId);
        return feList.stream().map(this.formationMapper::toGetAllFormationsResponseDto).toList();
    }

    public List<GetAllFormationsResponseDto> getAllFormations() {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<FormationEntity> feList = this.formationRepositoryPort.getAllFormationsFromDatabaseByOwnerId(ownerId);
        return feList.stream().map(this.formationMapper::toGetAllFormationsResponseDto).toList();
    }
}
