package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InvertedWingerSu extends Position {

  public InvertedWingerSu(LinePlayer player) {
    super(
        "Inverted Winger (Su)",
        List.of(
            player.getCrossing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getComposure(),
            player.getDecisions(),
            player.getVision(),
            player.getWorkRate(),
            player.getAgility(),
            player.getPace(),
            player.getStamina()),
        List.of(
            player.getDribbling(),
            player.getPassing(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration()));
  }
}
