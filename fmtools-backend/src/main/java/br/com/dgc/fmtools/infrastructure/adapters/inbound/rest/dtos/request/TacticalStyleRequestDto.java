package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TacticalStyleRequestDto(@NotBlank String name, @NotNull UUID tacticId) {

}
