package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class LiberoSu extends Position {

  public LiberoSu(LinePlayer player) {
    super(
        "Libero (Su)",
        List.of(
            player.getDribbling(),
            player.getHeading(),
            player.getTechnique(),
            player.getBravery(),
            player.getFlair(),
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
            player.getPositioning(),
            player.getTeamwork(),
            player.getVision(),
            player.getPace()));
  }
}
