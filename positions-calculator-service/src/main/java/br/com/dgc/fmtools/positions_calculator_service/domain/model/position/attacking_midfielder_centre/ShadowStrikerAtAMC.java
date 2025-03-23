package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class ShadowStrikerAtAMC extends Position {

  public ShadowStrikerAtAMC(LinePlayer player) {
    super(
        PositionNames.SHADOW_STRIKER_AT_AMC_NAME,
        List.of(
            player.getPassing() * AttackingMidfielderCentreWeights.PASSING,
            player.getTechnique() * AttackingMidfielderCentreWeights.TECHNIQUE,
            player.getConcentration() * AttackingMidfielderCentreWeights.CONCENTRATION,
            player.getDecisions() * AttackingMidfielderCentreWeights.DECISIONS,
            player.getWorkRate() * AttackingMidfielderCentreWeights.WORK_RATE,
            player.getAgility() * AttackingMidfielderCentreWeights.AGILITY,
            player.getBalance() * AttackingMidfielderCentreWeights.BALANCE,
            player.getPace() * AttackingMidfielderCentreWeights.PACE,
            player.getStamina() * AttackingMidfielderCentreWeights.STAMINA),
        List.of(
            player.getDribbling() * AttackingMidfielderCentreWeights.DRIBBLING * 2,
            player.getFinishing() * AttackingMidfielderCentreWeights.FINISHING * 2,
            player.getFirstTouch() * AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getAnticipation() * AttackingMidfielderCentreWeights.ANTICIPATION * 2,
            player.getComposure() * AttackingMidfielderCentreWeights.COMPOSURE * 2,
            player.getOffTheBall() * AttackingMidfielderCentreWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * AttackingMidfielderCentreWeights.ACCELERATION * 2),
        List.of(
                AttackingMidfielderCentreWeights.PASSING,
                AttackingMidfielderCentreWeights.TECHNIQUE,
                AttackingMidfielderCentreWeights.CONCENTRATION,
                AttackingMidfielderCentreWeights.DECISIONS,
                AttackingMidfielderCentreWeights.WORK_RATE,
                AttackingMidfielderCentreWeights.AGILITY,
                AttackingMidfielderCentreWeights.BALANCE,
                AttackingMidfielderCentreWeights.PACE,
                AttackingMidfielderCentreWeights.STAMINA,
                AttackingMidfielderCentreWeights.DRIBBLING * 2,
                AttackingMidfielderCentreWeights.FINISHING * 2,
                AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
                AttackingMidfielderCentreWeights.ANTICIPATION * 2,
                AttackingMidfielderCentreWeights.COMPOSURE * 2,
                AttackingMidfielderCentreWeights.OFF_THE_BALL * 2,
                AttackingMidfielderCentreWeights.ACCELERATION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
