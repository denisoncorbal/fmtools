package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class ShadowStrikerAt extends Position {

  public ShadowStrikerAt(LinePlayer player) {
    super(
        "Shadow Striker (At)",
        List.of(
            player.getPassing(),
            player.getTechnique(),
            player.getConcentration(),
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
            player.getAnticipation(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getAcceleration()));
  }
}
