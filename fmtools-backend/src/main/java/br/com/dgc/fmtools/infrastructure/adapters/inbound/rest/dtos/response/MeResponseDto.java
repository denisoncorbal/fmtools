package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response;

import java.util.List;

public record MeResponseDto(
        String fullName,
        String email,
        List<String> roles) {

}
