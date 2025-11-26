package br.com.dgc.fmtools.application.services.mappers;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTacticsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TacticResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticEntity;

@Component
public class TacticMapper {
    public TacticEntity toTacticEntity(TacticRequestDto tacticRequestDto) {
        return new TacticEntity(tacticRequestDto.name());
    }

    public TacticResponseDto toTacticResponseDto(TacticEntity tacticEntity) {
        return new TacticResponseDto(tacticEntity.getId(), tacticEntity.getName());
    }

    public GetAllTacticsResponseDto toGetAllTacticsResponseDto(TacticEntity tacticEntity) {
        return new GetAllTacticsResponseDto(tacticEntity.getId(), tacticEntity.getName());
    }
}
