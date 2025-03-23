package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class DeepLyingPlaymakerSuMC extends Position {

  public DeepLyingPlaymakerSuMC(LinePlayer player) {
    super(
        PositionNames.DEEP_LYING_PLAYMAKER_SU_MC_NAME,
        List.of(
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION,
            player.getOffTheBall() * MidfielderCentreWeights.OFF_THE_BALL,
            player.getPositioning() * MidfielderCentreWeights.POSITIONING,
            player.getBalance() * MidfielderCentreWeights.BALANCE),
        List.of(
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * MidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE * 2,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE * 2,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS * 2,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK * 2,
            player.getVision() * MidfielderCentreWeights.VISION * 2),
        List.of(
                MidfielderCentreWeights.ANTICIPATION,
                MidfielderCentreWeights.OFF_THE_BALL,
                MidfielderCentreWeights.POSITIONING,
                MidfielderCentreWeights.BALANCE,
                MidfielderCentreWeights.FIRST_TOUCH * 2,
                MidfielderCentreWeights.PASSING * 2,
                MidfielderCentreWeights.TECHNIQUE * 2,
                MidfielderCentreWeights.COMPOSURE * 2,
                MidfielderCentreWeights.DECISIONS * 2,
                MidfielderCentreWeights.TEAMWORK * 2,
                MidfielderCentreWeights.VISION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
