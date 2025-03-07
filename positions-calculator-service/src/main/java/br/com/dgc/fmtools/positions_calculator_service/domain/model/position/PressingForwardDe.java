package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class PressingForwardDe extends Position {

  public PressingForwardDe(LinePlayer player) {
    super(
        "Pressing Forward (De)",
        List.of(
            player.getFirstTouch(),
            player.getComposure(),
            player.getConcentration(),
            player.getAgility(),
            player.getBalance(),
            player.getStrength()),
        List.of(
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getPace(),
            player.getStamina()));
  }
}
