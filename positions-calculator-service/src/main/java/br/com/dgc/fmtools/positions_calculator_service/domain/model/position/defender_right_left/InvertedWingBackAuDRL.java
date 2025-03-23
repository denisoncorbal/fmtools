package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class InvertedWingBackAuDRL extends Position {

  public InvertedWingBackAuDRL(LinePlayer player) {
    super(
        PositionNames.INVERTED_WING_BACK_AU_DRL_NAME,
        List.of(
            player.getDribbling() * DefenderRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * DefenderRightLeftWeights.FIRST_TOUCH,
            player.getTechnique() * DefenderRightLeftWeights.TECHNIQUE,
            player.getAnticipation() * DefenderRightLeftWeights.ANTICIPATION,
            player.getComposure() * DefenderRightLeftWeights.COMPOSURE,
            player.getConcentration() * DefenderRightLeftWeights.CONCENTRATION,
            player.getPositioning() * DefenderRightLeftWeights.POSITIONING,
            player.getAcceleration() * DefenderRightLeftWeights.ACCELERATION,
            player.getAgility() * DefenderRightLeftWeights.AGILITY),
        List.of(
            player.getMarking() * DefenderRightLeftWeights.MARKING * 2,
            player.getPassing() * DefenderRightLeftWeights.PASSING * 2,
            player.getTackling() * DefenderRightLeftWeights.TACKLING * 2,
            player.getDecisions() * DefenderRightLeftWeights.DECISIONS * 2,
            player.getOffTheBall() * DefenderRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * DefenderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * DefenderRightLeftWeights.WORK_RATE * 2,
            player.getStamina() * DefenderRightLeftWeights.STAMINA * 2),
        List.of(
                DefenderRightLeftWeights.DRIBBLING,
                DefenderRightLeftWeights.FIRST_TOUCH,
                DefenderRightLeftWeights.TECHNIQUE,
                DefenderRightLeftWeights.ANTICIPATION,
                DefenderRightLeftWeights.COMPOSURE,
                DefenderRightLeftWeights.CONCENTRATION,
                DefenderRightLeftWeights.POSITIONING,
                DefenderRightLeftWeights.ACCELERATION,
                DefenderRightLeftWeights.AGILITY,
                DefenderRightLeftWeights.MARKING * 2,
                DefenderRightLeftWeights.PASSING * 2,
                DefenderRightLeftWeights.TACKLING * 2,
                DefenderRightLeftWeights.DECISIONS * 2,
                DefenderRightLeftWeights.OFF_THE_BALL * 2,
                DefenderRightLeftWeights.TEAMWORK * 2,
                DefenderRightLeftWeights.WORK_RATE * 2,
                DefenderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
