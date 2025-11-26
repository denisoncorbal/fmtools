package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.dgc.fmtools.domain.model.constants.FieldPosition;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FieldPositionValidator implements ConstraintValidator<FieldPositionValidatorAnnotation, String> {

    private List<String> validValues = new ArrayList<>();

    @Override
    public void initialize(FieldPositionValidatorAnnotation constraintAnnotation) {
        // Optional: Initialize validator with annotation parameters
        this.validValues = Arrays.stream(FieldPosition.values()).map(fp -> fp.name()).toList();
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