package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WingerAtAMRL extends Position {

  public WingerAtAMRL(LinePlayer player) {
    super(
        PositionNames.WINGER_AT_AMRL_NAME,
        List.of(
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
            player.getPassing() * AttackingMidfielderRightLeftWeights.PASSING,
            player.getAnticipation() * AttackingMidfielderRightLeftWeights.ANTICIPATION,
            player.getFlair() * AttackingMidfielderRightLeftWeights.FLAIR,
            player.getAgility() * AttackingMidfielderRightLeftWeights.AGILITY),
        List.of(
            player.getCrossing() * AttackingMidfielderRightLeftWeights.CROSSING * 2,
            player.getDribbling() * AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
            player.getTechnique() * AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * AttackingMidfielderRightLeftWeights.ACCELERATION * 2,
            player.getPace() * AttackingMidfielderRightLeftWeights.PACE * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
                AttackingMidfielderRightLeftWeights.PASSING,
                AttackingMidfielderRightLeftWeights.ANTICIPATION,
                AttackingMidfielderRightLeftWeights.FLAIR,
                AttackingMidfielderRightLeftWeights.AGILITY,
                AttackingMidfielderRightLeftWeights.CROSSING * 2,
                AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
                AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
                AttackingMidfielderRightLeftWeights.ACCELERATION * 2,
                AttackingMidfielderRightLeftWeights.PACE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
