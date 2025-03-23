package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class CentralMidfielderAtMC extends Position {

  public CentralMidfielderAtMC(LinePlayer player) {
    super(
        PositionNames.CENTRAL_MIDFIELDER_AT_MC_NAME,
        List.of(
            player.getLongShots() * MidfielderCentreWeights.LONG_SHOTS,
            player.getTackling() * MidfielderCentreWeights.TACKLING,
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE,
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK,
            player.getVision() * MidfielderCentreWeights.VISION,
            player.getWorkRate() * MidfielderCentreWeights.WORK_RATE,
            player.getAcceleration() * MidfielderCentreWeights.ACCELERATION,
            player.getStamina() * MidfielderCentreWeights.STAMINA),
        List.of(
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * MidfielderCentreWeights.PASSING * 2,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS * 2,
            player.getOffTheBall() * MidfielderCentreWeights.OFF_THE_BALL * 2),
        List.of(
                MidfielderCentreWeights.LONG_SHOTS,
                MidfielderCentreWeights.TACKLING,
                MidfielderCentreWeights.TECHNIQUE,
                MidfielderCentreWeights.ANTICIPATION,
                MidfielderCentreWeights.COMPOSURE,
                MidfielderCentreWeights.TEAMWORK,
                MidfielderCentreWeights.VISION,
                MidfielderCentreWeights.WORK_RATE,
                MidfielderCentreWeights.ACCELERATION,
                MidfielderCentreWeights.STAMINA,
                MidfielderCentreWeights.FIRST_TOUCH * 2,
                MidfielderCentreWeights.PASSING * 2,
                MidfielderCentreWeights.DECISIONS * 2,
                MidfielderCentreWeights.OFF_THE_BALL * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
