package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InsideForwardAt extends Position {

  public InsideForwardAt(LinePlayer player) {
    super(
        "Inside Forward (At)",
        List.of(
            player.getLongShots(),
            player.getPassing(),
            player.getAnticipation(),
            player.getComposure(),
            player.getFlair(),
            player.getPace()),
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance()));
  }
}
