package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class RaumdeuterAtAMRL extends Position {

  public RaumdeuterAtAMRL(LinePlayer player) {
    super(
        PositionNames.RAUMDEUTER_AT_AMRL_NAME,
        List.of(
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
            player.getTechnique() * AttackingMidfielderRightLeftWeights.TECHNIQUE,
            player.getWorkRate() * AttackingMidfielderRightLeftWeights.WORK_RATE,
            player.getAcceleration() * AttackingMidfielderRightLeftWeights.ACCELERATION,
            player.getStamina() * AttackingMidfielderRightLeftWeights.STAMINA),
        List.of(
            player.getFinishing() * AttackingMidfielderRightLeftWeights.FINISHING * 2,
            player.getAnticipation() * AttackingMidfielderRightLeftWeights.ANTICIPATION * 2,
            player.getComposure() * AttackingMidfielderRightLeftWeights.COMPOSURE * 2,
            player.getConcentration() * AttackingMidfielderRightLeftWeights.CONCENTRATION * 2,
            player.getDecisions() * AttackingMidfielderRightLeftWeights.DECISIONS * 2,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getBalance() * AttackingMidfielderRightLeftWeights.BALANCE * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
                AttackingMidfielderRightLeftWeights.TECHNIQUE,
                AttackingMidfielderRightLeftWeights.WORK_RATE,
                AttackingMidfielderRightLeftWeights.ACCELERATION,
                AttackingMidfielderRightLeftWeights.STAMINA,
                AttackingMidfielderRightLeftWeights.FINISHING * 2,
                AttackingMidfielderRightLeftWeights.ANTICIPATION * 2,
                AttackingMidfielderRightLeftWeights.COMPOSURE * 2,
                AttackingMidfielderRightLeftWeights.CONCENTRATION * 2,
                AttackingMidfielderRightLeftWeights.DECISIONS * 2,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
                AttackingMidfielderRightLeftWeights.BALANCE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
