package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class DefensiveWingerDeMRL extends Position {

  public DefensiveWingerDeMRL(LinePlayer player) {
    super(
        PositionNames.DEFENSIVE_WINGER_DE_MRL_NAME,
        List.of(
            player.getCrossing() * MidfielderRightLeftWeights.CROSSING,
            player.getDribbling() * MidfielderRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH,
            player.getMarking() * MidfielderRightLeftWeights.MARKING,
            player.getTackling() * MidfielderRightLeftWeights.TACKLING,
            player.getAggression() * MidfielderRightLeftWeights.AGGRESSION,
            player.getConcentration() * MidfielderRightLeftWeights.CONCENTRATION,
            player.getDecisions() * MidfielderRightLeftWeights.DECISIONS,
            player.getAcceleration() * MidfielderRightLeftWeights.ACCELERATION),
        List.of(
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getAnticipation() * MidfielderRightLeftWeights.ANTICIPATION * 2,
            player.getOffTheBall() * MidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getPositioning() * MidfielderRightLeftWeights.POSITIONING * 2,
            player.getTeamwork() * MidfielderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * MidfielderRightLeftWeights.WORK_RATE * 2,
            player.getStamina() * MidfielderRightLeftWeights.STAMINA * 2),
        List.of(
                MidfielderRightLeftWeights.CROSSING,
                MidfielderRightLeftWeights.DRIBBLING,
                MidfielderRightLeftWeights.FIRST_TOUCH,
                MidfielderRightLeftWeights.MARKING,
                MidfielderRightLeftWeights.TACKLING,
                MidfielderRightLeftWeights.AGGRESSION,
                MidfielderRightLeftWeights.CONCENTRATION,
                MidfielderRightLeftWeights.DECISIONS,
                MidfielderRightLeftWeights.ACCELERATION,
                MidfielderRightLeftWeights.TECHNIQUE * 2,
                MidfielderRightLeftWeights.ANTICIPATION * 2,
                MidfielderRightLeftWeights.OFF_THE_BALL * 2,
                MidfielderRightLeftWeights.POSITIONING * 2,
                MidfielderRightLeftWeights.TEAMWORK * 2,
                MidfielderRightLeftWeights.WORK_RATE * 2,
                MidfielderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
