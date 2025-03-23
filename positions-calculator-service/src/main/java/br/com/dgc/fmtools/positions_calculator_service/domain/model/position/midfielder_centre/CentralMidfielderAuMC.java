package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class CentralMidfielderAuMC extends Position {

  public CentralMidfielderAuMC(LinePlayer player) {
    super(
        PositionNames.CENTRAL_MIDFIELDER_AU_MC_NAME,
        List.of(
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE,
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE,
            player.getConcentration() * MidfielderCentreWeights.CONCENTRATION,
            player.getOffTheBall() * MidfielderCentreWeights.OFF_THE_BALL,
            player.getVision() * MidfielderCentreWeights.VISION,
            player.getWorkRate() * MidfielderCentreWeights.WORK_RATE,
            player.getStamina() * MidfielderCentreWeights.STAMINA),
        List.of(
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * MidfielderCentreWeights.PASSING * 2,
            player.getTackling() * MidfielderCentreWeights.TACKLING * 2,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS * 2,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK * 2),
        List.of(
                MidfielderCentreWeights.TECHNIQUE,
                MidfielderCentreWeights.ANTICIPATION,
                MidfielderCentreWeights.COMPOSURE,
                MidfielderCentreWeights.CONCENTRATION,
                MidfielderCentreWeights.OFF_THE_BALL,
                MidfielderCentreWeights.VISION,
                MidfielderCentreWeights.WORK_RATE,
                MidfielderCentreWeights.STAMINA,
                MidfielderCentreWeights.FIRST_TOUCH * 2,
                MidfielderCentreWeights.PASSING * 2,
                MidfielderCentreWeights.TACKLING * 2,
                MidfielderCentreWeights.DECISIONS * 2,
                MidfielderCentreWeights.TEAMWORK * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
