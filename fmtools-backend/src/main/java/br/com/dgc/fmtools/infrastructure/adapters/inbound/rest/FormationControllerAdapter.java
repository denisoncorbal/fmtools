package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import java.util.Optional;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgc.fmtools.application.ports.inbound.FormationControllerPort;
import br.com.dgc.fmtools.application.services.FormationService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.FormationRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.FormationResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/formation")
public class FormationControllerAdapter implements FormationControllerPort {
    private final FormationService formationService;

    public FormationControllerAdapter(FormationService formationService) {
        this.formationService = formationService;
    }

    @PostMapping("")
    public ResponseEntity<?> createFormation(@RequestBody @Valid FormationRequestDto formationRequestDto) {
        FormationResponseDto formationResponseDto = this.formationService.createFormation(formationRequestDto);
        if (formationRequestDto == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(formationResponseDto);
    }

    @GetMapping("")
    public ResponseEntity<?> getAllFormations(@RequestParam Optional<UUID> tacticalStyleId) {
        if (tacticalStyleId.isPresent()) {
            return ResponseEntity.ok(this.formationService.getAllFormationsByTacticalStyle(tacticalStyleId.get()));
        }
        return ResponseEntity.ok(this.formationService.getAllFormations());
    }

}
