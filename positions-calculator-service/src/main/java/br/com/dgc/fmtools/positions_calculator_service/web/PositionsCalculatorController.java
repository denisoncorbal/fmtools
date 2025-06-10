package br.com.dgc.fmtools.positions_calculator_service.web;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SuitablePosition;
import br.com.dgc.fmtools.positions_calculator_service.domain.service.PositionsCalculatorService;
import br.com.dgc.fmtools.positions_calculator_service.web.dto.response.PositionsCalculated;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin("http://web-app:3001")
public class PositionsCalculatorController {

  private PositionsCalculatorService positionsCalculatorService;

  public PositionsCalculatorController(PositionsCalculatorService positionsCalculatorService) {
    this.positionsCalculatorService = positionsCalculatorService;
  }

  @PostMapping("/calculateGoalkeeperPositions/{id}")
  public ResponseEntity<PositionsCalculated> calculateGoalkeeperPositions(@PathVariable UUID id)
      throws JsonProcessingException {
    return ResponseEntity.status(HttpStatus.CREATED.value())
        .body(this.positionsCalculatorService.calculateGoalkeeperPositions(id));
  }

  @PostMapping("/calculateLinePositions/{id}")
  public ResponseEntity<PositionsCalculated> calculateLinePositions(@PathVariable UUID id)
      throws JsonProcessingException {

    return ResponseEntity.status(HttpStatus.CREATED.value())
        .body(this.positionsCalculatorService.calculateLinePositions(id));
  }

  @GetMapping("/getAllPositionsById/{id}")
  public ResponseEntity<List<SuitablePosition>> getAllPositionsById(@PathVariable UUID id)
      throws JsonProcessingException, JsonMappingException {
    return ResponseEntity.ok(this.positionsCalculatorService.getAllPositionsById(id));
  }
}
