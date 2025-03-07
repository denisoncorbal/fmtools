package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CompleteForwardSu extends Position {

  public CompleteForwardSu(LinePlayer player) {
    super(
        "Complete Forward (Su)",
        List.of(
            player.getFinishing(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getPace(),
            player.getStamina()),
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getHeading(),
            player.getLongShots(),
            player.getPassing(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getVision(),
            player.getAcceleration(),
            player.getAgility(),
            player.getStrength()));
  }
}
