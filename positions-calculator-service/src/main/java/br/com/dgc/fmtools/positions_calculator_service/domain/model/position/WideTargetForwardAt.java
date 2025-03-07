package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WideTargetForwardAt extends Position {

  public WideTargetForwardAt(LinePlayer player) {
    super(
        "Wide Target Forward (At)",
        List.of(
            player.getCrossing(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getAnticipation(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getBalance(),
            player.getStamina()),
        List.of(
            player.getHeading(),
            player.getBravery(),
            player.getOffTheBall(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
