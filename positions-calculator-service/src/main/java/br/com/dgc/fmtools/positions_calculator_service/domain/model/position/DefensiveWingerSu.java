package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class DefensiveWingerSu extends Position {

  public DefensiveWingerSu(LinePlayer player) {
    super(
        "Defensive Winger (Su)",
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getAggression(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getAcceleration()),
        List.of(
            player.getCrossing(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina()));
  }
}
