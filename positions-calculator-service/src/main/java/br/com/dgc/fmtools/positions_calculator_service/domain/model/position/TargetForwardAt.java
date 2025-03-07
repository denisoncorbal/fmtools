package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class TargetForwardAt extends Position {

  public TargetForwardAt(LinePlayer player) {
    super(
        "Target Forward (At)",
        List.of(
            player.getFirstTouch(),
            player.getAggression(),
            player.getAnticipation(),
            player.getDecisions(),
            player.getTeamwork()),
        List.of(
            player.getFinishing(),
            player.getHeading(),
            player.getBravery(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
