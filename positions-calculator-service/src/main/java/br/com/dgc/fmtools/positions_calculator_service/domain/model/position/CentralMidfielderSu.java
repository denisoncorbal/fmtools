package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CentralMidfielderSu extends Position {

  public CentralMidfielderSu(LinePlayer player) {
    super(
        "Central Midfielder (Su)",
        List.of(
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getOffTheBall(),
            player.getVision(),
            player.getWorkRate(),
            player.getStamina()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getTeamwork()));
  }
}
