package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request;

import java.util.Map;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PlayerRequestDto(@NotBlank String name, @NotNull Map<String, Integer> attributes,
                @NotNull UUID squadId) {

}
