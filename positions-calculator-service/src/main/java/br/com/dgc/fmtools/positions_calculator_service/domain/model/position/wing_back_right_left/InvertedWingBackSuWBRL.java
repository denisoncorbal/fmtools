package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class InvertedWingBackSuWBRL extends Position {

  public InvertedWingBackSuWBRL(LinePlayer player) {
    super(
        PositionNames.INVERTED_WING_BACK_SU_WBRL_NAME,
        List.of(
            player.getDribbling() * WingBackRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * WingBackRightLeftWeights.FIRST_TOUCH,
            player.getTechnique() * WingBackRightLeftWeights.TECHNIQUE,
            player.getConcentration() * WingBackRightLeftWeights.CONCENTRATION,
            player.getAcceleration() * WingBackRightLeftWeights.ACCELERATION,
            player.getAgility() * WingBackRightLeftWeights.AGILITY,
            player.getComposure() * WingBackRightLeftWeights.COMPOSURE,
            player.getAnticipation() * WingBackRightLeftWeights.ANTICIPATION,
            player.getPositioning() * WingBackRightLeftWeights.POSITIONING),
        List.of(
            player.getMarking() * WingBackRightLeftWeights.MARKING * 2,
            player.getPassing() * WingBackRightLeftWeights.PASSING * 2,
            player.getTackling() * WingBackRightLeftWeights.TACKLING * 2,
            player.getDecisions() * WingBackRightLeftWeights.DECISIONS * 2,
            player.getTeamwork() * WingBackRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * WingBackRightLeftWeights.WORK_RATE * 2,
            player.getOffTheBall() * WingBackRightLeftWeights.OFF_THE_BALL * 2,
            player.getStamina() * WingBackRightLeftWeights.STAMINA * 2),
        List.of(
                WingBackRightLeftWeights.DRIBBLING,
                WingBackRightLeftWeights.FIRST_TOUCH,
                WingBackRightLeftWeights.TECHNIQUE,
                WingBackRightLeftWeights.CONCENTRATION,
                WingBackRightLeftWeights.ACCELERATION,
                WingBackRightLeftWeights.AGILITY,
                WingBackRightLeftWeights.COMPOSURE,
                WingBackRightLeftWeights.ANTICIPATION,
                WingBackRightLeftWeights.POSITIONING,
                WingBackRightLeftWeights.MARKING * 2,
                WingBackRightLeftWeights.PASSING * 2,
                WingBackRightLeftWeights.TACKLING * 2,
                WingBackRightLeftWeights.DECISIONS * 2,
                WingBackRightLeftWeights.TEAMWORK * 2,
                WingBackRightLeftWeights.WORK_RATE * 2,
                WingBackRightLeftWeights.OFF_THE_BALL * 2,
                WingBackRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
