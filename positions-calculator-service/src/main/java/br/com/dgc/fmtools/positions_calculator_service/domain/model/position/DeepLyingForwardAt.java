package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class DeepLyingForwardAt extends Position {

  public DeepLyingForwardAt(LinePlayer player) {
    super(
        "Deep Lying Forward (At)",
        List.of(
            player.getDribbling(),
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
