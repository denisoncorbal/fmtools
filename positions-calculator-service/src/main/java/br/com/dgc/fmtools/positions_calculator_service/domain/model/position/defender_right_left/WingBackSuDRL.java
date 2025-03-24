package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WingBackSuDRL extends Position {

  public WingBackSuDRL(LinePlayer player) {
    super(
        PositionNames.WING_BACK_SU_DRL_NAME,
        List.of(
            player.getFirstTouch() * DefenderRightLeftWeights.FIRST_TOUCH,
            player.getPassing() * DefenderRightLeftWeights.PASSING,
            player.getTechnique() * DefenderRightLeftWeights.TECHNIQUE,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING,
            player.getAgility() * DefenderRightLeftWeights.AGILITY,
            player.getPace() * DefenderRightLeftWeights.PACE),
        List.of(
            player.getCrossing() * DefenderRightLeftWeights.CROSSING * 2,
            player.getDribbling() * DefenderRightLeftWeights.DRIBBLING * 2,
            player.getMarking() * DefenderRightLeftWeights.MARKING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getOffTheBall() * DefenderRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * DefenderRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * DefenderRightLeftWeights.ACCELERATION * 2,
            player.getStamina() * DefenderRightLeftWeights.STAMINA * 2),
        List.of(
                DefenderRightLeftWeights.FIRST_TOUCH,
                DefenderRightLeftWeights.PASSING,
                DefenderRightLeftWeights.TECHNIQUE,
                DefenderRightLeftWeights.ANTICIPATION,
                DefenderRightLeftWeights.CONCENTRATION,
                DefenderRightLeftWeights.DECISIONS,
                DefenderRightLeftWeights.POSITIONING,
                DefenderRightLeftWeights.AGILITY,
                DefenderRightLeftWeights.PACE,
                DefenderRightLeftWeights.CROSSING * 2,
                DefenderRightLeftWeights.DRIBBLING * 2,
                DefenderRightLeftWeights.MARKING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.OFF_THE_BALL * 2,
                DefenderRightLeftWeights.TEAMWORK * 2,
                DefenderRightLeftWeights.WORK_RATE * 2,
                DefenderRightLeftWeights.ACCELERATION * 2,
                DefenderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
