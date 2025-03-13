package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.List;

public class FiveThreeTwoDmWbFormation extends Formation {

  public FiveThreeTwoDmWbFormation(List<Position> linePositions, Position goalkeeperPosition) {
    super("5-3-2 DM WB", linePositions, goalkeeperPosition);
  }
}
