package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WideCentreBackAt extends Position {

  public WideCentreBackAt(LinePlayer player) {
    super(
        "Wide Centre-Back (At)",
        List.of(
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getWorkRate()),
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getHeading(),
            player.getMarking(),
            player.getTackling(),
            player.getOffTheBall(),
            player.getJumpingReach(),
            player.getPace(),
            player.getStamina(),
            player.getStrength()));
  }
}
