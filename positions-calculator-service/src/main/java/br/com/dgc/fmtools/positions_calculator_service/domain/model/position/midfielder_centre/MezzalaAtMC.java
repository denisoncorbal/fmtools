package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class MezzalaAtMC extends Position {

  public MezzalaAtMC(LinePlayer player) {
    super(
        PositionNames.MEZZALA_AT_MC_NAME,
        List.of(
            player.getFinishing() * MidfielderCentreWeights.FINISHING,
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH,
            player.getLongShots() * MidfielderCentreWeights.LONG_SHOTS,
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE,
            player.getFlair() * MidfielderCentreWeights.FLAIR,
            player.getBalance() * MidfielderCentreWeights.BALANCE,
            player.getStamina() * MidfielderCentreWeights.STAMINA),
        List.of(
            player.getDribbling() * MidfielderCentreWeights.DRIBBLING * 2,
            player.getPassing() * MidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE * 2,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS * 2,
            player.getOffTheBall() * MidfielderCentreWeights.OFF_THE_BALL * 2,
            player.getVision() * MidfielderCentreWeights.VISION * 2,
            player.getWorkRate() * MidfielderCentreWeights.WORK_RATE * 2,
            player.getAcceleration() * MidfielderCentreWeights.ACCELERATION * 2),
        List.of(
                MidfielderCentreWeights.FINISHING,
                MidfielderCentreWeights.FIRST_TOUCH,
                MidfielderCentreWeights.LONG_SHOTS,
                MidfielderCentreWeights.ANTICIPATION,
                MidfielderCentreWeights.COMPOSURE,
                MidfielderCentreWeights.FLAIR,
                MidfielderCentreWeights.BALANCE,
                MidfielderCentreWeights.STAMINA,
                MidfielderCentreWeights.DRIBBLING * 2,
                MidfielderCentreWeights.PASSING * 2,
                MidfielderCentreWeights.TECHNIQUE * 2,
                MidfielderCentreWeights.DECISIONS * 2,
                MidfielderCentreWeights.OFF_THE_BALL * 2,
                MidfielderCentreWeights.VISION * 2,
                MidfielderCentreWeights.WORK_RATE * 2,
                MidfielderCentreWeights.ACCELERATION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
