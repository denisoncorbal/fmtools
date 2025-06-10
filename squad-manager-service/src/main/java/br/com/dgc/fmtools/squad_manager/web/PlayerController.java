package br.com.dgc.fmtools.squad_manager.web;

import br.com.dgc.fmtools.squad_manager.domain.service.GoalkeeperPlayerService;
import br.com.dgc.fmtools.squad_manager.domain.service.LinePlayerService;
import br.com.dgc.fmtools.squad_manager.exception.PlayerNotFoundException;
import br.com.dgc.fmtools.squad_manager.web.dto.request.GoalkeeperPlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.request.LinePlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetAllGoalkeeperPlayersResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetAllLinePlayersResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetGoalkeeperPlayerByIdResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetLinePlayerByIdResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.PlayerCreatedResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.PlayerUpdatedResponse;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/api")
@RestController
public class PlayerController {

  private final Logger logger = LoggerFactory.getLogger(PlayerController.class);

  private final LinePlayerService linePlayerService;
  private final GoalkeeperPlayerService goalkeeperPlayerService;

  public PlayerController(
      LinePlayerService linePlayerService, GoalkeeperPlayerService goalkeeperPlayerService) {
    this.linePlayerService = linePlayerService;
    this.goalkeeperPlayerService = goalkeeperPlayerService;
  }

  @PostMapping("/linePlayer")
  public ResponseEntity<PlayerCreatedResponse> createLinePlayer(
      @RequestBody @Valid LinePlayerRequest player) {
    this.logger.info("Attempt to create Line Player");
    ResponseEntity<PlayerCreatedResponse> response =
        ResponseEntity.status(HttpStatus.CREATED)
            .body(new PlayerCreatedResponse(this.linePlayerService.createLinePlayer(player)));
    this.logger.info(
        "Line Player created with id:{}", Optional.ofNullable(response.getBody()).get().id());
    return response;
  }

  @PostMapping("/goalkeeperPlayer")
  public ResponseEntity<PlayerCreatedResponse> createGoalkeeperPlayer(
      @RequestBody @Valid GoalkeeperPlayerRequest player) {
    this.logger.info("Attempt to create Line Player");
    ResponseEntity<PlayerCreatedResponse> response =
        ResponseEntity.status(HttpStatus.CREATED)
            .body(
                new PlayerCreatedResponse(
                    this.goalkeeperPlayerService.createGoalkeeperPlayer(player)));
    this.logger.info(
        "Goalkeeper Player created with id: {}",
        Optional.ofNullable(response.getBody()).get().id());
    return response;
  }

  @GetMapping("/linePlayer/{id}")
  public ResponseEntity<GetLinePlayerByIdResponse> getLinePlayerById(@PathVariable UUID id)
      throws PlayerNotFoundException {
    this.logger.info("Fetching Line Player by id: {}", id);
    ResponseEntity<GetLinePlayerByIdResponse> response =
        ResponseEntity.ok(this.linePlayerService.getLinePlayerById(id));
    this.logger.info("Line Player found. Displaying resut");
    return response;
  }

  @GetMapping("/goalkeeperPlayer/{id}")
  public ResponseEntity<GetGoalkeeperPlayerByIdResponse> getGoalkeeperPlayerById(
      @PathVariable UUID id) throws PlayerNotFoundException {
    this.logger.info("Fetching Goalkeeper Player by id: {}", id);
    ResponseEntity<GetGoalkeeperPlayerByIdResponse> response =
        ResponseEntity.ok(this.goalkeeperPlayerService.getGoalkeeperPlayerById(id));
    this.logger.info("Goalkeeper Player found. Displaying result");
    return response;
  }

  @GetMapping("/linePlayer")
  public ResponseEntity<List<GetAllLinePlayersResponse>> getAllLinePlayerById() {
    this.logger.info("Fetching all Line Players");
    ResponseEntity<List<GetAllLinePlayersResponse>> resposnse =
        ResponseEntity.ok(this.linePlayerService.getAllLinePlayers());
    this.logger.info(
        "Displaying {} results founded", Optional.ofNullable(resposnse.getBody()).get().size());
    return resposnse;
  }

  @GetMapping("/goalkeeperPlayer")
  public ResponseEntity<List<GetAllGoalkeeperPlayersResponse>> getAllGoalkeeperPlayerById() {
    this.logger.info("Fetching all Goalkeeper Players");
    ResponseEntity<List<GetAllGoalkeeperPlayersResponse>> response =
        ResponseEntity.ok(this.goalkeeperPlayerService.getAllGoalkeeperPlayers());
    this.logger.info("Displaying {} results founded");
    return response;
  }

  @PutMapping("/linePlayer/{id}")
  public ResponseEntity<PlayerUpdatedResponse> updateLinePlayer(
      @PathVariable UUID id, @RequestBody @Valid LinePlayerRequest linePlayerRequest)
      throws PlayerNotFoundException {
    this.logger.info("Attempt to update Line Player by id: {}", id);
    ResponseEntity<PlayerUpdatedResponse> response =
        ResponseEntity.ok(
            new PlayerUpdatedResponse(
                this.linePlayerService.updateLinePlayer(id, linePlayerRequest)));
    this.logger.info("Update successfully");
    return response;
  }

  @PutMapping("/goalkeeperPlayer/{id}")
  public ResponseEntity<PlayerUpdatedResponse> updateGoalkeeperPlayer(
      @PathVariable UUID id, @RequestBody @Valid GoalkeeperPlayerRequest goalkeeperPlayerRequest)
      throws PlayerNotFoundException {
    this.logger.info("Attempt to update Goalkeeper Player by id: {}", id);
    ResponseEntity<PlayerUpdatedResponse> response =
        ResponseEntity.ok(
            new PlayerUpdatedResponse(
                this.goalkeeperPlayerService.updateGoalkeeperPlayer(id, goalkeeperPlayerRequest)));
    this.logger.info("Update successfully");
    return response;
  }

  @DeleteMapping("/linePlayer/{id}")
  public ResponseEntity<?> deleteLinePlayer(@PathVariable UUID id) {
    this.logger.info("Attempt to delete Line Player by id: {}", id);
    this.linePlayerService.deleteLinePlayer(id);
    this.logger.info("Deleted successfully");
    return ResponseEntity.noContent().build();
  }

  @DeleteMapping("/goalkeeperPlayer/{id}")
  public ResponseEntity<?> deleteGoalkeeperPlayer(@PathVariable UUID id) {
    this.logger.info("Attempt to delete Goalkeeper Player by id: {}", id);
    this.goalkeeperPlayerService.deleteGoalkeeperPlayer(id);
    this.logger.info("Deleted successfully");
    return ResponseEntity.noContent().build();
  }
}
