package br.com.dgc.fmtools.application.ports.inbound;

import org.springframework.http.ResponseEntity;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticalStyleRequestDto;

public interface TacticalStyleControllerPort {
    ResponseEntity<?> createTacticalStyle(TacticalStyleRequestDto tacticalStyleRequestDto);
}
