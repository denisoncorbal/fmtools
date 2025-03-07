package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CentralDefenderCo extends Position {

  public CentralDefenderCo(LinePlayer player) {
    super(
        "Central Defender (Co)",
        List.of(
            player.getHeading(),
            player.getBravery(),
            player.getComposure(),
            player.getJumpingReach(),
            player.getStrength()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getPace()));
  }
}
