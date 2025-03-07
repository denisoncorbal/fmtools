package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class DefensiveWingerDe extends Position {

  public DefensiveWingerDe(LinePlayer player) {
    super(
        "Defensive Winger (De)",
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getFirstTouch(),
            player.getMarking(),
            player.getTackling(),
            player.getAggression(),
            player.getConcentration(),
            player.getDecisions(),
            player.getAcceleration()),
        List.of(
            player.getTechnique(),
            player.getAnticipation(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina()));
  }
}
