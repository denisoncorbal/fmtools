package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class TargetForwardAtSC extends Position {

  public TargetForwardAtSC(LinePlayer player) {
    super(
        PositionNames.TARGET_FORWARD_AT_SC_NAME,
        List.of(
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH,
            player.getAggression() * StrikerCentreWeights.AGGRESSION,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION,
            player.getDecisions() * StrikerCentreWeights.DECISIONS,
            player.getTeamwork() * StrikerCentreWeights.TEAMWORK),
        List.of(
            player.getFinishing() * StrikerCentreWeights.FINISHING * 2,
            player.getHeading() * StrikerCentreWeights.HEADING * 2,
            player.getBravery() * StrikerCentreWeights.BRAVERY * 2,
            player.getComposure() * StrikerCentreWeights.COMPOSURE * 2,
            player.getOffTheBall() * StrikerCentreWeights.OFF_THE_BALL * 2,
            player.getBalance() * StrikerCentreWeights.BALANCE * 2,
            player.getJumpingReach() * StrikerCentreWeights.JUMPING_REACH * 2,
            player.getStrength() * StrikerCentreWeights.STRENGTH * 2),
        List.of(
                StrikerCentreWeights.FIRST_TOUCH,
                StrikerCentreWeights.AGGRESSION,
                StrikerCentreWeights.ANTICIPATION,
                StrikerCentreWeights.DECISIONS,
                StrikerCentreWeights.TEAMWORK,
                StrikerCentreWeights.FINISHING * 2,
                StrikerCentreWeights.HEADING * 2,
                StrikerCentreWeights.BRAVERY * 2,
                StrikerCentreWeights.COMPOSURE * 2,
                StrikerCentreWeights.OFF_THE_BALL * 2,
                StrikerCentreWeights.BALANCE * 2,
                StrikerCentreWeights.JUMPING_REACH * 2,
                StrikerCentreWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
