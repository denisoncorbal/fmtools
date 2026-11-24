package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response;

import java.util.List;

public record GetMeResponseDto(String name, String email, List<String> roles) {

}
