package br.com.dgc.fmtools.positions_calculator_service.web;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SuitablePosition;
import br.com.dgc.fmtools.positions_calculator_service.domain.service.PositionsCalculatorService;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class PositionsCalculatorController {

  private PositionsCalculatorService positionsCalculatorService;

  public PositionsCalculatorController(PositionsCalculatorService positionsCalculatorService) {
    this.positionsCalculatorService = positionsCalculatorService;
  }

  @PostMapping("/calculateGoalkeeperPositions/{id}")
  public ResponseEntity<List<SuitablePosition>> calculateGoalkeeperPositions(@PathVariable UUID id)
      throws JsonProcessingException {
    return ResponseEntity.status(HttpStatus.CREATED.value())
        .body(this.positionsCalculatorService.calculateGoalkeeperPositions(id));
  }

  @PostMapping("/calculateLinePositions/{id}")
  public ResponseEntity<List<SuitablePosition>> calculateLinePositions(@PathVariable UUID id)
      throws JsonProcessingException {

    return ResponseEntity.status(HttpStatus.CREATED.value())
        .body(this.positionsCalculatorService.calculateLinePositions(id));
  }
}
