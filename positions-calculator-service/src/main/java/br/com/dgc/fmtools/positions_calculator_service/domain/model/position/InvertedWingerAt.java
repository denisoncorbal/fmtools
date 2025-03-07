package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InvertedWingerAt extends Position {

  public InvertedWingerAt(LinePlayer player) {
    super(
        "Inverted Winger (At)",
        List.of(
            player.getCrossing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getFlair(),
            player.getVision(),
            player.getPace()),
        List.of(
            player.getDribbling(),
            player.getPassing(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility()));
  }
}
