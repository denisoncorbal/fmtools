package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WidePlaymakerSu extends Position {

  public WidePlaymakerSu(LinePlayer player) {
    super(
        "Wide Playmaker (Su)",
        List.of(player.getDribbling(), player.getOffTheBall(), player.getAgility()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getVision()));
  }
}
