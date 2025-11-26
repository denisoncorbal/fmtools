package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgc.fmtools.application.ports.inbound.TeamControllerPort;
import br.com.dgc.fmtools.application.services.TeamService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.TeamRequestDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/team")
public class TeamControllerAdapter implements TeamControllerPort {

    private final TeamService teamService;

    public TeamControllerAdapter(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("")
    public ResponseEntity<?> createTeam(@RequestBody @Valid TeamRequestDto teamRequestDto) {
        return ResponseEntity.ok(this.teamService.createTeam(teamRequestDto));
    }

    @GetMapping("")
    public ResponseEntity<?> getAllTeams() {
        return ResponseEntity.ok(this.teamService.getAllTeams());
    }

}
