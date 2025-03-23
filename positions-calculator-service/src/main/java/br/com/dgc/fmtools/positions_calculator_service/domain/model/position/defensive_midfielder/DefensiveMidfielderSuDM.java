package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class DefensiveMidfielderSuDM extends Position {

  public DefensiveMidfielderSuDM(LinePlayer player) {
    super(
        PositionNames.DEFENSIVE_MIDFIELDER_SU_DM_NAME,
        List.of(
            player.getFirstTouch() * DefensiveMidfielderWeights.FIRST_TOUCH,
            player.getMarking() * DefensiveMidfielderWeights.MARKING,
            player.getPassing() * DefensiveMidfielderWeights.PASSING,
            player.getAggression() * DefensiveMidfielderWeights.AGGRESSION,
            player.getComposure() * DefensiveMidfielderWeights.COMPOSURE,
            player.getDecisions() * DefensiveMidfielderWeights.DECISIONS,
            player.getWorkRate() * DefensiveMidfielderWeights.WORK_RATE,
            player.getStamina() * DefensiveMidfielderWeights.STAMINA,
            player.getStrength() * DefensiveMidfielderWeights.STRENGTH),
        List.of(
            player.getTackling() * DefensiveMidfielderWeights.TACKLING * 2,
            player.getAnticipation() * DefensiveMidfielderWeights.ANTICIPATION * 2,
            player.getConcentration() * DefensiveMidfielderWeights.CONCENTRATION * 2,
            player.getPositioning() * DefensiveMidfielderWeights.POSITIONING * 2,
            player.getTeamwork() * DefensiveMidfielderWeights.TEAMWORK * 2),
        List.of(
                DefensiveMidfielderWeights.FIRST_TOUCH,
                DefensiveMidfielderWeights.MARKING,
                DefensiveMidfielderWeights.PASSING,
                DefensiveMidfielderWeights.AGGRESSION,
                DefensiveMidfielderWeights.COMPOSURE,
                DefensiveMidfielderWeights.DECISIONS,
                DefensiveMidfielderWeights.WORK_RATE,
                DefensiveMidfielderWeights.STAMINA,
                DefensiveMidfielderWeights.STRENGTH,
                DefensiveMidfielderWeights.TACKLING * 2,
                DefensiveMidfielderWeights.ANTICIPATION * 2,
                DefensiveMidfielderWeights.CONCENTRATION * 2,
                DefensiveMidfielderWeights.POSITIONING * 2,
                DefensiveMidfielderWeights.TEAMWORK * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
