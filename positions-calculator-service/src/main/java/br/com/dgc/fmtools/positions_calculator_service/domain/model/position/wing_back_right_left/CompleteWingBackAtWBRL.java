package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class CompleteWingBackAtWBRL extends Position {

  public CompleteWingBackAtWBRL(LinePlayer player) {
    super(
        PositionNames.COMPLETE_WING_BACK_AT_WBRL_NAME,
        List.of(
            player.getTackling() * WingBackRightLeftWeights.TACKLING,
            player.getAnticipation() * WingBackRightLeftWeights.ANTICIPATION,
            player.getComposure() * WingBackRightLeftWeights.COMPOSURE,
            player.getAgility() * WingBackRightLeftWeights.AGILITY,
            player.getBalance() * WingBackRightLeftWeights.BALANCE),
        List.of(
            player.getCrossing() * WingBackRightLeftWeights.CROSSING * 2,
            player.getDribbling() * WingBackRightLeftWeights.DRIBBLING * 2,
            player.getFirstTouch() * WingBackRightLeftWeights.FIRST_TOUCH * 2,
            player.getPassing() * WingBackRightLeftWeights.PASSING * 2,
            player.getTechnique() * WingBackRightLeftWeights.TECHNIQUE * 2,
            player.getDecisions() * WingBackRightLeftWeights.DECISIONS * 2,
            player.getOffTheBall() * WingBackRightLeftWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * WingBackRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * WingBackRightLeftWeights.WORK_RATE * 2,
            player.getAcceleration() * WingBackRightLeftWeights.ACCELERATION * 2,
            player.getPace() * WingBackRightLeftWeights.PACE * 2,
            player.getStamina() * WingBackRightLeftWeights.STAMINA * 2,
            player.getFlair() * WingBackRightLeftWeights.FLAIR * 2),
        List.of(
                WingBackRightLeftWeights.TACKLING,
                WingBackRightLeftWeights.ANTICIPATION,
                WingBackRightLeftWeights.COMPOSURE,
                WingBackRightLeftWeights.AGILITY,
                WingBackRightLeftWeights.BALANCE,
                WingBackRightLeftWeights.CROSSING * 2,
                WingBackRightLeftWeights.DRIBBLING * 2,
                WingBackRightLeftWeights.FIRST_TOUCH * 2,
                WingBackRightLeftWeights.PASSING * 2,
                WingBackRightLeftWeights.TECHNIQUE * 2,
                WingBackRightLeftWeights.DECISIONS * 2,
                WingBackRightLeftWeights.OFF_THE_BALL * 2,
                WingBackRightLeftWeights.TEAMWORK * 2,
                WingBackRightLeftWeights.WORK_RATE * 2,
                WingBackRightLeftWeights.ACCELERATION * 2,
                WingBackRightLeftWeights.PACE * 2,
                WingBackRightLeftWeights.STAMINA * 2,
                WingBackRightLeftWeights.FLAIR * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
