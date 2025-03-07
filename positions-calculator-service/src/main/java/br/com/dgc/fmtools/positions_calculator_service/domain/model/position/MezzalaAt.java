package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class MezzalaAt extends Position {

  public MezzalaAt(LinePlayer player) {
    super(
        "Mezzala (At)",
        List.of(
            player.getFinishing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getFlair(),
            player.getBalance(),
            player.getStamina()),
        List.of(
            player.getDribbling(),
            player.getPassing(),
            player.getTechnique(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration()));
  }
}
