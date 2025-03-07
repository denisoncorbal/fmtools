package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class NoNonsenseCentreBackDe extends Position {

  public NoNonsenseCentreBackDe(LinePlayer player) {
    super(
        "No-Nonsense Centre-Back (De)",
        List.of(
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getConcentration(),
            player.getPace()),
        List.of(
            player.getHeading(),
            player.getMarking(),
            player.getTackling(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
