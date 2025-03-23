package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class AdvancedPlaymakerAtAMRL extends Position {

  public AdvancedPlaymakerAtAMRL(LinePlayer player) {
    super(
        PositionNames.ADVANCED_PLAYMAKER_AT_AMRL_NAME,
        List.of(
            player.getAnticipation() * AttackingMidfielderRightLeftWeights.ANTICIPATION,
            player.getFlair() * AttackingMidfielderRightLeftWeights.FLAIR,
            player.getAcceleration() * AttackingMidfielderRightLeftWeights.ACCELERATION,
            player.getAgility() * AttackingMidfielderRightLeftWeights.AGILITY),
        List.of(
            player.getDribbling() * AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
            player.getFirstTouch() * AttackingMidfielderRightLeftWeights.FIRST_TOUCH * 2,
            player.getPassing() * AttackingMidfielderRightLeftWeights.PASSING * 2,
            player.getTechnique() * AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getComposure() * AttackingMidfielderRightLeftWeights.COMPOSURE * 2,
            player.getDecisions() * AttackingMidfielderRightLeftWeights.DECISIONS * 2,
            player.getOffTheBall() * AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * AttackingMidfielderRightLeftWeights.TEAMWORK * 2,
            player.getVision() * AttackingMidfielderRightLeftWeights.VISION * 2),
        List.of(
                AttackingMidfielderRightLeftWeights.ANTICIPATION,
                AttackingMidfielderRightLeftWeights.FLAIR,
                AttackingMidfielderRightLeftWeights.ACCELERATION,
                AttackingMidfielderRightLeftWeights.AGILITY,
                AttackingMidfielderRightLeftWeights.DRIBBLING * 2,
                AttackingMidfielderRightLeftWeights.FIRST_TOUCH * 2,
                AttackingMidfielderRightLeftWeights.PASSING * 2,
                AttackingMidfielderRightLeftWeights.TECHNIQUE * 2,
                AttackingMidfielderRightLeftWeights.COMPOSURE * 2,
                AttackingMidfielderRightLeftWeights.DECISIONS * 2,
                AttackingMidfielderRightLeftWeights.OFF_THE_BALL * 2,
                AttackingMidfielderRightLeftWeights.TEAMWORK * 2,
                AttackingMidfielderRightLeftWeights.VISION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
