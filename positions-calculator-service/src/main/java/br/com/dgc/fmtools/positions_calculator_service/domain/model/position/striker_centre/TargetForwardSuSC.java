package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class TargetForwardSuSC extends Position {

  public TargetForwardSuSC(LinePlayer player) {
    super(
        PositionNames.TARGET_FORWARD_SU_SC_NAME,
        List.of(
            player.getFinishing() * StrikerCentreWeights.FINISHING,
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH,
            player.getAggression() * StrikerCentreWeights.AGGRESSION,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION,
            player.getComposure() * StrikerCentreWeights.COMPOSURE,
            player.getDecisions() * StrikerCentreWeights.DECISIONS,
            player.getOffTheBall() * StrikerCentreWeights.OFF_THE_BALL),
        List.of(
            player.getHeading() * StrikerCentreWeights.HEADING * 2,
            player.getBravery() * StrikerCentreWeights.BRAVERY * 2,
            player.getTeamwork() * StrikerCentreWeights.TEAMWORK * 2,
            player.getBalance() * StrikerCentreWeights.BALANCE * 2,
            player.getJumpingReach() * StrikerCentreWeights.JUMPING_REACH * 2,
            player.getStrength() * StrikerCentreWeights.STRENGTH * 2),
        List.of(
                StrikerCentreWeights.FINISHING,
                StrikerCentreWeights.FIRST_TOUCH,
                StrikerCentreWeights.AGGRESSION,
                StrikerCentreWeights.ANTICIPATION,
                StrikerCentreWeights.COMPOSURE,
                StrikerCentreWeights.DECISIONS,
                StrikerCentreWeights.OFF_THE_BALL,
                StrikerCentreWeights.HEADING * 2,
                StrikerCentreWeights.BRAVERY * 2,
                StrikerCentreWeights.TEAMWORK * 2,
                StrikerCentreWeights.BALANCE * 2,
                StrikerCentreWeights.JUMPING_REACH * 2,
                StrikerCentreWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
