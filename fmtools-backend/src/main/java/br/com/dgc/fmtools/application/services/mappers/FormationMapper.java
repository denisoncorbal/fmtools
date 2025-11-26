package br.com.dgc.fmtools.application.services.mappers;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.FormationRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.FormationResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllFormationsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.FormationEntity;

@Component
public class FormationMapper {

    public FormationEntity toFormationEntity(FormationRequestDto formationRequestDto) {
        return new FormationEntity(formationRequestDto.name());
    }

    public FormationResponseDto toFormationEntity(FormationEntity formationEntity) {
        return new FormationResponseDto(formationEntity.getId(), formationEntity.getName());
    }

    public GetAllFormationsResponseDto toGetAllFormationsResponseDto(FormationEntity formationEntity) {
        return new GetAllFormationsResponseDto(formationEntity.getId(), formationEntity.getName(),
                Optional.ofNullable(formationEntity.getSuitability()));
    }

}
