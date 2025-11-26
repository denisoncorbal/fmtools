package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response;

import java.util.Optional;
import java.util.UUID;

public record GetAllTacticalPositionsResponseDto(UUID id, String fieldPosition, String role, String duty,
                Optional<UUID> playerId, Optional<Double> suitability) {

}
