package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class FullBackAtDRL extends Position {

  public FullBackAtDRL(LinePlayer player) {
    super(
        PositionNames.FULL_BACK_AT_DRL_NAME,
        List.of(
            player.getDribbling() * DefenderRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * DefenderRightLeftWeights.FIRST_TOUCH,
            player.getMarking() * DefenderRightLeftWeights.MARKING,
            player.getPassing() * DefenderRightLeftWeights.PASSING,
            player.getTechnique() * DefenderRightLeftWeights.TECHNIQUE,
            player.getComposure() * DefenderRightLeftWeights.COMPOSURE,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS,
            player.getOffTheBall() * DefenderRightLeftWeights.OFF_THE_BALL,
            player.getAcceleration() * DefenderRightLeftWeights.ACCELERATION,
            player.getAgility() * DefenderRightLeftWeights.AGILITY),
        List.of(
            player.getCrossing() * DefenderRightLeftWeights.CROSSING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION * 2,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING * 2,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * DefenderRightLeftWeights.WORK_RATE * 2,
            player.getPace() * DefenderRightLeftWeights.PACE * 2,
            player.getStamina() * DefenderRightLeftWeights.STAMINA * 2),
        List.of(
                DefenderRightLeftWeights.DRIBBLING,
                DefenderRightLeftWeights.FIRST_TOUCH,
                DefenderRightLeftWeights.MARKING,
                DefenderRightLeftWeights.PASSING,
                DefenderRightLeftWeights.TECHNIQUE,
                DefenderRightLeftWeights.COMPOSURE,
                DefenderRightLeftWeights.CONCENTRATION,
                DefenderRightLeftWeights.DECISIONS,
                DefenderRightLeftWeights.OFF_THE_BALL,
                DefenderRightLeftWeights.ACCELERATION,
                DefenderRightLeftWeights.AGILITY,
                DefenderRightLeftWeights.CROSSING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.ANTICIPATION * 2,
                DefenderRightLeftWeights.POSITIONING * 2,
                DefenderRightLeftWeights.TEAMWORK * 2,
                DefenderRightLeftWeights.WORK_RATE * 2,
                DefenderRightLeftWeights.PACE * 2,
                DefenderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
