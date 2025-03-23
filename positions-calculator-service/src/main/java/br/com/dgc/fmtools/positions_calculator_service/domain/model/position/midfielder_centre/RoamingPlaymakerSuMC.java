package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class RoamingPlaymakerSuMC extends Position {

  public RoamingPlaymakerSuMC(LinePlayer player) {
    super(
        PositionNames.ROAMING_PLAYMAKER_SU_MC_NAME,
        List.of(
            player.getDribbling() * MidfielderCentreWeights.DRIBBLING,
            player.getLongShots() * MidfielderCentreWeights.LONG_SHOTS,
            player.getConcentration() * MidfielderCentreWeights.CONCENTRATION,
            player.getPositioning() * MidfielderCentreWeights.POSITIONING,
            player.getAgility() * MidfielderCentreWeights.AGILITY,
            player.getBalance() * MidfielderCentreWeights.BALANCE,
            player.getPace() * MidfielderCentreWeights.PACE),
        List.of(
            player.getFirstTouch() * MidfielderCentreWeights.FIRST_TOUCH * 2,
            player.getPassing() * MidfielderCentreWeights.PASSING * 2,
            player.getTechnique() * MidfielderCentreWeights.TECHNIQUE * 2,
            player.getAnticipation() * MidfielderCentreWeights.ANTICIPATION * 2,
            player.getComposure() * MidfielderCentreWeights.COMPOSURE * 2,
            player.getDecisions() * MidfielderCentreWeights.DECISIONS * 2,
            player.getOffTheBall() * MidfielderCentreWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * MidfielderCentreWeights.TEAMWORK * 2,
            player.getVision() * MidfielderCentreWeights.VISION * 2,
            player.getWorkRate() * MidfielderCentreWeights.WORK_RATE * 2,
            player.getAcceleration() * MidfielderCentreWeights.ACCELERATION * 2,
            player.getStamina() * MidfielderCentreWeights.STAMINA * 2),
        List.of(
                MidfielderCentreWeights.DRIBBLING,
                MidfielderCentreWeights.LONG_SHOTS,
                MidfielderCentreWeights.CONCENTRATION,
                MidfielderCentreWeights.POSITIONING,
                MidfielderCentreWeights.AGILITY,
                MidfielderCentreWeights.BALANCE,
                MidfielderCentreWeights.PACE,
                MidfielderCentreWeights.FIRST_TOUCH * 2,
                MidfielderCentreWeights.PASSING * 2,
                MidfielderCentreWeights.TECHNIQUE * 2,
                MidfielderCentreWeights.ANTICIPATION * 2,
                MidfielderCentreWeights.COMPOSURE * 2,
                MidfielderCentreWeights.DECISIONS * 2,
                MidfielderCentreWeights.OFF_THE_BALL * 2,
                MidfielderCentreWeights.TEAMWORK * 2,
                MidfielderCentreWeights.VISION * 2,
                MidfielderCentreWeights.WORK_RATE * 2,
                MidfielderCentreWeights.ACCELERATION * 2,
                MidfielderCentreWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
