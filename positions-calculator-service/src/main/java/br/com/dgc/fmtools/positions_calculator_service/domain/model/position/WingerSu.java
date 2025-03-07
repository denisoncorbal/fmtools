package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WingerSu extends Position {

  public WingerSu(LinePlayer player) {
    super(
        "Winger (Su)",
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getWorkRate(),
            player.getAgility(),
            player.getStamina()),
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getPace()));
  }
}
