package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class InvertedWingerAtMRL extends Position {

  public InvertedWingerAtMRL(LinePlayer player) {
    super(
        PositionNames.INVERTED_WINGER_AT_MRL_NAME,
        List.of(
            player.getCrossing() * MidfielderRightLeftWeights.CROSSING,
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH,
            player.getLongShots() * MidfielderRightLeftWeights.LONG_SHOTS,
            player.getAnticipation() * MidfielderRightLeftWeights.ANTICIPATION,
            player.getComposure() * MidfielderRightLeftWeights.COMPOSURE,
            player.getDecisions() * MidfielderRightLeftWeights.DECISIONS,
            player.getFlair() * MidfielderRightLeftWeights.FLAIR,
            player.getVision() * MidfielderRightLeftWeights.VISION,
            player.getPace() * MidfielderRightLeftWeights.PACE),
        List.of(
            player.getDribbling() * MidfielderRightLeftWeights.DRIBBLING * 2,
            player.getPassing() * MidfielderRightLeftWeights.PASSING * 2,
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getOffTheBall() * MidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * MidfielderRightLeftWeights.ACCELERATION * 2,
            player.getAgility() * MidfielderRightLeftWeights.AGILITY * 2),
        List.of(
                MidfielderRightLeftWeights.CROSSING,
                MidfielderRightLeftWeights.FIRST_TOUCH,
                MidfielderRightLeftWeights.LONG_SHOTS,
                MidfielderRightLeftWeights.ANTICIPATION,
                MidfielderRightLeftWeights.COMPOSURE,
                MidfielderRightLeftWeights.DECISIONS,
                MidfielderRightLeftWeights.FLAIR,
                MidfielderRightLeftWeights.VISION,
                MidfielderRightLeftWeights.PACE,
                MidfielderRightLeftWeights.DRIBBLING * 2,
                MidfielderRightLeftWeights.PASSING * 2,
                MidfielderRightLeftWeights.TECHNIQUE * 2,
                MidfielderRightLeftWeights.OFF_THE_BALL * 2,
                MidfielderRightLeftWeights.ACCELERATION * 2,
                MidfielderRightLeftWeights.AGILITY * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
