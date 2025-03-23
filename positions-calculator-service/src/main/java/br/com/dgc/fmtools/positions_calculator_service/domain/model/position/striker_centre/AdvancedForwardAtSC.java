package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class AdvancedForwardAtSC extends Position {

  public AdvancedForwardAtSC(LinePlayer player) {
    super(
        PositionNames.ADVANCED_FORWARD_AT_SC_NAME,
        List.of(
            player.getPassing() * StrikerCentreWeights.PASSING,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION,
            player.getDecisions() * StrikerCentreWeights.DECISIONS,
            player.getWorkRate() * StrikerCentreWeights.WORK_RATE,
            player.getAgility() * StrikerCentreWeights.AGILITY,
            player.getBalance() * StrikerCentreWeights.BALANCE,
            player.getPace() * StrikerCentreWeights.PACE,
            player.getStamina() * StrikerCentreWeights.STAMINA),
        List.of(
            player.getDribbling() * StrikerCentreWeights.DRIBBLING * 2,
            player.getFinishing() * StrikerCentreWeights.FINISHING * 2,
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH * 2,
            player.getTechnique() * StrikerCentreWeights.TECHNIQUE * 2,
            player.getComposure() * StrikerCentreWeights.COMPOSURE * 2,
            player.getOffTheBall() * StrikerCentreWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * StrikerCentreWeights.ACCELERATION * 2),
        List.of(
                StrikerCentreWeights.PASSING,
                StrikerCentreWeights.ANTICIPATION,
                StrikerCentreWeights.DECISIONS,
                StrikerCentreWeights.WORK_RATE,
                StrikerCentreWeights.AGILITY,
                StrikerCentreWeights.BALANCE,
                StrikerCentreWeights.PACE,
                StrikerCentreWeights.STAMINA,
                StrikerCentreWeights.DRIBBLING * 2,
                StrikerCentreWeights.FINISHING * 2,
                StrikerCentreWeights.FIRST_TOUCH * 2,
                StrikerCentreWeights.TECHNIQUE * 2,
                StrikerCentreWeights.COMPOSURE * 2,
                StrikerCentreWeights.OFF_THE_BALL * 2,
                StrikerCentreWeights.ACCELERATION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
