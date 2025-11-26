package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.validators.DutyValidatorAnnotation;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.validators.FieldPositionValidatorAnnotation;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.validators.RoleValidatorAnnotation;

public record TacticalPositionRequestDto(@FieldPositionValidatorAnnotation String fieldPosition,
                @RoleValidatorAnnotation String role, @DutyValidatorAnnotation String duty) {

}
