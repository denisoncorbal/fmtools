package br.com.dgc.fmtools.application.services.mappers;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.SquadRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllSquadsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.SquadResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.SquadEntity;

@Component
public class SquadMapper {
    public SquadEntity toSquadEntity(SquadRequestDto squadRequestDto) {
        return new SquadEntity(squadRequestDto.name());
    }

    public SquadResponseDto toSquadResponseDto(SquadEntity squadEntity) {
        return new SquadResponseDto(squadEntity.getId(), squadEntity.getName());
    }

    public GetAllSquadsResponseDto toGetAllSquadsResponseDto(SquadEntity squadEntity) {
        return new GetAllSquadsResponseDto(squadEntity.getId(), squadEntity.getName());
    }
}
