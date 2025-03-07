package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CentralMidfielderDe extends Position {

  public CentralMidfielderDe(LinePlayer player) {
    super(
        "Central Midfielder (De)",
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTechnique(),
            player.getAggression(),
            player.getAnticipation(),
            player.getComposure(),
            player.getWorkRate(),
            player.getStamina()),
        List.of(
            player.getTackling(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getTeamwork()));
  }
}
