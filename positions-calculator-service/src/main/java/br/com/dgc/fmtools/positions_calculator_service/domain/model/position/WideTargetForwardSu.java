package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WideTargetForwardSu extends Position {

  public WideTargetForwardSu(LinePlayer player) {
    super(
        "Wide Target Forward (Su)",
        List.of(
            player.getCrossing(),
            player.getFirstTouch(),
            player.getAnticipation(),
            player.getOffTheBall(),
            player.getWorkRate(),
            player.getBalance(),
            player.getStamina()),
        List.of(
            player.getHeading(),
            player.getBravery(),
            player.getTeamwork(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
