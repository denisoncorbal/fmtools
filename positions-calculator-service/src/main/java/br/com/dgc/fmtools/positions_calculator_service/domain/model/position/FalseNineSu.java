package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class FalseNineSu extends Position {

  public FalseNineSu(LinePlayer player) {
    super(
        "False Nine (Su)",
        List.of(
            player.getFinishing(),
            player.getAnticipation(),
            player.getFlair(),
            player.getTeamwork(),
            player.getBalance()),
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getVision(),
            player.getAcceleration(),
            player.getAgility()));
  }
}
