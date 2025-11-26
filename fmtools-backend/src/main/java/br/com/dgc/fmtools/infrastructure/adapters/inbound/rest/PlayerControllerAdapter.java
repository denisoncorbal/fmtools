package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import java.io.IOException;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.dgc.fmtools.application.ports.inbound.PlayerControllerPort;
import br.com.dgc.fmtools.application.services.PlayerService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.PlayerRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.PlayerResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/player")
public class PlayerControllerAdapter implements PlayerControllerPort {

    private final PlayerService playerService;

    public PlayerControllerAdapter(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> createPlayer(@RequestBody @Valid PlayerRequestDto playerRequestDto)
            throws JsonMappingException, JsonProcessingException {
        PlayerResponseDto playerResponseDto = this.playerService.createPlayer(playerRequestDto);
        if (playerResponseDto == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(playerResponseDto);
    }

    @Override
    @PostMapping("/text")
    public ResponseEntity<?> createPlayerFromText(@RequestParam MultipartFile playerData, @RequestParam String name,
            @RequestParam UUID squadId) throws IOException {
        PlayerResponseDto playerResponseDto = this.playerService.createPlayerFromText(name, playerData, squadId);
        if (playerResponseDto == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(playerResponseDto);
    }

    @Override
    @PostMapping("/html")
    public ResponseEntity<?> createPlayerFromHtml(@RequestParam MultipartFile playerData, @RequestParam String name,
            @RequestParam UUID squadId) throws IOException {
        PlayerResponseDto playerResponseDto = this.playerService.createPlayerFromHtml(name, playerData, squadId);
        if (playerResponseDto == null) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(playerResponseDto);
    }

    @GetMapping("")
    public ResponseEntity<?> getAllPlayers(@RequestParam UUID squadId) {
        return ResponseEntity.ok(this.playerService.getAllPlayers(squadId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPlayerById(@PathVariable UUID id) throws JsonMappingException, JsonProcessingException {
        return ResponseEntity.ok(this.playerService.getPlayerById(id));
    }

}
