package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WideMidfielderDeMRL extends Position {

  public WideMidfielderDeMRL(LinePlayer player) {
    super(
        PositionNames.WIDE_MIDFIELDER_DE_MRL_NAME,
        List.of(
            player.getCrossing() * MidfielderRightLeftWeights.CROSSING,
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH,
            player.getMarking() * MidfielderRightLeftWeights.MARKING,
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE,
            player.getAnticipation() * MidfielderRightLeftWeights.ANTICIPATION,
            player.getComposure() * MidfielderRightLeftWeights.COMPOSURE,
            player.getStamina() * MidfielderRightLeftWeights.STAMINA),
        List.of(
            player.getPassing() * MidfielderRightLeftWeights.PASSING * 2,
            player.getTackling() * MidfielderRightLeftWeights.TACKLING * 2,
            player.getConcentration() * MidfielderRightLeftWeights.CONCENTRATION * 2,
            player.getDecisions() * MidfielderRightLeftWeights.DECISIONS * 2,
            player.getPositioning() * MidfielderRightLeftWeights.POSITIONING * 2,
            player.getTeamwork() * MidfielderRightLeftWeights.TEAMWORK * 2,
            player.getWorkRate() * MidfielderRightLeftWeights.WORK_RATE * 2),
        List.of(
                MidfielderRightLeftWeights.CROSSING,
                MidfielderRightLeftWeights.FIRST_TOUCH,
                MidfielderRightLeftWeights.MARKING,
                MidfielderRightLeftWeights.TECHNIQUE,
                MidfielderRightLeftWeights.ANTICIPATION,
                MidfielderRightLeftWeights.COMPOSURE,
                MidfielderRightLeftWeights.STAMINA,
                MidfielderRightLeftWeights.PASSING * 2,
                MidfielderRightLeftWeights.TACKLING * 2,
                MidfielderRightLeftWeights.CONCENTRATION * 2,
                MidfielderRightLeftWeights.DECISIONS * 2,
                MidfielderRightLeftWeights.POSITIONING * 2,
                MidfielderRightLeftWeights.TEAMWORK * 2,
                MidfielderRightLeftWeights.WORK_RATE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
