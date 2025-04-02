package br.com.dgc.fmtools.formation_calculator_service.web.dto.response;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.TacticalStyle;
import java.util.List;

public record CalculateFormationResponse(
    String name, String mentality, List<FormationDto> preferableFormations) {
  public CalculateFormationResponse(TacticalStyle tacticalStyle) {
    this(
        tacticalStyle.getName(),
        tacticalStyle.getMentality(),
        tacticalStyle.getPreferableFormations().stream().map(FormationDto::new).toList());
  }
}
