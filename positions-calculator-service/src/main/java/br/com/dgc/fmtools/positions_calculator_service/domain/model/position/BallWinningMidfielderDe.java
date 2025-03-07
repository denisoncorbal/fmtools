package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class BallWinningMidfielderDe extends Position {

  public BallWinningMidfielderDe(LinePlayer player) {
    super(
        "Ball Winning Midfielder (De)",
        List.of(
            player.getMarking(),
            player.getBravery(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAgility(),
            player.getPace(),
            player.getStrength()),
        List.of(
            player.getTackling(),
            player.getAggression(),
            player.getAnticipation(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina()));
  }
}
