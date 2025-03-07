package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class BallPlayingDefenderCo extends Position {

  public BallPlayingDefenderCo(LinePlayer player) {
    super(
        "Ball Playing Defender (Co)",
        List.of(
            player.getFirstTouch(),
            player.getHeading(),
            player.getTechnique(),
            player.getBravery(),
            player.getVision(),
            player.getJumpingReach(),
            player.getStrength()),
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getPace()));
  }
}
