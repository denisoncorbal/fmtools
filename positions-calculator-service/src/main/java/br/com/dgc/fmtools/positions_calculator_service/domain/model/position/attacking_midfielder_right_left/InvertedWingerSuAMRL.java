package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class InvertedWingerSuAMRL extends Position {

  public InvertedWingerSuAMRL(LinePlayer player) {
    super(
        PositionNames.INVERTED_WINGER_SU_AMRL_NAME,
        List.of(
            player.getCrossing() * AttackingMidfielderRightLeftWeights.CROSSING,
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
            player.getLongShots() * AttackingMidfielderRightLeftWeights.LONG_SHOTS,
            player.getComposure() * AttackingMidfielderRightLeftWeights.COMPOSURE,
            player.getDecisions() * AttackingMidfielderRightLeftWeights.DECISIONS,
            player.getVision() * AttackingMidfielderRightLeftWeights.VISION,
            player.getWorkRate() * AttackingMidfielderRightLeftWeights.WORK_RATE,
            player.getAgility() * AttackingMidfielderRightLeftWeights.AGILITY,
            player.getPace() * AttackingMidfielderRightLeftWeights.PACE,
            player.getStamina() * AttackingMidfielderRightLeftWeights.STAMINA),
        List.of(
            player.getDribbling() * AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
            player.getPassing() * AttackingMidfielderRightLeftWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * AttackingMidfielderRightLeftWeights.ACCELERATION * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.CROSSING,
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
                AttackingMidfielderRightLeftWeights.LONG_SHOTS,
                AttackingMidfielderRightLeftWeights.COMPOSURE,
                AttackingMidfielderRightLeftWeights.DECISIONS,
                AttackingMidfielderRightLeftWeights.VISION,
                AttackingMidfielderRightLeftWeights.WORK_RATE,
                AttackingMidfielderRightLeftWeights.AGILITY,
                AttackingMidfielderRightLeftWeights.PACE,
                AttackingMidfielderRightLeftWeights.STAMINA,
                AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
                AttackingMidfielderRightLeftWeights.PASSING * 2,
                AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
                AttackingMidfielderRightLeftWeights.ACCELERATION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
