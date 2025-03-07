package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class AdvancedForwardAt extends Position {

  public AdvancedForwardAt(LinePlayer player) {
    super(
        "Advanced Forward (At)",
        List.of(
            player.getPassing(),
            player.getAnticipation(),
            player.getDecisions(),
            player.getWorkRate(),
            player.getAgility(),
            player.getBalance(),
            player.getPace(),
            player.getStamina()),
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getAcceleration()));
  }
}
