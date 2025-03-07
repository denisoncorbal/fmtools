package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class BallPlayingDefenderSt extends Position {

  public BallPlayingDefenderSt(LinePlayer player) {
    super(
        "Ball Playing Defender (St)",
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getVision()),
        List.of(
            player.getHeading(),
            player.getPassing(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getComposure(),
            player.getDecisions(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
