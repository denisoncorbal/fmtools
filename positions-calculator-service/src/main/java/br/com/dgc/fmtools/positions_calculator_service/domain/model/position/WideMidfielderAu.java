package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WideMidfielderAu extends Position {

  public WideMidfielderAu(LinePlayer player) {
    super(
        "Wide Midfielder (Au)",
        List.of(
            player.getCrossing(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getVision()),
        List.of(
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina()));
  }
}
