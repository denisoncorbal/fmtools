package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WideMidfielderDe extends Position {

  public WideMidfielderDe(LinePlayer player) {
    super(
        "Wide Midfielder (De)",
        List.of(
            player.getCrossing(),
            player.getFirstTouch(),
            player.getMarking(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getStamina()),
        List.of(
            player.getPassing(),
            player.getTackling(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate()));
  }
}
