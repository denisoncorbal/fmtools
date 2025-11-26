package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request;

import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FormationRequestDto(@NotBlank String name, @NotNull List<TacticalPositionRequestDto> tacticalPositions,
                @NotNull UUID tacticalStyleId) {

}
