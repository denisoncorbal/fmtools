package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class HalfBackDe extends Position {

  public HalfBackDe(LinePlayer player) {
    super(
        "Half-Back (De)",
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getAggression(),
            player.getBravery(),
            player.getWorkRate(),
            player.getJumpingReach(),
            player.getStamina(),
            player.getStrength()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getTeamwork()));
  }
}
