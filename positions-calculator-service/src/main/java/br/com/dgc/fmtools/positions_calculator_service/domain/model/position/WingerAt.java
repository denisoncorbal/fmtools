package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WingerAt extends Position {

  public WingerAt(LinePlayer player) {
    super(
        "Winger (At)",
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getAnticipation(),
            player.getFlair(),
            player.getAgility()),
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getPace()));
  }
}
