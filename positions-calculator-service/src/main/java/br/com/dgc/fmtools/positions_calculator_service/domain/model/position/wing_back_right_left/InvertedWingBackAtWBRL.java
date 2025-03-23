package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class InvertedWingBackAtWBRL extends Position {

  public InvertedWingBackAtWBRL(LinePlayer player) {
    super(
        PositionNames.INVERTED_WING_BACK_AT_WBRL_NAME,
        List.of(
            player.getFirstTouch() * WingBackRightLeftWeights.FIRST_TOUCH,
            player.getLongShots() * WingBackRightLeftWeights.LONG_SHOTS,
            player.getAnticipation() * WingBackRightLeftWeights.ANTICIPATION,
            player.getComposure() * WingBackRightLeftWeights.COMPOSURE,
            player.getConcentration() * WingBackRightLeftWeights.CONCENTRATION,
            player.getFlair() * WingBackRightLeftWeights.FLAIR,
            player.getPositioning() * WingBackRightLeftWeights.POSITIONING,
            player.getAgility() * WingBackRightLeftWeights.AGILITY,
            player.getPace() * WingBackRightLeftWeights.PACE),
        List.of(
            player.getDribbling() * WingBackRightLeftWeights.DRIBBLING * 2,
            player.getMarking() * WingBackRightLeftWeights.MARKING * 2,
            player.getPassing() * WingBackRightLeftWeights.PASSING * 2,
            player.getTackling() * WingBackRightLeftWeights.TACKLING * 2,
            player.getTechnique() * WingBackRightLeftWeights.TECHNIQUE * 2,
            player.getDecisions() * WingBackRightLeftWeights.DECISIONS * 2,
            player.getOffTheBall() * WingBackRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * WingBackRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * WingBackRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * WingBackRightLeftWeights.ACCELERATION * 2,
            player.getStamina() * WingBackRightLeftWeights.STAMINA * 2),
        List.of(
                WingBackRightLeftWeights.FIRST_TOUCH,
                WingBackRightLeftWeights.LONG_SHOTS,
                WingBackRightLeftWeights.ANTICIPATION,
                WingBackRightLeftWeights.COMPOSURE,
                WingBackRightLeftWeights.CONCENTRATION,
                WingBackRightLeftWeights.FLAIR,
                WingBackRightLeftWeights.POSITIONING,
                WingBackRightLeftWeights.AGILITY,
                WingBackRightLeftWeights.PACE,
                WingBackRightLeftWeights.DRIBBLING * 2,
                WingBackRightLeftWeights.MARKING * 2,
                WingBackRightLeftWeights.PASSING * 2,
                WingBackRightLeftWeights.TACKLING * 2,
                WingBackRightLeftWeights.TECHNIQUE * 2,
                WingBackRightLeftWeights.DECISIONS * 2,
                WingBackRightLeftWeights.OFF_THE_BALL * 2,
                WingBackRightLeftWeights.TEAMWORK * 2,
                WingBackRightLeftWeights.WORK_RATE * 2,
                WingBackRightLeftWeights.ACCELERATION * 2,
                WingBackRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
