package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class TargetForwardSu extends Position {

  public TargetForwardSu(LinePlayer player) {
    super(
        "Target Forward (Su)",
        List.of(
            player.getFinishing(),
            player.getFirstTouch(),
            player.getAggression(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall()),
        List.of(
            player.getHeading(),
            player.getBravery(),
            player.getTeamwork(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
