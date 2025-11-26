package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.dgc.fmtools.domain.model.constants.Duty;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DutyValidator implements ConstraintValidator<DutyValidatorAnnotation, String> {

    private List<String> validValues = new ArrayList<>();

    @Override
    public void initialize(DutyValidatorAnnotation constraintAnnotation) {
        // Optional: Initialize validator with annotation parameters
        this.validValues = Arrays.stream(Duty.values()).map(fp -> fp.name()).toList();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Implement your custom validation logic here
        // For example, check if the string contains a specific pattern
        if (value == null || value.isEmpty()) {
            return false;
        }
        return this.validValues.contains(value);
    }
}