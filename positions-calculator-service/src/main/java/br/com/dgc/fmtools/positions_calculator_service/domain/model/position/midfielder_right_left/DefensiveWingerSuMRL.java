package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class DefensiveWingerSuMRL extends Position {

  public DefensiveWingerSuMRL(LinePlayer player) {
    super(
        PositionNames.DEFENSIVE_WINGER_SU_MRL_NAME,
        List.of(
            player.getDribbling() * MidfielderRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH,
            player.getMarking() * MidfielderRightLeftWeights.MARKING,
            player.getPassing() * MidfielderRightLeftWeights.PASSING,
            player.getTackling() * MidfielderRightLeftWeights.TACKLING,
            player.getAggression() * MidfielderRightLeftWeights.AGGRESSION,
            player.getAnticipation() * MidfielderRightLeftWeights.ANTICIPATION,
            player.getComposure() * MidfielderRightLeftWeights.COMPOSURE,
            player.getConcentration() * MidfielderRightLeftWeights.CONCENTRATION,
            player.getDecisions() * MidfielderRightLeftWeights.DECISIONS,
            player.getPositioning() * MidfielderRightLeftWeights.POSITIONING,
            player.getAcceleration() * MidfielderRightLeftWeights.ACCELERATION),
        List.of(
            player.getCrossing() * MidfielderRightLeftWeights.CROSSING * 2,
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getOffTheBall() * MidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * MidfielderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * MidfielderRightLeftWeights.WORK_RATE * 2,
            player.getStamina() * MidfielderRightLeftWeights.STAMINA * 2),
        List.of(
                MidfielderRightLeftWeights.DRIBBLING,
                MidfielderRightLeftWeights.FIRST_TOUCH,
                MidfielderRightLeftWeights.MARKING,
                MidfielderRightLeftWeights.PASSING,
                MidfielderRightLeftWeights.TACKLING,
                MidfielderRightLeftWeights.AGGRESSION,
                MidfielderRightLeftWeights.ANTICIPATION,
                MidfielderRightLeftWeights.COMPOSURE,
                MidfielderRightLeftWeights.CONCENTRATION,
                MidfielderRightLeftWeights.DECISIONS,
                MidfielderRightLeftWeights.POSITIONING,
                MidfielderRightLeftWeights.ACCELERATION,
                MidfielderRightLeftWeights.CROSSING * 2,
                MidfielderRightLeftWeights.TECHNIQUE * 2,
                MidfielderRightLeftWeights.OFF_THE_BALL * 2,
                MidfielderRightLeftWeights.TEAMWORK * 2,
                MidfielderRightLeftWeights.WORK_RATE * 2,
                MidfielderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
