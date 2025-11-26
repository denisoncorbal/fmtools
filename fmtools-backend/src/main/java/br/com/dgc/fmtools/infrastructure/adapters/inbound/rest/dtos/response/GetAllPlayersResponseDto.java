package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response;

import java.util.Map;
import java.util.UUID;

public record GetAllPlayersResponseDto(UUID id, String name, Map<String, Integer> attributes) {

}
