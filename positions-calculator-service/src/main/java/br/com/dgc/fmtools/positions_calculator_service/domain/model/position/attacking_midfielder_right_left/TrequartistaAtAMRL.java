package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class TrequartistaAtAMRL extends Position {

  public TrequartistaAtAMRL(LinePlayer player) {
    super(
        PositionNames.TREQUARTISTA_AT_AMRL_NAME,
        List.of(
            player.getFinishing() * AttackingMidfielderRightLeftWeights.FINISHING,
            player.getAnticipation() * AttackingMidfielderRightLeftWeights.ANTICIPATION,
            player.getAgility() * AttackingMidfielderRightLeftWeights.AGILITY,
            player.getBalance() * AttackingMidfielderRightLeftWeights.BALANCE),
        List.of(
            player.getDribbling() * AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH * 2,
            player.getPassing() * AttackingMidfielderRightLeftWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getComposure() * AttackingMidfielderRightLeftWeights.COMPOSURE * 2,
            player.getDecisions() * AttackingMidfielderRightLeftWeights.DECISIONS * 2,
            player.getFlair() * AttackingMidfielderRightLeftWeights.FLAIR * 2,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getVision() * AttackingMidfielderRightLeftWeights.VISION * 2,
            player.getAcceleration() * AttackingMidfielderRightLeftWeights.ACCELERATION * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.FINISHING,
                AttackingMidfielderRightLeftWeights.ANTICIPATION,
                AttackingMidfielderRightLeftWeights.AGILITY,
                AttackingMidfielderRightLeftWeights.BALANCE,
                AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH * 2,
                AttackingMidfielderRightLeftWeights.PASSING * 2,
                AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
                AttackingMidfielderRightLeftWeights.COMPOSURE * 2,
                AttackingMidfielderRightLeftWeights.DECISIONS * 2,
                AttackingMidfielderRightLeftWeights.FLAIR * 2,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
                AttackingMidfielderRightLeftWeights.VISION * 2,
                AttackingMidfielderRightLeftWeights.ACCELERATION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
