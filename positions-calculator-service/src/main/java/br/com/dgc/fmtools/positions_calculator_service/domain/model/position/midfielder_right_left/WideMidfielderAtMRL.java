package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WideMidfielderAtMRL extends Position {

  public WideMidfielderAtMRL(LinePlayer player) {
    super(
        PositionNames.WIDE_MIDFIELDER_AT_MRL_NAME,
        List.of(
            player.getTackling() * MidfielderRightLeftWeights.TACKLING,
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE,
            player.getAnticipation() * MidfielderRightLeftWeights.ANTICIPATION,
            player.getComposure() * MidfielderRightLeftWeights.COMPOSURE,
            player.getOffTheBall() * MidfielderRightLeftWeights.OFF_THE_BALL,
            player.getVision() * MidfielderRightLeftWeights.VISION),
        List.of(
            player.getCrossing() * MidfielderRightLeftWeights.CROSSING * 2,
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH * 2,
            player.getPassing() * MidfielderRightLeftWeights.PASSING * 2,
            player.getDecisions() * MidfielderRightLeftWeights.DECISIONS * 2,
            player.getTeamwork() * MidfielderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * MidfielderRightLeftWeights.WORK_RATE * 2,
            player.getStamina() * MidfielderRightLeftWeights.STAMINA * 2),
        List.of(
                MidfielderRightLeftWeights.TACKLING,
                MidfielderRightLeftWeights.TECHNIQUE,
                MidfielderRightLeftWeights.ANTICIPATION,
                MidfielderRightLeftWeights.COMPOSURE,
                MidfielderRightLeftWeights.OFF_THE_BALL,
                MidfielderRightLeftWeights.VISION,
                MidfielderRightLeftWeights.CROSSING * 2,
                MidfielderRightLeftWeights.FIRST_TOUCH * 2,
                MidfielderRightLeftWeights.PASSING * 2,
                MidfielderRightLeftWeights.DECISIONS * 2,
                MidfielderRightLeftWeights.TEAMWORK * 2,
                MidfielderRightLeftWeights.WORK_RATE * 2,
                MidfielderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
