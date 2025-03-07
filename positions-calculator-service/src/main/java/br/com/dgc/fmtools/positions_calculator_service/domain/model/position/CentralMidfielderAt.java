package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CentralMidfielderAt extends Position {

  public CentralMidfielderAt(LinePlayer player) {
    super(
        "Central Midfielder (At)",
        List.of(
            player.getLongShots(),
            player.getTackling(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getDecisions(),
            player.getOffTheBall()));
  }
}
