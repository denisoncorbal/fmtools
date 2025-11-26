package br.com.dgc.fmtools.application.services;

import java.util.List;
import java.util.UUID;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.dgc.fmtools.application.ports.outbound.TacticRepositoryPort;
import br.com.dgc.fmtools.application.ports.outbound.TacticalStyleRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.TacticalStyleMapper;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticalStyleRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTacticalStylesResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TacticalStyleResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalStyleEntity;

@Service
public class TacticalStyleService {
    private final TacticalStyleMapper tacticalStyleMapper;
    private final TacticalStyleRepositoryPort tacticalStyleRepositoryPort;
    private final TacticRepositoryPort tacticRepositoryPort;

    public TacticalStyleService(TacticalStyleMapper tacticalStyleMapper,
            TacticalStyleRepositoryPort tacticalStyleRepositoryPort,
            TacticRepositoryPort tacticRepositoryPort) {
        this.tacticalStyleMapper = tacticalStyleMapper;
        this.tacticalStyleRepositoryPort = tacticalStyleRepositoryPort;
        this.tacticRepositoryPort = tacticRepositoryPort;
    }

    public TacticalStyleResponseDto createTacticalStyle(TacticalStyleRequestDto tacticalStyleRequestDto) {
        TacticalStyleEntity tse = this.tacticalStyleMapper.toTacticalStyleEntity(tacticalStyleRequestDto);
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        tse.setOwnerId(ownerId);
        TacticEntity te = this.tacticRepositoryPort.getFromDatabase(tacticalStyleRequestDto.tacticId());
        if (!te.getOwnerId().equals(ownerId)) {
            return null;
        }
        tse.setTactic(te);
        tse = this.tacticalStyleRepositoryPort.saveToDatabase(tse);
        return this.tacticalStyleMapper.toTacticalStyleResponseDto(tse);
    }

    public List<GetAllTacticalStylesResponseDto> getAllTacticalStylesByTacticId(UUID tacticId) {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<TacticalStyleEntity> tseList = this.tacticalStyleRepositoryPort
                .getAllTacticalStylesByTacticIdAndOwnerIdFromDatabase(tacticId, ownerId);
        return tseList.stream().map(this.tacticalStyleMapper::toGetAllTacticalStylesResponseDto).toList();
    }

    public List<GetAllTacticalStylesResponseDto> getAllTacticalStyles() {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UUID ownerId = UUID.fromString(user.getUsername());
        List<TacticalStyleEntity> tseList = this.tacticalStyleRepositoryPort
                .getAllTacticalStylesByOwnerIdFromDatabase(ownerId);
        return tseList.stream().map(this.tacticalStyleMapper::toGetAllTacticalStylesResponseDto).toList();
    }
}
