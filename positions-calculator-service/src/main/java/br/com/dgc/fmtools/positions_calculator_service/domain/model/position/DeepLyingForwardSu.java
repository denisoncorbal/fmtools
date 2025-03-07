package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class DeepLyingForwardSu extends Position {

  public DeepLyingForwardSu(LinePlayer player) {
    super(
        "Deep Lying Forward (Su)",
        List.of(
            player.getFinishing(),
            player.getAnticipation(),
            player.getFlair(),
            player.getVision(),
            player.getBalance(),
            player.getStrength()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork()));
  }
}
