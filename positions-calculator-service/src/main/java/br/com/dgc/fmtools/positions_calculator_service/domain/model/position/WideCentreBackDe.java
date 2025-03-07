package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WideCentreBackDe extends Position {

  public WideCentreBackDe(LinePlayer player) {
    super(
        "Wide Centre-Back (De)",
        List.of(
            player.getDribbling(),
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getWorkRate(),
            player.getPace()),
        List.of(
            player.getCrossing(),
            player.getHeading(),
            player.getMarking(),
            player.getTackling(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStamina(),
            player.getStrength()));
  }
}
