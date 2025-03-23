package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class DeepLyingForwardAtSC extends Position {

  public DeepLyingForwardAtSC(LinePlayer player) {
    super(
        PositionNames.DEEP_LYING_FORWARD_AT_SC_NAME,
        List.of(
            player.getDribbling() * StrikerCentreWeights.DRIBBLING,
            player.getFinishing() * StrikerCentreWeights.FINISHING,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION,
            player.getFlair() * StrikerCentreWeights.FLAIR,
            player.getVision() * StrikerCentreWeights.VISION,
            player.getBalance() * StrikerCentreWeights.BALANCE,
            player.getStrength() * StrikerCentreWeights.STRENGTH),
        List.of(
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * StrikerCentreWeights.PASSING * 2,
            player.getTechnique() * StrikerCentreWeights.TECHNIQUE * 2,
            player.getComposure() * StrikerCentreWeights.COMPOSURE * 2,
            player.getDecisions() * StrikerCentreWeights.DECISIONS * 2,
            player.getOffTheBall() * StrikerCentreWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * StrikerCentreWeights.TEAMWORK * 2),
        List.of(
                StrikerCentreWeights.DRIBBLING,
                StrikerCentreWeights.FINISHING,
                StrikerCentreWeights.ANTICIPATION,
                StrikerCentreWeights.FLAIR,
                StrikerCentreWeights.VISION,
                StrikerCentreWeights.BALANCE,
                StrikerCentreWeights.STRENGTH,
                StrikerCentreWeights.FIRST_TOUCH * 2,
                StrikerCentreWeights.PASSING * 2,
                StrikerCentreWeights.TECHNIQUE * 2,
                StrikerCentreWeights.COMPOSURE * 2,
                StrikerCentreWeights.DECISIONS * 2,
                StrikerCentreWeights.OFF_THE_BALL * 2,
                StrikerCentreWeights.TEAMWORK * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
