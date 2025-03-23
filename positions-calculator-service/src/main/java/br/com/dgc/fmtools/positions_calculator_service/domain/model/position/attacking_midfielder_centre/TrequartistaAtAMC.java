package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class TrequartistaAtAMC extends Position {

  public TrequartistaAtAMC(LinePlayer player) {
    super(
        PositionNames.TREQUARTISTA_AT_AMC_NAME,
        List.of(
            player.getFinishing() * AttackingMidfielderCentreWeights.FINISHING,
            player.getAnticipation() * AttackingMidfielderCentreWeights.ANTICIPATION,
            player.getAgility() * AttackingMidfielderCentreWeights.AGILITY,
            player.getBalance() * AttackingMidfielderCentreWeights.BALANCE),
        List.of(
            player.getDribbling() * AttackingMidfielderCentreWeights.DRIBBLING * 2,
            player.getFirstTouch() * AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * AttackingMidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderCentreWeights.TECHNIQUE * 2,
            player.getComposure() * AttackingMidfielderCentreWeights.COMPOSURE * 2,
            player.getDecisions() * AttackingMidfielderCentreWeights.DECISIONS * 2,
            player.getFlair() * AttackingMidfielderCentreWeights.FLAIR * 2,
            player.getOffTheBall() * AttackingMidfielderCentreWeights.OFF_THE_BALL * 2,
            player.getVision() * AttackingMidfielderCentreWeights.VISION * 2,
            player.getAcceleration() * AttackingMidfielderCentreWeights.ACCELERATION * 2),
        List.of(
                AttackingMidfielderCentreWeights.FINISHING,
                AttackingMidfielderCentreWeights.ANTICIPATION,
                AttackingMidfielderCentreWeights.AGILITY,
                AttackingMidfielderCentreWeights.BALANCE,
                AttackingMidfielderCentreWeights.DRIBBLING * 2,
                AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
                AttackingMidfielderCentreWeights.PASSING * 2,
                AttackingMidfielderCentreWeights.TECHNIQUE * 2,
                AttackingMidfielderCentreWeights.COMPOSURE * 2,
                AttackingMidfielderCentreWeights.DECISIONS * 2,
                AttackingMidfielderCentreWeights.FLAIR * 2,
                AttackingMidfielderCentreWeights.OFF_THE_BALL * 2,
                AttackingMidfielderCentreWeights.VISION * 2,
                AttackingMidfielderCentreWeights.ACCELERATION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
