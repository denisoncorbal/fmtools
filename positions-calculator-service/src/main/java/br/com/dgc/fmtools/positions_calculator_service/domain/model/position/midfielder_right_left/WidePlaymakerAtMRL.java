package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WidePlaymakerAtMRL extends Position {

  public WidePlaymakerAtMRL(LinePlayer player) {
    super(
        PositionNames.WIDE_PLAYMAKER_AT_MRL_NAME,
        List.of(
            player.getAnticipation() * MidfielderRightLeftWeights.ANTICIPATION,
            player.getFlair() * MidfielderRightLeftWeights.FLAIR,
            player.getAcceleration() * MidfielderRightLeftWeights.ACCELERATION,
            player.getAgility() * MidfielderRightLeftWeights.AGILITY),
        List.of(
            player.getDribbling() * MidfielderRightLeftWeights.DRIBBLING * 2,
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH * 2,
            player.getPassing() * MidfielderRightLeftWeights.PASSING * 2,
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getComposure() * MidfielderRightLeftWeights.COMPOSURE * 2,
            player.getDecisions() * MidfielderRightLeftWeights.DECISIONS * 2,
            player.getOffTheBall() * MidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * MidfielderRightLeftWeights.TEAMWORK * 2,
            player.getVision() * MidfielderRightLeftWeights.VISION * 2),
        List.of(
                MidfielderRightLeftWeights.ANTICIPATION,
                MidfielderRightLeftWeights.FLAIR,
                MidfielderRightLeftWeights.ACCELERATION,
                MidfielderRightLeftWeights.AGILITY,
                MidfielderRightLeftWeights.DRIBBLING * 2,
                MidfielderRightLeftWeights.FIRST_TOUCH * 2,
                MidfielderRightLeftWeights.PASSING * 2,
                MidfielderRightLeftWeights.TECHNIQUE * 2,
                MidfielderRightLeftWeights.COMPOSURE * 2,
                MidfielderRightLeftWeights.DECISIONS * 2,
                MidfielderRightLeftWeights.OFF_THE_BALL * 2,
                MidfielderRightLeftWeights.TEAMWORK * 2,
                MidfielderRightLeftWeights.VISION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
