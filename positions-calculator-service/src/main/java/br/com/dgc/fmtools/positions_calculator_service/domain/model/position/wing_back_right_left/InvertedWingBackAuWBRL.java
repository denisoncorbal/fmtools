package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class InvertedWingBackAuWBRL extends Position {
  public InvertedWingBackAuWBRL(LinePlayer player) {
    super(
        PositionNames.INVERTED_WING_BACK_AU_WBRL_NAME,
        List.of(
            player.getDribbling() * WingBackRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * WingBackRightLeftWeights.FIRST_TOUCH,
            player.getTechnique() * WingBackRightLeftWeights.TECHNIQUE,
            player.getConcentration() * WingBackRightLeftWeights.CONCENTRATION,
            player.getOffTheBall() * WingBackRightLeftWeights.OFF_THE_BALL,
            player.getAcceleration() * WingBackRightLeftWeights.ACCELERATION,
            player.getAgility() * WingBackRightLeftWeights.AGILITY,
            player.getStamina() * WingBackRightLeftWeights.STAMINA),
        List.of(
            player.getMarking() * WingBackRightLeftWeights.MARKING * 2,
            player.getPassing() * WingBackRightLeftWeights.PASSING * 2,
            player.getTackling() * WingBackRightLeftWeights.TACKLING * 2,
            player.getAnticipation() * WingBackRightLeftWeights.ANTICIPATION * 2,
            player.getDecisions() * WingBackRightLeftWeights.DECISIONS * 2,
            player.getPositioning() * WingBackRightLeftWeights.POSITIONING * 2,
            player.getTeamwork() * WingBackRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * WingBackRightLeftWeights.WORK_RATE * 2),
        List.of(
                WingBackRightLeftWeights.DRIBBLING,
                WingBackRightLeftWeights.FIRST_TOUCH,
                WingBackRightLeftWeights.TECHNIQUE,
                WingBackRightLeftWeights.CONCENTRATION,
                WingBackRightLeftWeights.OFF_THE_BALL,
                WingBackRightLeftWeights.ACCELERATION,
                WingBackRightLeftWeights.AGILITY,
                WingBackRightLeftWeights.STAMINA,
                WingBackRightLeftWeights.MARKING * 2,
                WingBackRightLeftWeights.PASSING * 2,
                WingBackRightLeftWeights.TACKLING * 2,
                WingBackRightLeftWeights.ANTICIPATION * 2,
                WingBackRightLeftWeights.DECISIONS * 2,
                WingBackRightLeftWeights.POSITIONING * 2,
                WingBackRightLeftWeights.TEAMWORK * 2,
                WingBackRightLeftWeights.WORK_RATE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
