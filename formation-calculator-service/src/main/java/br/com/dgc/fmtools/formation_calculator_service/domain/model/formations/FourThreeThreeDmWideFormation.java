package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.List;

public class FourThreeThreeDmWideFormation extends Formation {

  public FourThreeThreeDmWideFormation(List<Position> linePositions, Position goalkeeperPosition) {
    super("4-3-3 DM Wide", linePositions, goalkeeperPosition);
  }
}
