package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.List;

public class FourFourTwoDiamondNarrowFormation extends Formation {

  public FourFourTwoDiamondNarrowFormation(
      List<Position> linePositions, Position goalkeeperPosition) {
    super("4-4-2 Diamond Narrow", linePositions, goalkeeperPosition);
  }
}
