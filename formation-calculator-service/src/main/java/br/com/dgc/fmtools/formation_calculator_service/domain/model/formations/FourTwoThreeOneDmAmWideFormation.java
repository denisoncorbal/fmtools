package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.List;

public class FourTwoThreeOneDmAmWideFormation extends Formation {

  public FourTwoThreeOneDmAmWideFormation(
      List<Position> linePositions, Position goalkeeperPosition) {
    super("4-2-3-1 DM AM Wide", linePositions, goalkeeperPosition);
  }
}
