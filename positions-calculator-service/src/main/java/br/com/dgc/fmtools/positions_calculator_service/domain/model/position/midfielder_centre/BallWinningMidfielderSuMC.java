package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class BallWinningMidfielderSuMC extends Position {

  public BallWinningMidfielderSuMC(LinePlayer player) {
    super(
        PositionNames.BALL_WINNING_MIDFIELDER_SU_MC_NAME,
        List.of(
            player.getMarking() * MidfielderCentreWeights.MARKING,
            player.getPassing() * MidfielderCentreWeights.PASSING,
            player.getBravery() * MidfielderCentreWeights.BRAVERY,
            player.getConcentration() * MidfielderCentreWeights.CONCENTRATION,
            player.getAgility() * MidfielderCentreWeights.AGILITY,
            player.getPace() * MidfielderCentreWeights.PACE,
            player.getStrength() * MidfielderCentreWeights.STRENGTH),
        List.of(
            player.getTackling() * MidfielderCentreWeights.TACKLING * 2,
            player.getAggression() * MidfielderCentreWeights.AGGRESSION * 2,
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION * 2,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK * 2,
            player.getWorkRate() * MidfielderCentreWeights.WORK_RATE * 2,
            player.getStamina() * MidfielderCentreWeights.STAMINA * 2),
        List.of(
                MidfielderCentreWeights.MARKING,
                MidfielderCentreWeights.PASSING,
                MidfielderCentreWeights.BRAVERY,
                MidfielderCentreWeights.CONCENTRATION,
                MidfielderCentreWeights.AGILITY,
                MidfielderCentreWeights.PACE,
                MidfielderCentreWeights.STRENGTH,
                MidfielderCentreWeights.TACKLING * 2,
                MidfielderCentreWeights.AGGRESSION * 2,
                MidfielderCentreWeights.ANTICIPATION * 2,
                MidfielderCentreWeights.TEAMWORK * 2,
                MidfielderCentreWeights.WORK_RATE * 2,
                MidfielderCentreWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
