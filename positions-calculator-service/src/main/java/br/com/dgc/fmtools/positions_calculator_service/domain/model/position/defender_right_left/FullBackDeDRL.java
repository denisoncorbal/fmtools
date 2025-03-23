package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class FullBackDeDRL extends Position {

  public FullBackDeDRL(LinePlayer player) {
    super(
        PositionNames.FULL_BACK_DE_DRL_NAME,
        List.of(
            player.getCrossing() * DefenderRightLeftWeights.CROSSING,
            player.getPassing() * DefenderRightLeftWeights.PASSING,
            player.getComposure() * DefenderRightLeftWeights.COMPOSURE,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK,
            player.getPace() * DefenderRightLeftWeights.PACE,
            player.getStamina() * DefenderRightLeftWeights.STAMINA),
        List.of(
            player.getMarking() * DefenderRightLeftWeights.MARKING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION * 2,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION * 2,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING * 2),
        List.of(
                DefenderRightLeftWeights.CROSSING,
                DefenderRightLeftWeights.PASSING,
                DefenderRightLeftWeights.COMPOSURE,
                DefenderRightLeftWeights.DECISIONS,
                DefenderRightLeftWeights.TEAMWORK,
                DefenderRightLeftWeights.PACE,
                DefenderRightLeftWeights.STAMINA,
                DefenderRightLeftWeights.MARKING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.ANTICIPATION * 2,
                DefenderRightLeftWeights.CONCENTRATION * 2,
                DefenderRightLeftWeights.POSITIONING * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
