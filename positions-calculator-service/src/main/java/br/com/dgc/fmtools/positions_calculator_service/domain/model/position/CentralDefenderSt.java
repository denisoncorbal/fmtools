package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CentralDefenderSt extends Position {

  public CentralDefenderSt(LinePlayer player) {
    super(
        "Central Defender (St)",
        List.of(
            player.getMarking(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration()),
        List.of(
            player.getHeading(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getDecisions(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
