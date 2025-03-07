package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class RaumdeuterAt extends Position {

  public RaumdeuterAt(LinePlayer player) {
    super(
        "Raumdeuter (At)",
        List.of(
            player.getFirstTouch(),
            player.getTechnique(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina()),
        List.of(
            player.getFinishing(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getBalance()));
  }
}
