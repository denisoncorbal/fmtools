package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WideMidfielderAt extends Position {

  public WideMidfielderAt(LinePlayer player) {
    super(
        "Wide Midfielder (At)",
        List.of(
            player.getTackling(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getVision()),
        List.of(
            player.getCrossing(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina()));
  }
}
