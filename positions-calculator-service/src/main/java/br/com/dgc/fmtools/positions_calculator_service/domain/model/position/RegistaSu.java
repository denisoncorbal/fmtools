package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class RegistaSu extends Position {

  public RegistaSu(LinePlayer player) {
    super(
        "Regista (Su)",
        List.of(
            player.getDribbling(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getBalance()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getFlair(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getVision()));
  }
}
