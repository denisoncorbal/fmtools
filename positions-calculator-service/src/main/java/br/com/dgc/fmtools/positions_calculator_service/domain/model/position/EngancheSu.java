package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class EngancheSu extends Position {

  public EngancheSu(LinePlayer player) {
    super(
        "Enganche (Su)",
        List.of(
            player.getDribbling(),
            player.getAnticipation(),
            player.getFlair(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getAgility()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getVision()));
  }
}
