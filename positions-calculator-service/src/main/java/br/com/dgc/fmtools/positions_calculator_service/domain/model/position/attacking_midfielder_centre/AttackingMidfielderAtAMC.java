package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class AttackingMidfielderAtAMC extends Position {

  public AttackingMidfielderAtAMC(LinePlayer player) {
    super(
        PositionNames.ATTACKING_MIDFIELDER_AT_AMC_NAME,
        List.of(
            player.getFinishing() * AttackingMidfielderCentreWeights.FINISHING,
            player.getComposure() * AttackingMidfielderCentreWeights.COMPOSURE,
            player.getVision() * AttackingMidfielderCentreWeights.VISION,
            player.getAgility() * AttackingMidfielderCentreWeights.AGILITY),
        List.of(
            player.getDribbling() * AttackingMidfielderCentreWeights.DRIBBLING * 2,
            player.getFirstTouch() * AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getLongShots() * AttackingMidfielderCentreWeights.LONG_SHOTS * 2,
            player.getPassing() * AttackingMidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderCentreWeights.TECHNIQUE * 2,
            player.getAnticipation() * AttackingMidfielderCentreWeights.ANTICIPATION * 2,
            player.getDecisions() * AttackingMidfielderCentreWeights.DECISIONS * 2,
            player.getFlair() * AttackingMidfielderCentreWeights.FLAIR * 2,
            player.getOffTheBall() * AttackingMidfielderCentreWeights.OFF_THE_BALL * 2),
        List.of(
                AttackingMidfielderCentreWeights.FINISHING,
                AttackingMidfielderCentreWeights.COMPOSURE,
                AttackingMidfielderCentreWeights.VISION,
                AttackingMidfielderCentreWeights.AGILITY,
                AttackingMidfielderCentreWeights.DRIBBLING * 2,
                AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
                AttackingMidfielderCentreWeights.LONG_SHOTS * 2,
                AttackingMidfielderCentreWeights.PASSING * 2,
                AttackingMidfielderCentreWeights.TECHNIQUE * 2,
                AttackingMidfielderCentreWeights.ANTICIPATION * 2,
                AttackingMidfielderCentreWeights.DECISIONS * 2,
                AttackingMidfielderCentreWeights.FLAIR * 2,
                AttackingMidfielderCentreWeights.OFF_THE_BALL * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
