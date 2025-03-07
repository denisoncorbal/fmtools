package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CompleteForwardAt extends Position {

  public CompleteForwardAt(LinePlayer player) {
    super(
        "Complete Forward (At)",
        List.of(
            player.getLongShots(),
            player.getPassing(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getPace(),
            player.getStamina()),
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getHeading(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility(),
            player.getStrength()));
  }
}
