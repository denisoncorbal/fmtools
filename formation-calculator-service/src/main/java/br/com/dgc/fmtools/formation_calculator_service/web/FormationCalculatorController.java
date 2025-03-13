package br.com.dgc.fmtools.formation_calculator_service.web;

import br.com.dgc.fmtools.formation_calculator_service.domain.service.FormationCalculatorService;
import br.com.dgc.fmtools.formation_calculator_service.web.dto.request.CalculateFormationRequest;
import br.com.dgc.fmtools.formation_calculator_service.web.dto.response.CalculateFormationResponse;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class FormationCalculatorController {

  private FormationCalculatorService formationCalculatorService;

  public FormationCalculatorController(FormationCalculatorService formationCalculatorService) {
    this.formationCalculatorService = formationCalculatorService;
  }

  @PostMapping("/calculateFormation")
  public ResponseEntity<List<CalculateFormationResponse>> calculateFormation(
      @RequestBody CalculateFormationRequest calculateFormationRequest) {
    return ResponseEntity.ok(
        this.formationCalculatorService
            .calculateFormation(
                calculateFormationRequest.linePlayersIds(),
                calculateFormationRequest.goalkeeperPlayersIds())
            .stream()
            .map(CalculateFormationResponse::new)
            .toList());
  }
}
