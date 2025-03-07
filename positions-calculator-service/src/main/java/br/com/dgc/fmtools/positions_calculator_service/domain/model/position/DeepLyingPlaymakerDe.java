package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class DeepLyingPlaymakerDe extends Position {

  public DeepLyingPlaymakerDe(LinePlayer player) {
    super(
        "Deep Lying Playmaker (De)",
        List.of(
            player.getTackling(),
            player.getAnticipation(),
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
