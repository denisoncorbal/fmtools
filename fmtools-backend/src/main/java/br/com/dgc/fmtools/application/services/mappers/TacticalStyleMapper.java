package br.com.dgc.fmtools.application.services.mappers;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticalStyleRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTacticalStylesResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TacticalStyleResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalStyleEntity;

@Component
public class TacticalStyleMapper {
    public TacticalStyleEntity toTacticalStyleEntity(TacticalStyleRequestDto tacticalStyleRequestDto) {
        return new TacticalStyleEntity(tacticalStyleRequestDto.name());
    }

    public TacticalStyleResponseDto toTacticalStyleResponseDto(TacticalStyleEntity tacticalStyleEntity) {
        return new TacticalStyleResponseDto(tacticalStyleEntity.getId(), tacticalStyleEntity.getName());
    }

    public GetAllTacticalStylesResponseDto toGetAllTacticalStylesResponseDto(TacticalStyleEntity tacticalStyleEntity) {
        return new GetAllTacticalStylesResponseDto(tacticalStyleEntity.getId(), tacticalStyleEntity.getName());
    }
}
