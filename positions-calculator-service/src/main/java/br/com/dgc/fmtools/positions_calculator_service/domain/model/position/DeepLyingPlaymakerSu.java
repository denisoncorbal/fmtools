package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class DeepLyingPlaymakerSu extends Position {

  public DeepLyingPlaymakerSu(LinePlayer player) {
    super(
        "Deep Lying Playmaker (Su)",
        List.of(
            player.getAnticipation(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getBalance()),
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
