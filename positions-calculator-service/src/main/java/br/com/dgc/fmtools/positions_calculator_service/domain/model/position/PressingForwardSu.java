package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class PressingForwardSu extends Position {

  public PressingForwardSu(LinePlayer player) {
    super(
        "Pressing Forward (Su)",
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getComposure(),
            player.getConcentration(),
            player.getOffTheBall(),
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
