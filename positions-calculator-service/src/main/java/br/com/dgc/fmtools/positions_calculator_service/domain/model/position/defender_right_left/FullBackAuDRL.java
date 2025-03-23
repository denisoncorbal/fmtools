package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class FullBackAuDRL extends Position {

  public FullBackAuDRL(LinePlayer player) {
    super(
        PositionNames.FULL_BACK_AU_DRL_NAME,
        List.of(
            player.getCrossing() * DefenderRightLeftWeights.CROSSING,
            player.getDribbling() * DefenderRightLeftWeights.DRIBBLING,
            player.getPassing() * DefenderRightLeftWeights.PASSING,
            player.getTechnique() * DefenderRightLeftWeights.TECHNIQUE,
            player.getComposure() * DefenderRightLeftWeights.COMPOSURE,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS,
            player.getPace() * DefenderRightLeftWeights.PACE,
            player.getStamina() * DefenderRightLeftWeights.STAMINA),
        List.of(
            player.getMarking() * DefenderRightLeftWeights.MARKING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION * 2,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION * 2,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING * 2,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * DefenderRightLeftWeights.WORK_RATE * 2),
        List.of(
                DefenderRightLeftWeights.CROSSING,
                DefenderRightLeftWeights.DRIBBLING,
                DefenderRightLeftWeights.PASSING,
                DefenderRightLeftWeights.TECHNIQUE,
                DefenderRightLeftWeights.COMPOSURE,
                DefenderRightLeftWeights.DECISIONS,
                DefenderRightLeftWeights.PACE,
                DefenderRightLeftWeights.STAMINA,
                DefenderRightLeftWeights.MARKING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.ANTICIPATION * 2,
                DefenderRightLeftWeights.CONCENTRATION * 2,
                DefenderRightLeftWeights.POSITIONING * 2,
                DefenderRightLeftWeights.TEAMWORK * 2,
                DefenderRightLeftWeights.WORK_RATE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
