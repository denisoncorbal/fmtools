package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response;

import java.util.Optional;
import java.util.UUID;

public record GetAllFormationsResponseDto(UUID id, String name, Optional<Double> suitability) {

}
