package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class AdvancedPlaymakerAtMC extends Position {

  public AdvancedPlaymakerAtMC(LinePlayer player) {
    super(
        PositionNames.ADVANCED_PLAYMAKER_AT_MC_NAME,
        List.of(
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION,
            player.getFlair() * MidfielderCentreWeights.FLAIR,
            player.getAcceleration() * MidfielderCentreWeights.ACCELERATION,
            player.getAgility() * MidfielderCentreWeights.AGILITY),
        List.of(
            player.getDribbling() * MidfielderCentreWeights.DRIBBLING * 2,
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * MidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE * 2,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE * 2,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS * 2,
            player.getOffTheBall() * MidfielderCentreWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK * 2,
            player.getVision() * MidfielderCentreWeights.VISION * 2),
        List.of(
                MidfielderCentreWeights.ANTICIPATION,
                MidfielderCentreWeights.FLAIR,
                MidfielderCentreWeights.ACCELERATION,
                MidfielderCentreWeights.AGILITY,
                MidfielderCentreWeights.DRIBBLING * 2,
                MidfielderCentreWeights.FIRST_TOUCH * 2,
                MidfielderCentreWeights.PASSING * 2,
                MidfielderCentreWeights.TECHNIQUE * 2,
                MidfielderCentreWeights.COMPOSURE * 2,
                MidfielderCentreWeights.DECISIONS * 2,
                MidfielderCentreWeights.OFF_THE_BALL * 2,
                MidfielderCentreWeights.TEAMWORK * 2,
                MidfielderCentreWeights.VISION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
