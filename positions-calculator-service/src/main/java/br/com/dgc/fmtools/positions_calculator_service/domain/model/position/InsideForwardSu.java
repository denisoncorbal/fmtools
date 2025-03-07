package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InsideForwardSu extends Position {

  public InsideForwardSu(LinePlayer player) {
    super(
        "Inside Forward (Su)",
        List.of(
            player.getFinishing(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getFlair(),
            player.getVision(),
            player.getPace()),
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance()));
  }
}
