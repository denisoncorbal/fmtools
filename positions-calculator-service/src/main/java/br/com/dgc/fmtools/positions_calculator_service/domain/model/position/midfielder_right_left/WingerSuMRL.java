package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class WingerSuMRL extends Position {

  public WingerSuMRL(LinePlayer player) {
    super(
        PositionNames.WINGER_SU_MRL_NAME,
        List.of(
            player.getFirstTouch() * MidfielderRightLeftWeights.FIRST_TOUCH,
            player.getPassing() * MidfielderRightLeftWeights.PASSING,
            player.getWorkRate() * MidfielderRightLeftWeights.WORK_RATE,
            player.getAgility() * MidfielderRightLeftWeights.AGILITY,
            player.getStamina() * MidfielderRightLeftWeights.STAMINA),
        List.of(
            player.getCrossing() * MidfielderRightLeftWeights.CROSSING * 2,
            player.getDribbling() * MidfielderRightLeftWeights.DRIBBLING * 2,
            player.getTechnique() * MidfielderRightLeftWeights.TECHNIQUE * 2,
            player.getOffTheBall() * MidfielderRightLeftWeights.OFF_THE_BALL * 2,
            player.getAcceleration() * MidfielderRightLeftWeights.ACCELERATION * 2,
            player.getPace() * MidfielderRightLeftWeights.PACE * 2),
        List.of(
                MidfielderRightLeftWeights.FIRST_TOUCH,
                MidfielderRightLeftWeights.PASSING,
                MidfielderRightLeftWeights.WORK_RATE,
                MidfielderRightLeftWeights.AGILITY,
                MidfielderRightLeftWeights.STAMINA,
                MidfielderRightLeftWeights.CROSSING * 2,
                MidfielderRightLeftWeights.DRIBBLING * 2,
                MidfielderRightLeftWeights.TECHNIQUE * 2,
                MidfielderRightLeftWeights.OFF_THE_BALL * 2,
                MidfielderRightLeftWeights.ACCELERATION * 2,
                MidfielderRightLeftWeights.PACE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
