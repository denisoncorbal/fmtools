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

import br.com.dgc.fmtools.application.ports.inbound.TacticalStyleControllerPort;
import br.com.dgc.fmtools.application.services.TacticalStyleService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticalStyleRequestDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/tacticalStyle")
public class TacticalStyleControllerAdapter implements TacticalStyleControllerPort {

    private final TacticalStyleService tacticalStyleService;

    public TacticalStyleControllerAdapter(TacticalStyleService tacticalStyleService) {
        this.tacticalStyleService = tacticalStyleService;
    }

    @PostMapping("")
    public ResponseEntity<?> createTacticalStyle(@RequestBody @Valid TacticalStyleRequestDto tacticalStyleRequestDto) {
        return ResponseEntity.ok(this.tacticalStyleService.createTacticalStyle(tacticalStyleRequestDto));
    }

    @GetMapping("")
    public ResponseEntity<?> getAllTacticalStyles(@RequestParam Optional<UUID> tacticId) {
        if (tacticId.isPresent()) {
            return ResponseEntity.ok(this.tacticalStyleService.getAllTacticalStylesByTacticId(tacticId.get()));
        }
        return ResponseEntity.ok(this.tacticalStyleService.getAllTacticalStyles());
    }

}
