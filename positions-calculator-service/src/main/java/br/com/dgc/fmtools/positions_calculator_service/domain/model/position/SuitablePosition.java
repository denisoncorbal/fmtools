package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

public record SuitablePosition(
    String name,
    Double percentage,
    Integer quantityKeyAttributes,
    Integer quantityPreferableAttributes) {}
