package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class PoacherAtSC extends Position {

  public PoacherAtSC(LinePlayer player) {
    super(
        PositionNames.POACHER_AT_SC_NAME,
        List.of(
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH,
            player.getHeading() * StrikerCentreWeights.HEADING,
            player.getTechnique() * StrikerCentreWeights.TECHNIQUE,
            player.getDecisions() * StrikerCentreWeights.DECISIONS,
            player.getAcceleration() * StrikerCentreWeights.ACCELERATION),
        List.of(
            player.getFinishing() * StrikerCentreWeights.FINISHING * 2,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION * 2,
            player.getComposure() * StrikerCentreWeights.COMPOSURE * 2,
            player.getOffTheBall() * StrikerCentreWeights.OFF_THE_BALL * 2),
        List.of(
                StrikerCentreWeights.FIRST_TOUCH,
                StrikerCentreWeights.HEADING,
                StrikerCentreWeights.TECHNIQUE,
                StrikerCentreWeights.DECISIONS,
                StrikerCentreWeights.ACCELERATION,
                StrikerCentreWeights.FINISHING * 2,
                StrikerCentreWeights.ANTICIPATION * 2,
                StrikerCentreWeights.COMPOSURE * 2,
                StrikerCentreWeights.OFF_THE_BALL * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
