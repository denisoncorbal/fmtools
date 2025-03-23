package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class PressingForwardDeSC extends Position {

  public PressingForwardDeSC(LinePlayer player) {
    super(
        PositionNames.PRESSING_FORWARD_DE_SC_NAME,
        List.of(
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH,
            player.getComposure() * StrikerCentreWeights.COMPOSURE,
            player.getConcentration() * StrikerCentreWeights.CONCENTRATION,
            player.getAgility() * StrikerCentreWeights.AGILITY,
            player.getBalance() * StrikerCentreWeights.BALANCE,
            player.getStrength() * StrikerCentreWeights.STRENGTH),
        List.of(
            player.getAggression() * StrikerCentreWeights.AGGRESSION * 2,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION * 2,
            player.getBravery() * StrikerCentreWeights.BRAVERY * 2,
            player.getDecisions() * StrikerCentreWeights.DECISIONS * 2,
            player.getTeamwork() * StrikerCentreWeights.TEAMWORK * 2,
            player.getWorkRate() * StrikerCentreWeights.WORK_RATE * 2,
            player.getAcceleration() * StrikerCentreWeights.ACCELERATION * 2,
            player.getPace() * StrikerCentreWeights.PACE * 2,
            player.getStamina() * StrikerCentreWeights.STAMINA * 2),
        List.of(
                StrikerCentreWeights.FIRST_TOUCH,
                StrikerCentreWeights.COMPOSURE,
                StrikerCentreWeights.CONCENTRATION,
                StrikerCentreWeights.AGILITY,
                StrikerCentreWeights.BALANCE,
                StrikerCentreWeights.STRENGTH,
                StrikerCentreWeights.AGGRESSION * 2,
                StrikerCentreWeights.ANTICIPATION * 2,
                StrikerCentreWeights.BRAVERY * 2,
                StrikerCentreWeights.DECISIONS * 2,
                StrikerCentreWeights.TEAMWORK * 2,
                StrikerCentreWeights.WORK_RATE * 2,
                StrikerCentreWeights.ACCELERATION * 2,
                StrikerCentreWeights.PACE * 2,
                StrikerCentreWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
