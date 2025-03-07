package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class PoacherAt extends Position {

  public PoacherAt(LinePlayer player) {
    super(
        "Poacher (At)",
        List.of(
            player.getFirstTouch(),
            player.getHeading(),
            player.getTechnique(),
            player.getDecisions(),
            player.getAcceleration()),
        List.of(
            player.getFinishing(),
            player.getAnticipation(),
            player.getComposure(),
            player.getOffTheBall()));
  }
}
