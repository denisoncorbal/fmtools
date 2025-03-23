package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WingBackDeWBRL extends Position {

  public WingBackDeWBRL(LinePlayer player) {
    super(
        PositionNames.WING_BACK_DE_WBRL_NAME,
        List.of(
            player.getCrossing() * WingBackRightLeftWeights.CROSSING,
            player.getDribbling() * WingBackRightLeftWeights.DRIBBLING,
            player.getFirstTouch() * WingBackRightLeftWeights.FIRST_TOUCH,
            player.getPassing() * WingBackRightLeftWeights.PASSING,
            player.getTechnique() * WingBackRightLeftWeights.TECHNIQUE,
            player.getConcentration() * WingBackRightLeftWeights.CONCENTRATION,
            player.getDecisions() * WingBackRightLeftWeights.DECISIONS,
            player.getOffTheBall() * WingBackRightLeftWeights.OFF_THE_BALL,
            player.getAgility() * WingBackRightLeftWeights.AGILITY,
            player.getPace() * WingBackRightLeftWeights.PACE),
        List.of(
            player.getMarking() * WingBackRightLeftWeights.MARKING * 2,
            player.getTackling() * WingBackRightLeftWeights.TACKLING * 2,
            player.getAnticipation() * WingBackRightLeftWeights.ANTICIPATION * 2,
            player.getPositioning() * WingBackRightLeftWeights.POSITIONING * 2,
            player.getTeamwork() * WingBackRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * WingBackRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * WingBackRightLeftWeights.ACCELERATION * 2,
            player.getStamina() * WingBackRightLeftWeights.STAMINA * 2),
        List.of(
                WingBackRightLeftWeights.CROSSING,
                WingBackRightLeftWeights.DRIBBLING,
                WingBackRightLeftWeights.FIRST_TOUCH,
                WingBackRightLeftWeights.PASSING,
                WingBackRightLeftWeights.TECHNIQUE,
                WingBackRightLeftWeights.CONCENTRATION,
                WingBackRightLeftWeights.DECISIONS,
                WingBackRightLeftWeights.OFF_THE_BALL,
                WingBackRightLeftWeights.AGILITY,
                WingBackRightLeftWeights.PACE,
                WingBackRightLeftWeights.MARKING * 2,
                WingBackRightLeftWeights.TACKLING * 2,
                WingBackRightLeftWeights.ANTICIPATION * 2,
                WingBackRightLeftWeights.POSITIONING * 2,
                WingBackRightLeftWeights.TEAMWORK * 2,
                WingBackRightLeftWeights.WORK_RATE * 2,
                WingBackRightLeftWeights.ACCELERATION * 2,
                WingBackRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
