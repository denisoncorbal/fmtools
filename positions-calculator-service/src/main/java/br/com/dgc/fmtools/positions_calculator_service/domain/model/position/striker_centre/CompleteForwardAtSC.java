package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class CompleteForwardAtSC extends Position {

  public CompleteForwardAtSC(LinePlayer player) {
    super(
        PositionNames.COMPLETE_FORWARD_AT_SC_NAME,
        List.of(
            player.getLongShots() * StrikerCentreWeights.LONG_SHOTS,
            player.getPassing() * StrikerCentreWeights.PASSING,
            player.getDecisions() * StrikerCentreWeights.DECISIONS,
            player.getTeamwork() * StrikerCentreWeights.TEAMWORK,
            player.getVision() * StrikerCentreWeights.VISION,
            player.getWorkRate() * StrikerCentreWeights.WORK_RATE,
            player.getBalance() * StrikerCentreWeights.BALANCE,
            player.getJumpingReach() * StrikerCentreWeights.JUMPING_REACH,
            player.getPace() * StrikerCentreWeights.PACE,
            player.getStamina() * StrikerCentreWeights.STAMINA),
        List.of(
            player.getDribbling() * StrikerCentreWeights.DRIBBLING * 2,
            player.getFinishing() * StrikerCentreWeights.FINISHING * 2,
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH * 2,
            player.getHeading() * StrikerCentreWeights.HEADING * 2,
            player.getTechnique() * StrikerCentreWeights.TECHNIQUE * 2,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION * 2,
            player.getComposure() * StrikerCentreWeights.COMPOSURE * 2,
            player.getOffTheBall() * StrikerCentreWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * StrikerCentreWeights.ACCELERATION * 2,
            player.getAgility() * StrikerCentreWeights.AGILITY * 2,
            player.getStrength() * StrikerCentreWeights.STRENGTH * 2),
        List.of(
                StrikerCentreWeights.LONG_SHOTS,
                StrikerCentreWeights.PASSING,
                StrikerCentreWeights.DECISIONS,
                StrikerCentreWeights.TEAMWORK,
                StrikerCentreWeights.VISION,
                StrikerCentreWeights.WORK_RATE,
                StrikerCentreWeights.BALANCE,
                StrikerCentreWeights.JUMPING_REACH,
                StrikerCentreWeights.PACE,
                StrikerCentreWeights.STAMINA,
                StrikerCentreWeights.DRIBBLING * 2,
                StrikerCentreWeights.FINISHING * 2,
                StrikerCentreWeights.FIRST_TOUCH * 2,
                StrikerCentreWeights.HEADING * 2,
                StrikerCentreWeights.TECHNIQUE * 2,
                StrikerCentreWeights.ANTICIPATION * 2,
                StrikerCentreWeights.COMPOSURE * 2,
                StrikerCentreWeights.OFF_THE_BALL * 2,
                StrikerCentreWeights.ACCELERATION * 2,
                StrikerCentreWeights.AGILITY * 2,
                StrikerCentreWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
