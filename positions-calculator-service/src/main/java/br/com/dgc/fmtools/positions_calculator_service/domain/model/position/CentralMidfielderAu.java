package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CentralMidfielderAu extends Position {

  public CentralMidfielderAu(LinePlayer player) {
    super(
        "Central Midfielder (Au)",
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
