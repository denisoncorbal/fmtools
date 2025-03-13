package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.List;

public class FiveTwoOneTwoDmAmFormation extends Formation {

  public FiveTwoOneTwoDmAmFormation(List<Position> linePositions, Position goalkeeperPosition) {
    super("5-2-1-2 DM AM", linePositions, goalkeeperPosition);
  }
}
