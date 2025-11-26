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

import br.com.dgc.fmtools.application.ports.inbound.TacticControllerPort;
import br.com.dgc.fmtools.application.services.TacticService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TacticRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.TacticResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/tactic")
public class TacticControllerAdapter implements TacticControllerPort {

    private final TacticService tacticService;

    public TacticControllerAdapter(TacticService tacticService) {
        this.tacticService = tacticService;
    }

    @PostMapping("")
    public ResponseEntity<?> createTactic(@RequestBody @Valid TacticRequestDto tacticRequestDto) {
        TacticResponseDto tacticResponseDto = this.tacticService.createTactic(tacticRequestDto);
        if (tacticResponseDto == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(tacticResponseDto);
    }

    @GetMapping("")
    public ResponseEntity<?> getAllTactics(@RequestParam Optional<UUID> teamId) {
        if (teamId.isPresent()) {
            return ResponseEntity.ok(this.tacticService.getAllTacticsByTeamId(teamId.get()));
        }
        return ResponseEntity.ok(this.tacticService.getAllTactics());
    }

}
