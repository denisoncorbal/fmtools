package br.com.dgc.fmtools.application.services;

import java.util.List;
import java.util.UUID;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.dgc.fmtools.application.ports.outbound.TacticalPositionRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.TacticalPositionMapper;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticalPositionRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTacticalPositionsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TacticalPositionResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalPositionEntity;

@Service
public class TacticalPositionService {

    private final TacticalPositionMapper tacticalPositionMapper;
    private final TacticalPositionRepositoryPort tacticalPositionRepositoryPort;

    public TacticalPositionService(TacticalPositionMapper tacticalPositionMapper,
            TacticalPositionRepositoryPort tacticalPositionRepositoryPort) {
        this.tacticalPositionMapper = tacticalPositionMapper;
        this.tacticalPositionRepositoryPort = tacticalPositionRepositoryPort;
    }

    public TacticalPositionResponseDto createTacticalPosition(TacticalPositionRequestDto tacticalPositionRequestDto) {
        TacticalPositionEntity tpe = this.tacticalPositionMapper.toTacticalPositionEntity(tacticalPositionRequestDto);
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerID = UUID.fromString(user.getUsername());
        tpe.setOwnerId(ownerID);
        tpe = this.tacticalPositionRepositoryPort.saveToDatabase(tpe);
        return this.tacticalPositionMapper.toTacticalPositionResponseDto(tpe);
    }

    public List<GetAllTacticalPositionsResponseDto> getAllTacticalPositions(UUID formationId) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<TacticalPositionEntity> tpeList = this.tacticalPositionRepositoryPort
                .getAllTacticalPositionsFromDatabase(formationId, ownerId);
        return tpeList.stream().map(this.tacticalPositionMapper::toGetAllTacticalPositionsResponseDto).toList();
    }
}
