package br.com.dgc.fmtools.application.ports.inbound;

import org.springframework.http.ResponseEntity;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.FormationRequestDto;

public interface FormationControllerPort {
    ResponseEntity<?> createFormation(FormationRequestDto formationRequestDto);
}
