package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WingBackAuWBRL extends Position {

  public WingBackAuWBRL(LinePlayer player) {
    super(
        PositionNames.WING_BACK_AU_WBRL_NAME,
        List.of(
            player.getFirstTouch() * WingBackRightLeftWeights.FIRST_TOUCH,
            player.getPassing() * WingBackRightLeftWeights.PASSING,
            player.getTechnique() * WingBackRightLeftWeights.TECHNIQUE,
            player.getAnticipation() * WingBackRightLeftWeights.ANTICIPATION,
            player.getConcentration() * WingBackRightLeftWeights.CONCENTRATION,
            player.getDecisions() * WingBackRightLeftWeights.DECISIONS,
            player.getPositioning() * WingBackRightLeftWeights.POSITIONING,
            player.getAgility() * WingBackRightLeftWeights.AGILITY,
            player.getPace() * WingBackRightLeftWeights.PACE),
        List.of(
            player.getCrossing() * WingBackRightLeftWeights.CROSSING * 2,
            player.getDribbling() * WingBackRightLeftWeights.DRIBBLING * 2,
            player.getMarking() * WingBackRightLeftWeights.MARKING * 2,
            player.getTackling() * WingBackRightLeftWeights.TACKLING * 2,
            player.getOffTheBall() * WingBackRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * WingBackRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * WingBackRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * WingBackRightLeftWeights.ACCELERATION * 2,
            player.getStamina() * WingBackRightLeftWeights.STAMINA * 2),
        List.of(
                WingBackRightLeftWeights.FIRST_TOUCH,
                WingBackRightLeftWeights.PASSING,
                WingBackRightLeftWeights.TECHNIQUE,
                WingBackRightLeftWeights.ANTICIPATION,
                WingBackRightLeftWeights.CONCENTRATION,
                WingBackRightLeftWeights.DECISIONS,
                WingBackRightLeftWeights.POSITIONING,
                WingBackRightLeftWeights.AGILITY,
                WingBackRightLeftWeights.PACE,
                WingBackRightLeftWeights.CROSSING * 2,
                WingBackRightLeftWeights.DRIBBLING * 2,
                WingBackRightLeftWeights.MARKING * 2,
                WingBackRightLeftWeights.TACKLING * 2,
                WingBackRightLeftWeights.OFF_THE_BALL * 2,
                WingBackRightLeftWeights.TEAMWORK * 2,
                WingBackRightLeftWeights.WORK_RATE * 2,
                WingBackRightLeftWeights.ACCELERATION * 2,
                WingBackRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
