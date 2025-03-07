package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class AttackingMidfielderSu extends Position {

  public AttackingMidfielderSu(LinePlayer player) {
    super(
        "Attacking Midfielder (Su)",
        List.of(
            player.getDribbling(), player.getComposure(), player.getVision(), player.getAgility()),
        List.of(
            player.getFirstTouch(),
            player.getLongShots(),
            player.getPassing(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getDecisions(),
            player.getFlair(),
            player.getOffTheBall()));
  }
}
