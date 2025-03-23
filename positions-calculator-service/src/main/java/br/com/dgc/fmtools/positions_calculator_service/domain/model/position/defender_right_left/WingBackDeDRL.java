package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WingBackDeDRL extends Position {

  public WingBackDeDRL(LinePlayer player) {
    super(
        PositionNames.WING_BACK_DE_DRL_NAME,
        List.of(
            player.getCrossing() * DefenderRightLeftWeights.CROSSING,
            player.getDribbling() * DefenderRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * DefenderRightLeftWeights.FIRST_TOUCH,
            player.getPassing() * DefenderRightLeftWeights.PASSING,
            player.getTechnique() * DefenderRightLeftWeights.TECHNIQUE,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS,
            player.getOffTheBall() * DefenderRightLeftWeights.OFF_THE_BALL,
            player.getAgility() * DefenderRightLeftWeights.AGILITY,
            player.getPace() * DefenderRightLeftWeights.PACE),
        List.of(
            player.getMarking() * DefenderRightLeftWeights.MARKING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION * 2,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING * 2,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * DefenderRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * DefenderRightLeftWeights.ACCELERATION * 2,
            player.getStamina() * DefenderRightLeftWeights.STAMINA * 2),
        List.of(
                DefenderRightLeftWeights.CROSSING,
                DefenderRightLeftWeights.DRIBBLING,
                DefenderRightLeftWeights.FIRST_TOUCH,
                DefenderRightLeftWeights.PASSING,
                DefenderRightLeftWeights.TECHNIQUE,
                DefenderRightLeftWeights.CONCENTRATION,
                DefenderRightLeftWeights.DECISIONS,
                DefenderRightLeftWeights.OFF_THE_BALL,
                DefenderRightLeftWeights.AGILITY,
                DefenderRightLeftWeights.PACE,
                DefenderRightLeftWeights.MARKING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.ANTICIPATION * 2,
                DefenderRightLeftWeights.POSITIONING * 2,
                DefenderRightLeftWeights.TEAMWORK * 2,
                DefenderRightLeftWeights.WORK_RATE * 2,
                DefenderRightLeftWeights.ACCELERATION * 2,
                DefenderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
