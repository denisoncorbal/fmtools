package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class FalseNineSuSC extends Position {

  public FalseNineSuSC(LinePlayer player) {
    super(
        PositionNames.FALSE_NINE_SU_SC_NAME,
        List.of(
            player.getFinishing() * StrikerCentreWeights.FINISHING,
            player.getAnticipation() * StrikerCentreWeights.ANTICIPATION,
            player.getFlair() * StrikerCentreWeights.FLAIR,
            player.getTeamwork() * StrikerCentreWeights.TEAMWORK,
            player.getBalance() * StrikerCentreWeights.BALANCE),
        List.of(
            player.getDribbling() * StrikerCentreWeights.DRIBBLING * 2,
            player.getFirstTouch() * StrikerCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * StrikerCentreWeights.PASSING * 2,
            player.getTechnique() * StrikerCentreWeights.TECHNIQUE * 2,
            player.getComposure() * StrikerCentreWeights.COMPOSURE * 2,
            player.getDecisions() * StrikerCentreWeights.DECISIONS * 2,
            player.getOffTheBall() * StrikerCentreWeights.OFF_THE_BALL * 2,
            player.getVision() * StrikerCentreWeights.VISION * 2,
            player.getAcceleration() * StrikerCentreWeights.ACCELERATION * 2,
            player.getAgility() * StrikerCentreWeights.AGILITY * 2),
        List.of(
                StrikerCentreWeights.FINISHING,
                StrikerCentreWeights.ANTICIPATION,
                StrikerCentreWeights.FLAIR,
                StrikerCentreWeights.TEAMWORK,
                StrikerCentreWeights.BALANCE,
                StrikerCentreWeights.DRIBBLING * 2,
                StrikerCentreWeights.FIRST_TOUCH * 2,
                StrikerCentreWeights.PASSING * 2,
                StrikerCentreWeights.TECHNIQUE * 2,
                StrikerCentreWeights.COMPOSURE * 2,
                StrikerCentreWeights.DECISIONS * 2,
                StrikerCentreWeights.OFF_THE_BALL * 2,
                StrikerCentreWeights.VISION * 2,
                StrikerCentreWeights.ACCELERATION * 2,
                StrikerCentreWeights.AGILITY * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
