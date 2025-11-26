package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgc.fmtools.application.ports.inbound.TacticalPositionControllerPort;
import br.com.dgc.fmtools.application.services.TacticalPositionService;

@RestController
@RequestMapping("api/v1/tacticalPosition")
public class TacticalPositionControllerAdapter implements TacticalPositionControllerPort {

    private final TacticalPositionService tacticalPositionService;

    public TacticalPositionControllerAdapter(TacticalPositionService tacticalPositionService) {
        this.tacticalPositionService = tacticalPositionService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAllTacticalPositions(@RequestParam UUID formationId) {
        return ResponseEntity.ok(this.tacticalPositionService.getAllTacticalPositions(formationId));
    }

}
