package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class PressingForwardAt extends Position {

  public PressingForwardAt(LinePlayer player) {
    super(
        "Pressing Forward (At)",
        List.of(
            player.getFinishing(),
            player.getFirstTouch(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getAgility(),
            player.getBalance(),
            player.getStrength()),
        List.of(
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getPace(),
            player.getStamina()));
  }
}
