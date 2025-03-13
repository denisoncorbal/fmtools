package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.List;

public class FiveTwoTwoOneDmAmFormation extends Formation {

  public FiveTwoTwoOneDmAmFormation(List<Position> linePositions, Position goalkeeperPosition) {
    super("5-2-2-1 DM AM", linePositions, goalkeeperPosition);
  }
}
