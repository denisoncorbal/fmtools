package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class MezzalaSu extends Position {

  public MezzalaSu(LinePlayer player) {
    super(
        "Mezzala (Su)",
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getTackling(),
            player.getAnticipation(),
            player.getComposure(),
            player.getVision(),
            player.getBalance(),
            player.getStamina()),
        List.of(
            player.getPassing(),
            player.getTechnique(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getWorkRate(),
            player.getAcceleration()));
  }
}
