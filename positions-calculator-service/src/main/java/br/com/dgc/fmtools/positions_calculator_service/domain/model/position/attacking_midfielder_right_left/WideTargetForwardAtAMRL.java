package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WideTargetForwardAtAMRL extends Position {

  public WideTargetForwardAtAMRL(LinePlayer player) {
    super(
        PositionNames.WIDE_TARGET_FORWARD_AT_AMRL_NAME,
        List.of(
            player.getCrossing() * AttackingMidfielderRightLeftWeights.CROSSING,
            player.getFinishing() * AttackingMidfielderRightLeftWeights.FINISHING,
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
            player.getAnticipation() * AttackingMidfielderRightLeftWeights.ANTICIPATION,
            player.getTeamwork() * AttackingMidfielderRightLeftWeights.TEAMWORK,
            player.getWorkRate() * AttackingMidfielderRightLeftWeights.WORK_RATE,
            player.getBalance() * AttackingMidfielderRightLeftWeights.BALANCE,
            player.getStamina() * AttackingMidfielderRightLeftWeights.STAMINA),
        List.of(
            player.getHeading() * AttackingMidfielderRightLeftWeights.HEADING * 2,
            player.getBravery() * AttackingMidfielderRightLeftWeights.BRAVERY * 2,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getJumpingReach() * AttackingMidfielderRightLeftWeights.JUMPING_REACH * 2,
            player.getStrength() * AttackingMidfielderRightLeftWeights.STRENGTH * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.CROSSING,
                AttackingMidfielderRightLeftWeights.FINISHING,
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
                AttackingMidfielderRightLeftWeights.ANTICIPATION,
                AttackingMidfielderRightLeftWeights.TEAMWORK,
                AttackingMidfielderRightLeftWeights.WORK_RATE,
                AttackingMidfielderRightLeftWeights.BALANCE,
                AttackingMidfielderRightLeftWeights.STAMINA,
                AttackingMidfielderRightLeftWeights.HEADING * 2,
                AttackingMidfielderRightLeftWeights.BRAVERY * 2,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
                AttackingMidfielderRightLeftWeights.JUMPING_REACH * 2,
                AttackingMidfielderRightLeftWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
