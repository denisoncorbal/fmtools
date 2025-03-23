package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class CompleteWingBackAtDRL extends Position {

  public CompleteWingBackAtDRL(LinePlayer player) {
    super(
        PositionNames.COMPLETE_WING_BACK_AT_DRL_NAME,
        List.of(
            player.getTackling() * DefenderRightLeftWeights.TACKLING,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION,
            player.getComposure() * DefenderRightLeftWeights.COMPOSURE,
            player.getAgility() * DefenderRightLeftWeights.AGILITY,
            player.getBalance() * DefenderRightLeftWeights.BALANCE),
        List.of(
            player.getCrossing() * DefenderRightLeftWeights.CROSSING * 2,
            player.getDribbling() * DefenderRightLeftWeights.DRIBBLING * 2,
            player.getFirstTouch() * DefenderRightLeftWeights.FIRST_TOUCH * 2,
            player.getPassing() * DefenderRightLeftWeights.PASSING * 2,
            player.getTechnique() * DefenderRightLeftWeights.TECHNIQUE * 2,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS * 2,
            player.getOffTheBall() * DefenderRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * DefenderRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * DefenderRightLeftWeights.ACCELERATION * 2,
            player.getPace() * DefenderRightLeftWeights.PACE * 2,
            player.getStamina() * DefenderRightLeftWeights.STAMINA * 2,
            player.getFlair() * DefenderRightLeftWeights.FLAIR * 2),
        List.of(
                DefenderRightLeftWeights.TACKLING,
                DefenderRightLeftWeights.ANTICIPATION,
                DefenderRightLeftWeights.COMPOSURE,
                DefenderRightLeftWeights.AGILITY,
                DefenderRightLeftWeights.BALANCE,
                DefenderRightLeftWeights.CROSSING * 2,
                DefenderRightLeftWeights.DRIBBLING * 2,
                DefenderRightLeftWeights.FIRST_TOUCH * 2,
                DefenderRightLeftWeights.PASSING * 2,
                DefenderRightLeftWeights.TECHNIQUE * 2,
                DefenderRightLeftWeights.DECISIONS * 2,
                DefenderRightLeftWeights.OFF_THE_BALL * 2,
                DefenderRightLeftWeights.TEAMWORK * 2,
                DefenderRightLeftWeights.WORK_RATE * 2,
                DefenderRightLeftWeights.ACCELERATION * 2,
                DefenderRightLeftWeights.PACE * 2,
                DefenderRightLeftWeights.STAMINA * 2,
                DefenderRightLeftWeights.FLAIR * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
