package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class EngancheSuAMC extends Position {

  public EngancheSuAMC(LinePlayer player) {
    super(
        PositionNames.ENGANCHE_SU_AMC_NAME,
        List.of(
            player.getDribbling() * AttackingMidfielderCentreWeights.DRIBBLING,
            player.getAnticipation() * AttackingMidfielderCentreWeights.ANTICIPATION,
            player.getFlair() * AttackingMidfielderCentreWeights.FLAIR,
            player.getOffTheBall() * AttackingMidfielderCentreWeights.OFF_THE_BALL,
            player.getTeamwork() * AttackingMidfielderCentreWeights.TEAMWORK,
            player.getAgility() * AttackingMidfielderCentreWeights.AGILITY),
        List.of(
            player.getFirstTouch() * AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * AttackingMidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderCentreWeights.TECHNIQUE * 2,
            player.getComposure() * AttackingMidfielderCentreWeights.COMPOSURE * 2,
            player.getDecisions() * AttackingMidfielderCentreWeights.DECISIONS * 2,
            player.getVision() * AttackingMidfielderCentreWeights.VISION),
        List.of(
                AttackingMidfielderCentreWeights.DRIBBLING,
                AttackingMidfielderCentreWeights.ANTICIPATION,
                AttackingMidfielderCentreWeights.FLAIR,
                AttackingMidfielderCentreWeights.OFF_THE_BALL,
                AttackingMidfielderCentreWeights.TEAMWORK,
                AttackingMidfielderCentreWeights.AGILITY,
                AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
                AttackingMidfielderCentreWeights.PASSING * 2,
                AttackingMidfielderCentreWeights.TECHNIQUE * 2,
                AttackingMidfielderCentreWeights.COMPOSURE * 2,
                AttackingMidfielderCentreWeights.DECISIONS * 2,
                AttackingMidfielderCentreWeights.VISION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
