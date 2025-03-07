package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class NoNonsenseCentreBackSt extends Position {

  public NoNonsenseCentreBackSt(LinePlayer player) {
    super(
        "No-Nonsense Centre-Back (St)",
        List.of(player.getMarking(), player.getAnticipation(), player.getConcentration()),
        List.of(
            player.getHeading(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
