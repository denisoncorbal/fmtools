package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request;

import jakarta.validation.constraints.NotBlank;

public record TeamRequestDto(@NotBlank String name) {

}
