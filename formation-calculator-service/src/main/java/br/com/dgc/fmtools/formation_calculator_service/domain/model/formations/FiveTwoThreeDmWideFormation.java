package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.List;

public class FiveTwoThreeDmWideFormation extends Formation {

  public FiveTwoThreeDmWideFormation(List<Position> linePositions, Position goalkeeperPosition) {
    super("5-2-3 DM Wide", linePositions, goalkeeperPosition);
  }
}
