package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class BallWinningMidfielderSu extends Position {

  public BallWinningMidfielderSu(LinePlayer player) {
    super(
        "Ball Winning Midfielder (Su)",
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getBravery(),
            player.getConcentration(),
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
