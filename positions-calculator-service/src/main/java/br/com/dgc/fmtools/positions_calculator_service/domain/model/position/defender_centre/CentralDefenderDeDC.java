package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class CentralDefenderDeDC extends Position {

  public CentralDefenderDeDC(LinePlayer player) {
    super(
        PositionNames.CENTRAL_DEFENDER_DE_DC_NAME,
        List.of(
            player.getAggression() * DefenderCentreWeights.AGGRESSION,
            player.getAnticipation() * DefenderCentreWeights.ANTICIPATION,
            player.getBravery() * DefenderCentreWeights.BRAVERY,
            player.getComposure() * DefenderCentreWeights.COMPOSURE,
            player.getConcentration() * DefenderCentreWeights.CONCENTRATION,
            player.getDecisions() * DefenderCentreWeights.DECISIONS,
            player.getPace() * DefenderCentreWeights.PACE),
        List.of(
            player.getHeading() * DefenderCentreWeights.HEADING * 2,
            player.getMarking() * DefenderCentreWeights.MARKING * 2,
            player.getTackling() * DefenderCentreWeights.TACKLING * 2,
            player.getPositioning() * DefenderCentreWeights.POSITIONING * 2,
            player.getJumpingReach() * DefenderCentreWeights.JUMPING_REACH * 2,
            player.getStrength() * DefenderCentreWeights.STRENGTH * 2),
        List.of(
                DefenderCentreWeights.AGGRESSION,
                DefenderCentreWeights.ANTICIPATION,
                DefenderCentreWeights.BRAVERY,
                DefenderCentreWeights.COMPOSURE,
                DefenderCentreWeights.CONCENTRATION,
                DefenderCentreWeights.DECISIONS,
                DefenderCentreWeights.PACE,
                DefenderCentreWeights.HEADING * 2,
                DefenderCentreWeights.MARKING * 2,
                DefenderCentreWeights.TACKLING * 2,
                DefenderCentreWeights.POSITIONING * 2,
                DefenderCentreWeights.JUMPING_REACH * 2,
                DefenderCentreWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
