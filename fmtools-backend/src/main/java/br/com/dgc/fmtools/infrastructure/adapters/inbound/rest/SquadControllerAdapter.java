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

import br.com.dgc.fmtools.application.ports.inbound.SquadControllerPort;
import br.com.dgc.fmtools.application.services.SquadService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.SquadRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.SquadResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/squad")
public class SquadControllerAdapter implements SquadControllerPort {

    private final SquadService squadService;

    public SquadControllerAdapter(SquadService squadService) {
        this.squadService = squadService;
    }

    @PostMapping("")
    public ResponseEntity<?> createSquad(@RequestBody @Valid SquadRequestDto squadRequestDto) {
        SquadResponseDto squadResponseDto = this.squadService.createSquad(squadRequestDto);
        if (squadResponseDto == null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(squadResponseDto);
    }

    @GetMapping("")
    public ResponseEntity<?> getAllSquads(@RequestParam Optional<UUID> teamId) {
        if (teamId.isPresent()) {
            return ResponseEntity.ok(this.squadService.getAllSquadsByTeamId(teamId.get()));
        }
        return ResponseEntity.ok(this.squadService.getAllSquads());
    }

}
