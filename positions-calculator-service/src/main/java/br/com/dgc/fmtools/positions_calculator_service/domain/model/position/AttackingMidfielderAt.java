package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class AttackingMidfielderAt extends Position {

  public AttackingMidfielderAt(LinePlayer player) {
    super(
        "Attacking Midfielder (At)",
        List.of(
            player.getFinishing(), player.getComposure(), player.getVision(), player.getAgility()),
        List.of(
            player.getDribbling(),
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
