package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class NoNonsenseCentreBackCo extends Position {

  public NoNonsenseCentreBackCo(LinePlayer player) {
    super(
        "No-Nonsense Centre-Back (Co)",
        List.of(
            player.getHeading(),
            player.getBravery(),
            player.getJumpingReach(),
            player.getStrength()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning(),
            player.getPace()));
  }
}
