package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DutyValidator.class) // Link to your validator
public @interface DutyValidatorAnnotation {
    String message() default "Invalid duty value"; // Default error message

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}