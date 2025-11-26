package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record CalculateBestFormationRequestDto(
        Optional<List<UUID>> players,
        Optional<UUID> squadId,
        Optional<List<UUID>> tacticalPositions,
        Optional<UUID> formationId,
        Optional<UUID> tacticalStyleId,
        Optional<UUID> tacticId) {

}
