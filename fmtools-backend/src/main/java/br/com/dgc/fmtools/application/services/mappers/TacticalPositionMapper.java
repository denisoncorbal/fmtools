package br.com.dgc.fmtools.application.services.mappers;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.domain.exceptions.InvalidFieldPositionAndRoleCombination;
import br.com.dgc.fmtools.domain.exceptions.InvalidRoleAndDutyCombination;
import br.com.dgc.fmtools.domain.model.TacticalPosition;
import br.com.dgc.fmtools.domain.model.constants.Duty;
import br.com.dgc.fmtools.domain.model.constants.FieldPosition;
import br.com.dgc.fmtools.domain.model.constants.Role;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticalPositionRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetAllTacticalPositionsResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TacticalPositionResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalPositionEntity;

@Component
public class TacticalPositionMapper {
    public TacticalPositionEntity toTacticalPositionEntity(TacticalPositionRequestDto tacticalPositionRequestDto) {
        return new TacticalPositionEntity(tacticalPositionRequestDto.fieldPosition(), tacticalPositionRequestDto.role(),
                tacticalPositionRequestDto.duty());
    }

    public TacticalPositionResponseDto toTacticalPositionResponseDto(TacticalPositionEntity tacticalPositionEntity) {
        return new TacticalPositionResponseDto(tacticalPositionEntity.getId());
    }

    public TacticalPosition toTacticalPosition(TacticalPositionEntity tacticalPositionEntity)
            throws InvalidFieldPositionAndRoleCombination, InvalidRoleAndDutyCombination {
        return new TacticalPosition(tacticalPositionEntity.getId(),
                FieldPosition.valueOf(tacticalPositionEntity.getFieldPosition()),
                Role.valueOf(tacticalPositionEntity.getRole()), Duty.valueOf(tacticalPositionEntity.getDuty()));

    }

    public GetAllTacticalPositionsResponseDto toGetAllTacticalPositionsResponseDto(
            TacticalPositionEntity tacticalPositionEntity) {
        return new GetAllTacticalPositionsResponseDto(tacticalPositionEntity.getId(),
                tacticalPositionEntity.getFieldPosition(), tacticalPositionEntity.getRole(),
                tacticalPositionEntity.getDuty(),
                Optional.ofNullable(
                        tacticalPositionEntity.getPlayer() != null ? tacticalPositionEntity.getPlayer().getId()
                                : null),
                Optional.ofNullable(tacticalPositionEntity.getSuitability()));
    }
}
