package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class LiberoAt extends Position {

  public LiberoAt(LinePlayer player) {
    super(
        "Libero (At)",
        List.of(
            player.getHeading(),
            player.getLongShots(),
            player.getTechnique(),
            player.getBravery(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getStamina(),
            player.getStrength()),
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getFlair(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getVision(),
            player.getPace()));
  }
}
