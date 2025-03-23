package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WideMidfielderSuMRL extends Position {

  public WideMidfielderSuMRL(LinePlayer player) {
    super(
        PositionNames.WIDE_MIDFIELDER_SU_MRL_NAME,
        List.of(
            player.getCrossing() * MidfielderRightLeftWeights.CROSSING,
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH,
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE,
            player.getAnticipation() * MidfielderRightLeftWeights.ANTICIPATION,
            player.getComposure() * MidfielderRightLeftWeights.COMPOSURE,
            player.getConcentration() * MidfielderRightLeftWeights.CONCENTRATION,
            player.getOffTheBall() * MidfielderRightLeftWeights.OFF_THE_BALL,
            player.getPositioning() * MidfielderRightLeftWeights.POSITIONING,
            player.getVision() * MidfielderRightLeftWeights.VISION),
        List.of(
            player.getPassing() * MidfielderRightLeftWeights.PASSING * 2,
            player.getTackling() * MidfielderRightLeftWeights.TACKLING * 2,
            player.getDecisions() * MidfielderRightLeftWeights.DECISIONS * 2,
            player.getTeamwork() * MidfielderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * MidfielderRightLeftWeights.WORK_RATE * 2,
            player.getStamina() * MidfielderRightLeftWeights.STAMINA * 2),
        List.of(
                MidfielderRightLeftWeights.CROSSING,
                MidfielderRightLeftWeights.FIRST_TOUCH,
                MidfielderRightLeftWeights.TECHNIQUE,
                MidfielderRightLeftWeights.ANTICIPATION,
                MidfielderRightLeftWeights.COMPOSURE,
                MidfielderRightLeftWeights.CONCENTRATION,
                MidfielderRightLeftWeights.OFF_THE_BALL,
                MidfielderRightLeftWeights.POSITIONING,
                MidfielderRightLeftWeights.VISION,
                MidfielderRightLeftWeights.PASSING * 2,
                MidfielderRightLeftWeights.TACKLING * 2,
                MidfielderRightLeftWeights.DECISIONS * 2,
                MidfielderRightLeftWeights.TEAMWORK * 2,
                MidfielderRightLeftWeights.WORK_RATE * 2,
                MidfielderRightLeftWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
