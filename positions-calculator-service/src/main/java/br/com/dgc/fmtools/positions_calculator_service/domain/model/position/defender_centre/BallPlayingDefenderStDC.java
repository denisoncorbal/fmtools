package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class BallPlayingDefenderStDC extends Position {

  public BallPlayingDefenderStDC(LinePlayer player) {
    super(
        PositionNames.BALL_PLAYING_DEFENDER_ST_DC_NAME,
        List.of(
            player.getFirstTouch() * DefenderCentreWeights.FIRST_TOUCH,
            player.getMarking() * DefenderCentreWeights.MARKING,
            player.getTechnique() * DefenderCentreWeights.TECHNIQUE,
            player.getAnticipation() * DefenderCentreWeights.ANTICIPATION,
            player.getConcentration() * DefenderCentreWeights.CONCENTRATION,
            player.getVision() * DefenderCentreWeights.VISION),
        List.of(
            player.getHeading() * DefenderCentreWeights.HEADING * 2,
            player.getPassing() * DefenderCentreWeights.PASSING * 2,
            player.getTackling() * DefenderCentreWeights.TACKLING * 2,
            player.getAggression() * DefenderCentreWeights.AGGRESSION * 2,
            player.getBravery() * DefenderCentreWeights.BRAVERY * 2,
            player.getComposure() * DefenderCentreWeights.COMPOSURE * 2,
            player.getDecisions() * DefenderCentreWeights.DECISIONS * 2,
            player.getPositioning() * DefenderCentreWeights.POSITIONING * 2,
            player.getJumpingReach() * DefenderCentreWeights.JUMPING_REACH * 2,
            player.getStrength() * DefenderCentreWeights.STRENGTH * 2),
        List.of(
                DefenderCentreWeights.FIRST_TOUCH,
                DefenderCentreWeights.MARKING,
                DefenderCentreWeights.TECHNIQUE,
                DefenderCentreWeights.ANTICIPATION,
                DefenderCentreWeights.CONCENTRATION,
                DefenderCentreWeights.VISION,
                DefenderCentreWeights.HEADING * 2,
                DefenderCentreWeights.PASSING * 2,
                DefenderCentreWeights.TACKLING * 2,
                DefenderCentreWeights.AGGRESSION * 2,
                DefenderCentreWeights.BRAVERY * 2,
                DefenderCentreWeights.COMPOSURE * 2,
                DefenderCentreWeights.DECISIONS * 2,
                DefenderCentreWeights.POSITIONING * 2,
                DefenderCentreWeights.JUMPING_REACH * 2,
                DefenderCentreWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
