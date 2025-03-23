package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class BoxToBoxMidfielderSuMC extends Position {

  public BoxToBoxMidfielderSuMC(LinePlayer player) {
    super(
        PositionNames.BOX_TO_BOX_MIDFIELDER_SU_MC_NAME,
        List.of(
            player.getDribbling() * MidfielderCentreWeights.DRIBBLING,
            player.getFinishing() * MidfielderCentreWeights.FINISHING,
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH,
            player.getLongShots() * MidfielderCentreWeights.LONG_SHOTS,
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE,
            player.getAggression() * MidfielderCentreWeights.AGGRESSION,
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS,
            player.getPositioning() * MidfielderCentreWeights.POSITIONING,
            player.getAcceleration() * MidfielderCentreWeights.ACCELERATION,
            player.getBalance() * MidfielderCentreWeights.BALANCE,
            player.getPace() * MidfielderCentreWeights.PACE,
            player.getStrength() * MidfielderCentreWeights.STRENGTH),
        List.of(
            player.getPassing() * MidfielderCentreWeights.PASSING * 2,
            player.getTackling() * MidfielderCentreWeights.TACKLING * 2,
            player.getOffTheBall() * MidfielderCentreWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK * 2,
            player.getWorkRate() * MidfielderCentreWeights.WORK_RATE * 2,
            player.getStamina() * MidfielderCentreWeights.STAMINA * 2),
        List.of(
                MidfielderCentreWeights.DRIBBLING,
                MidfielderCentreWeights.FINISHING,
                MidfielderCentreWeights.FIRST_TOUCH,
                MidfielderCentreWeights.LONG_SHOTS,
                MidfielderCentreWeights.TECHNIQUE,
                MidfielderCentreWeights.AGGRESSION,
                MidfielderCentreWeights.ANTICIPATION,
                MidfielderCentreWeights.COMPOSURE,
                MidfielderCentreWeights.DECISIONS,
                MidfielderCentreWeights.POSITIONING,
                MidfielderCentreWeights.ACCELERATION,
                MidfielderCentreWeights.BALANCE,
                MidfielderCentreWeights.PACE,
                MidfielderCentreWeights.STRENGTH,
                MidfielderCentreWeights.PASSING * 2,
                MidfielderCentreWeights.TACKLING * 2,
                MidfielderCentreWeights.OFF_THE_BALL * 2,
                MidfielderCentreWeights.TEAMWORK * 2,
                MidfielderCentreWeights.WORK_RATE * 2,
                MidfielderCentreWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
