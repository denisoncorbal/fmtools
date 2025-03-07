package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class AdvancedPlaymakerAt extends Position {

  public AdvancedPlaymakerAt(LinePlayer player) {
    super(
        "Advanced Playmaker (At)",
        List.of(
            player.getAnticipation(),
            player.getFlair(),
            player.getAcceleration(),
            player.getAgility()),
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getVision()));
  }
}
