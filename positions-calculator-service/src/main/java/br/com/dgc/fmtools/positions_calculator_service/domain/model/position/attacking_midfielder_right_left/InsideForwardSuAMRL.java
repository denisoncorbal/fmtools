package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class InsideForwardSuAMRL extends Position {

  public InsideForwardSuAMRL(LinePlayer player) {
    super(
        PositionNames.INSIDE_FORWARD_SU_AMRL_NAME,
        List.of(
            player.getFinishing() * AttackingMidfielderRightLeftWeights.FINISHING,
            player.getLongShots() * AttackingMidfielderRightLeftWeights.LONG_SHOTS,
            player.getAnticipation() * AttackingMidfielderRightLeftWeights.ANTICIPATION,
            player.getComposure() * AttackingMidfielderRightLeftWeights.COMPOSURE,
            player.getFlair() * AttackingMidfielderRightLeftWeights.FLAIR,
            player.getVision() * AttackingMidfielderRightLeftWeights.VISION,
            player.getPace() * AttackingMidfielderRightLeftWeights.PACE),
        List.of(
            player.getDribbling() * AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH * 2,
            player.getPassing() * AttackingMidfielderRightLeftWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * AttackingMidfielderRightLeftWeights.ACCELERATION * 2,
            player.getAgility() * AttackingMidfielderRightLeftWeights.AGILITY * 2,
            player.getBalance() * AttackingMidfielderRightLeftWeights.BALANCE * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.FINISHING,
                AttackingMidfielderRightLeftWeights.LONG_SHOTS,
                AttackingMidfielderRightLeftWeights.ANTICIPATION,
                AttackingMidfielderRightLeftWeights.COMPOSURE,
                AttackingMidfielderRightLeftWeights.FLAIR,
                AttackingMidfielderRightLeftWeights.VISION,
                AttackingMidfielderRightLeftWeights.PACE,
                AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH * 2,
                AttackingMidfielderRightLeftWeights.PASSING * 2,
                AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
                AttackingMidfielderRightLeftWeights.ACCELERATION * 2,
                AttackingMidfielderRightLeftWeights.AGILITY * 2,
                AttackingMidfielderRightLeftWeights.BALANCE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
