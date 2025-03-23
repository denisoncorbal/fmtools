package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WideTargetForwardSuAMRL extends Position {

  public WideTargetForwardSuAMRL(LinePlayer player) {
    super(
        PositionNames.WIDE_TARGET_FORWARD_SU_AMRL_NAME,
        List.of(
            player.getCrossing() * AttackingMidfielderRightLeftWeights.CROSSING,
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
            player.getAnticipation() * AttackingMidfielderRightLeftWeights.ANTICIPATION,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL,
            player.getWorkRate() * AttackingMidfielderRightLeftWeights.WORK_RATE,
            player.getBalance() * AttackingMidfielderRightLeftWeights.BALANCE,
            player.getStamina() * AttackingMidfielderRightLeftWeights.STAMINA),
        List.of(
            player.getHeading() * AttackingMidfielderRightLeftWeights.HEADING * 2,
            player.getBravery() * AttackingMidfielderRightLeftWeights.BRAVERY * 2,
            player.getTeamwork() * AttackingMidfielderRightLeftWeights.TEAMWORK * 2,
            player.getJumpingReach() * AttackingMidfielderRightLeftWeights.JUMPING_REACH * 2,
            player.getStrength() * AttackingMidfielderRightLeftWeights.STRENGTH * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.CROSSING,
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH,
                AttackingMidfielderRightLeftWeights.ANTICIPATION,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL,
                AttackingMidfielderRightLeftWeights.WORK_RATE,
                AttackingMidfielderRightLeftWeights.BALANCE,
                AttackingMidfielderRightLeftWeights.STAMINA,
                AttackingMidfielderRightLeftWeights.HEADING * 2,
                AttackingMidfielderRightLeftWeights.BRAVERY * 2,
                AttackingMidfielderRightLeftWeights.TEAMWORK * 2,
                AttackingMidfielderRightLeftWeights.JUMPING_REACH * 2,
                AttackingMidfielderRightLeftWeights.STRENGTH * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
