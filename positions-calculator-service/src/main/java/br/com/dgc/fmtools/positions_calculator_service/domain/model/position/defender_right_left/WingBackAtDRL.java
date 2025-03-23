package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WingBackAtDRL extends Position {

  public WingBackAtDRL(LinePlayer player) {
    super(
        PositionNames.WING_BACK_AT_DRL_NAME,
        List.of(
            player.getFirstTouch() * DefenderRightLeftWeights.FIRST_TOUCH,
            player.getMarking() * DefenderRightLeftWeights.MARKING,
            player.getPassing() * DefenderRightLeftWeights.PASSING,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS,
            player.getFlair() * DefenderRightLeftWeights.FLAIR,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING,
            player.getAgility() * DefenderRightLeftWeights.AGILITY),
        List.of(
            player.getCrossing() * DefenderRightLeftWeights.CROSSING * 2,
            player.getDribbling() * DefenderRightLeftWeights.DRIBBLING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getTechnique() * DefenderRightLeftWeights.TECHNIQUE * 2,
            player.getOffTheBall() * DefenderRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * DefenderRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * DefenderRightLeftWeights.ACCELERATION * 2,
            player.getPace() * DefenderRightLeftWeights.PACE * 2,
            player.getStamina() * DefenderRightLeftWeights.STAMINA * 2),
        List.of(
                DefenderRightLeftWeights.FIRST_TOUCH,
                DefenderRightLeftWeights.MARKING,
                DefenderRightLeftWeights.PASSING,
                DefenderRightLeftWeights.ANTICIPATION,
                DefenderRightLeftWeights.CONCENTRATION,
                DefenderRightLeftWeights.DECISIONS,
                DefenderRightLeftWeights.FLAIR,
                DefenderRightLeftWeights.POSITIONING,
                DefenderRightLeftWeights.AGILITY,
                DefenderRightLeftWeights.CROSSING * 2,
                DefenderRightLeftWeights.DRIBBLING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.TECHNIQUE * 2,
                DefenderRightLeftWeights.OFF_THE_BALL * 2,
                DefenderRightLeftWeights.TEAMWORK * 2,
                DefenderRightLeftWeights.WORK_RATE * 2,
                DefenderRightLeftWeights.ACCELERATION * 2,
                DefenderRightLeftWeights.PACE * 2,
                DefenderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
