package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class AdvancedPlaymakerSuAMC extends Position {

  public AdvancedPlaymakerSuAMC(LinePlayer player) {
    super(
        PositionNames.ADVANCED_PLAYMAKER_SU_AMC_NAME,
        List.of(
            player.getDribbling() * AttackingMidfielderCentreWeights.DRIBBLING,
            player.getAnticipation() * AttackingMidfielderCentreWeights.ANTICIPATION,
            player.getFlair() * AttackingMidfielderCentreWeights.FLAIR,
            player.getAgility() * AttackingMidfielderCentreWeights.AGILITY),
        List.of(
            player.getFirstTouch() * AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * AttackingMidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderCentreWeights.TECHNIQUE * 2,
            player.getComposure() * AttackingMidfielderCentreWeights.COMPOSURE * 2,
            player.getDecisions() * AttackingMidfielderCentreWeights.DECISIONS * 2,
            player.getOffTheBall() * AttackingMidfielderCentreWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * AttackingMidfielderCentreWeights.TEAMWORK * 2,
            player.getVision() * AttackingMidfielderCentreWeights.VISION * 2),
        List.of(
                AttackingMidfielderCentreWeights.DRIBBLING,
                AttackingMidfielderCentreWeights.ANTICIPATION,
                AttackingMidfielderCentreWeights.FLAIR,
                AttackingMidfielderCentreWeights.AGILITY,
                AttackingMidfielderCentreWeights.FIRST_TOUCH * 2,
                AttackingMidfielderCentreWeights.PASSING * 2,
                AttackingMidfielderCentreWeights.TECHNIQUE * 2,
                AttackingMidfielderCentreWeights.COMPOSURE * 2,
                AttackingMidfielderCentreWeights.DECISIONS * 2,
                AttackingMidfielderCentreWeights.OFF_THE_BALL * 2,
                AttackingMidfielderCentreWeights.TEAMWORK * 2,
                AttackingMidfielderCentreWeights.VISION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
