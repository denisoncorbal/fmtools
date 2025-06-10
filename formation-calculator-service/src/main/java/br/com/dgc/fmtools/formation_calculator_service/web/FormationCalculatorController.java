package br.com.dgc.fmtools.formation_calculator_service.web;

import br.com.dgc.fmtools.formation_calculator_service.domain.service.FormationCalculatorService;
import br.com.dgc.fmtools.formation_calculator_service.web.dto.request.CalculateFormationRequest;
import br.com.dgc.fmtools.formation_calculator_service.web.dto.response.CalculateFormationResponse;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin("http://web-app:3001")
public class FormationCalculatorController {

  private FormationCalculatorService formationCalculatorService;

  public FormationCalculatorController(FormationCalculatorService formationCalculatorService) {
    this.formationCalculatorService = formationCalculatorService;
  }

  @PostMapping("/calculateFormation")
  public ResponseEntity<UUID> calculateFormation(
      @RequestBody CalculateFormationRequest calculateFormationRequest)
      throws InterruptedException, Exception {
    return ResponseEntity.status(HttpStatus.CREATED.value())
        .body(
            this.formationCalculatorService
                .calculateFormation(
                    calculateFormationRequest.linePlayersIds(),
                    calculateFormationRequest.goalkeeperPlayersIds())
                .orElseThrow(() -> new Exception("Timeout")));
  }

  @GetMapping("/calculateFormation/{id}")
  public ResponseEntity<List<CalculateFormationResponse>> getCalculatedFormation(
      @PathVariable UUID id) throws JsonMappingException, JsonProcessingException {
    return ResponseEntity.ok(this.formationCalculatorService.getCalculatedFormations(id));
  }
}
