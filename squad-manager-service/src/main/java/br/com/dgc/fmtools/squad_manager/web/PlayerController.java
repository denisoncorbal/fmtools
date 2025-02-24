package br.com.dgc.fmtools.squad_manager.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgc.fmtools.squad_manager.domain.service.GoalkeeperPlayerService;
import br.com.dgc.fmtools.squad_manager.domain.service.LinePlayerService;
import br.com.dgc.fmtools.squad_manager.web.dto.request.GoalkeeperPlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.request.LinePlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.response.PlayerCreatedResponse;
import jakarta.validation.Valid;

@RequestMapping("/v1/api")
@RestController
public class PlayerController {

  private final LinePlayerService linePlayerService;
  private final GoalkeeperPlayerService goalkeeperPlayerService;

  public PlayerController(
      LinePlayerService linePlayerService, GoalkeeperPlayerService goalkeeperPlayerService) {
    this.linePlayerService = linePlayerService;
    this.goalkeeperPlayerService = goalkeeperPlayerService;
  }

  @PostMapping("/linePlayer")
  public ResponseEntity<PlayerCreatedResponse> createLinePlayer(@RequestBody @Valid LinePlayerRequest player) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(new PlayerCreatedResponse(this.linePlayerService.createLinePlayer(player)));
  }

  @PostMapping("/goalkeeperPlayer")
  public ResponseEntity<?> createGoalkeeperPlayer(
      @RequestBody @Valid GoalkeeperPlayerRequest player) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(new PlayerCreatedResponse(this.goalkeeperPlayerService.createGoalkeeperPlayer(player)));
  }
}
