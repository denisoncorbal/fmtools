package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WideCentreBackDeDC extends Position {

  public WideCentreBackDeDC(LinePlayer player) {
    super(
        PositionNames.WIDE_CENTRE_BACK_DE_DC_NAME,
        List.of(
            player.getDribbling() * DefenderCentreWeights.DRIBBLING,
            player.getAggression() * DefenderCentreWeights.AGGRESSION,
            player.getAnticipation() * DefenderCentreWeights.ANTICIPATION,
            player.getBravery() * DefenderCentreWeights.BRAVERY,
            player.getComposure() * DefenderCentreWeights.COMPOSURE,
            player.getConcentration() * DefenderCentreWeights.CONCENTRATION,
            player.getDecisions() * DefenderCentreWeights.DECISIONS,
            player.getWorkRate() * DefenderCentreWeights.WORK_RATE,
            player.getPace() * DefenderCentreWeights.PACE),
        List.of(
            player.getCrossing() * DefenderCentreWeights.CROSSING * 2,
            player.getHeading() * DefenderCentreWeights.HEADING * 2,
            player.getMarking() * DefenderCentreWeights.MARKING * 2,
            player.getTackling() * DefenderCentreWeights.TACKLING * 2,
            player.getPositioning() * DefenderCentreWeights.POSITIONING * 2,
            player.getJumpingReach() * DefenderCentreWeights.JUMPING_REACH * 2,
            player.getStamina() * DefenderCentreWeights.STAMINA * 2,
            player.getStrength() * DefenderCentreWeights.STRENGTH * 2),
        List.of(
                DefenderCentreWeights.DRIBBLING,
                DefenderCentreWeights.AGGRESSION,
                DefenderCentreWeights.ANTICIPATION,
                DefenderCentreWeights.BRAVERY,
                DefenderCentreWeights.COMPOSURE,
                DefenderCentreWeights.CONCENTRATION,
                DefenderCentreWeights.DECISIONS,
                DefenderCentreWeights.WORK_RATE,
                DefenderCentreWeights.PACE,
                DefenderCentreWeights.CROSSING * 2,
                DefenderCentreWeights.HEADING * 2,
                DefenderCentreWeights.MARKING * 2,
                DefenderCentreWeights.TACKLING * 2,
                DefenderCentreWeights.POSITIONING * 2,
                DefenderCentreWeights.JUMPING_REACH * 2,
                DefenderCentreWeights.STAMINA * 2,
                DefenderCentreWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
