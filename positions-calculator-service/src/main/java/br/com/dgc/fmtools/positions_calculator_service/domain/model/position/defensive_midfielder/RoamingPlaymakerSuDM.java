package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class RoamingPlaymakerSuDM extends Position {

  public RoamingPlaymakerSuDM(LinePlayer player) {
    super(
        PositionNames.ROAMING_PLAYMAKER_SU_DM_NAME,
        List.of(
            player.getDribbling() * DefensiveMidfielderWeights.DRIBBLING,
            player.getLongShots() * DefensiveMidfielderWeights.LONG_SHOTS,
            player.getConcentration() * DefensiveMidfielderWeights.CONCENTRATION,
            player.getPositioning() * DefensiveMidfielderWeights.POSITIONING,
            player.getAgility() * DefensiveMidfielderWeights.AGILITY,
            player.getBalance() * DefensiveMidfielderWeights.BALANCE,
            player.getPace() * DefensiveMidfielderWeights.PACE),
        List.of(
            player.getFirstTouch() * DefensiveMidfielderWeights.FIRST_TOUCH * 2,
            player.getPassing() * DefensiveMidfielderWeights.PASSING * 2,
            player.getTechnique() * DefensiveMidfielderWeights.TECHNIQUE * 2,
            player.getAnticipation() * DefensiveMidfielderWeights.ANTICIPATION * 2,
            player.getComposure() * DefensiveMidfielderWeights.COMPOSURE * 2,
            player.getDecisions() * DefensiveMidfielderWeights.DECISIONS * 2,
            player.getOffTheBall() * DefensiveMidfielderWeights.OFF_THE_BALL * 2,
            player.getTeamwork() * DefensiveMidfielderWeights.TEAMWORK * 2,
            player.getVision() * DefensiveMidfielderWeights.VISION * 2,
            player.getWorkRate() * DefensiveMidfielderWeights.WORK_RATE * 2,
            player.getAcceleration() * DefensiveMidfielderWeights.ACCELERATION * 2,
            player.getStamina() * DefensiveMidfielderWeights.STAMINA * 2),
        List.of(
                DefensiveMidfielderWeights.DRIBBLING,
                DefensiveMidfielderWeights.LONG_SHOTS,
                DefensiveMidfielderWeights.CONCENTRATION,
                DefensiveMidfielderWeights.POSITIONING,
                DefensiveMidfielderWeights.AGILITY,
                DefensiveMidfielderWeights.BALANCE,
                DefensiveMidfielderWeights.PACE,
                DefensiveMidfielderWeights.FIRST_TOUCH * 2,
                DefensiveMidfielderWeights.PASSING * 2,
                DefensiveMidfielderWeights.TECHNIQUE * 2,
                DefensiveMidfielderWeights.ANTICIPATION * 2,
                DefensiveMidfielderWeights.COMPOSURE * 2,
                DefensiveMidfielderWeights.DECISIONS * 2,
                DefensiveMidfielderWeights.OFF_THE_BALL * 2,
                DefensiveMidfielderWeights.TEAMWORK * 2,
                DefensiveMidfielderWeights.VISION * 2,
                DefensiveMidfielderWeights.WORK_RATE * 2,
                DefensiveMidfielderWeights.ACCELERATION * 2,
                DefensiveMidfielderWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
