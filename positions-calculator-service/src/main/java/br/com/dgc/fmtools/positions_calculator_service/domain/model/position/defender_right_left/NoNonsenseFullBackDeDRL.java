package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class NoNonsenseFullBackDeDRL extends Position {

  public NoNonsenseFullBackDeDRL(LinePlayer player) {
    super(
        PositionNames.NO_NONSENSE_FULL_BACK_DE_DRL_NAME,
        List.of(
            player.getHeading() * DefenderRightLeftWeights.HEADING,
            player.getAggression() * DefenderRightLeftWeights.AGGRESSION,
            player.getBravery() * DefenderRightLeftWeights.BRAVERY,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK),
        List.of(
            player.getMarking() * DefenderRightLeftWeights.MARKING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION * 2,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING * 2,
            player.getStrength() * DefenderRightLeftWeights.STRENGTH * 2),
        List.of(
                DefenderRightLeftWeights.HEADING,
                DefenderRightLeftWeights.AGGRESSION,
                DefenderRightLeftWeights.BRAVERY,
                DefenderRightLeftWeights.CONCENTRATION,
                DefenderRightLeftWeights.TEAMWORK,
                DefenderRightLeftWeights.MARKING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.ANTICIPATION * 2,
                DefenderRightLeftWeights.POSITIONING * 2,
                DefenderRightLeftWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
