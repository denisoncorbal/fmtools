package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class BallPlayingDefenderDe extends Position {

  public BallPlayingDefenderDe(LinePlayer player) {
    super(
        "Ball Playing Defender (De)",
        List.of(
            player.getFirstTouch(),
            player.getTechnique(),
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getConcentration(),
            player.getDecisions(),
            player.getVision(),
            player.getPace()),
        List.of(
            player.getHeading(),
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getComposure(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStrength()));
  }
}
