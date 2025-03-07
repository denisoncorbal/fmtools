package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class DefensiveMidfielderSu extends Position {

  public DefensiveMidfielderSu(LinePlayer player) {
    super(
        "Defensive Midfielder (Su)",
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getAggression(),
            player.getComposure(),
            player.getDecisions(),
            player.getWorkRate(),
            player.getStamina(),
            player.getStrength()),
        List.of(
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning(),
            player.getTeamwork()));
  }
}
