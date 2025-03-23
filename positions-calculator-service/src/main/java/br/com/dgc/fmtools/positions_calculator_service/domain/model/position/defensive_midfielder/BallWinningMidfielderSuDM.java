package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class BallWinningMidfielderSuDM extends Position {

  public BallWinningMidfielderSuDM(LinePlayer player) {
    super(
        PositionNames.BALL_WINNING_MIDFIELDER_SU_DM_NAME,
        List.of(
            player.getMarking() * DefensiveMidfielderWeights.MARKING,
            player.getPassing() * DefensiveMidfielderWeights.PASSING,
            player.getBravery() * DefensiveMidfielderWeights.BRAVERY,
            player.getConcentration() * DefensiveMidfielderWeights.CONCENTRATION,
            player.getAgility() * DefensiveMidfielderWeights.AGILITY,
            player.getPace() * DefensiveMidfielderWeights.PACE,
            player.getStrength() * DefensiveMidfielderWeights.STRENGTH),
        List.of(
            player.getTackling() * DefensiveMidfielderWeights.TACKLING * 2,
            player.getAggression() * DefensiveMidfielderWeights.AGGRESSION * 2,
            player.getAnticipation() * DefensiveMidfielderWeights.ANTICIPATION * 2,
            player.getTeamwork() * DefensiveMidfielderWeights.TEAMWORK * 2,
            player.getWorkRate() * DefensiveMidfielderWeights.WORK_RATE * 2,
            player.getStamina() * DefensiveMidfielderWeights.STAMINA * 2),
        List.of(
                DefensiveMidfielderWeights.MARKING,
                DefensiveMidfielderWeights.PASSING,
                DefensiveMidfielderWeights.BRAVERY,
                DefensiveMidfielderWeights.CONCENTRATION,
                DefensiveMidfielderWeights.AGILITY,
                DefensiveMidfielderWeights.PACE,
                DefensiveMidfielderWeights.STRENGTH,
                DefensiveMidfielderWeights.TACKLING * 2,
                DefensiveMidfielderWeights.AGGRESSION * 2,
                DefensiveMidfielderWeights.ANTICIPATION * 2,
                DefensiveMidfielderWeights.TEAMWORK * 2,
                DefensiveMidfielderWeights.WORK_RATE * 2,
                DefensiveMidfielderWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
