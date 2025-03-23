package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class HalfBackDeDM extends Position {

  public HalfBackDeDM(LinePlayer player) {
    super(
        PositionNames.HALF_BACK_DE_DM_NAME,
        List.of(
            player.getFirstTouch() * DefensiveMidfielderWeights.FIRST_TOUCH,
            player.getPassing() * DefensiveMidfielderWeights.PASSING,
            player.getAggression() * DefensiveMidfielderWeights.AGGRESSION,
            player.getBravery() * DefensiveMidfielderWeights.BRAVERY,
            player.getWorkRate() * DefensiveMidfielderWeights.WORK_RATE,
            player.getJumpingReach() * DefensiveMidfielderWeights.JUMPING_REACH,
            player.getStamina() * DefensiveMidfielderWeights.STAMINA,
            player.getStrength() * DefensiveMidfielderWeights.STRENGTH),
        List.of(
            player.getMarking() * DefensiveMidfielderWeights.MARKING * 2,
            player.getTackling() * DefensiveMidfielderWeights.TACKLING * 2,
            player.getAnticipation() * DefensiveMidfielderWeights.ANTICIPATION * 2,
            player.getComposure() * DefensiveMidfielderWeights.COMPOSURE * 2,
            player.getConcentration() * DefensiveMidfielderWeights.CONCENTRATION * 2,
            player.getDecisions() * DefensiveMidfielderWeights.DECISIONS * 2,
            player.getPositioning() * DefensiveMidfielderWeights.POSITIONING * 2,
            player.getTeamwork() * DefensiveMidfielderWeights.TEAMWORK * 2),
        List.of(
                DefensiveMidfielderWeights.FIRST_TOUCH,
                DefensiveMidfielderWeights.PASSING,
                DefensiveMidfielderWeights.AGGRESSION,
                DefensiveMidfielderWeights.BRAVERY,
                DefensiveMidfielderWeights.WORK_RATE,
                DefensiveMidfielderWeights.JUMPING_REACH,
                DefensiveMidfielderWeights.STAMINA,
                DefensiveMidfielderWeights.STRENGTH,
                DefensiveMidfielderWeights.MARKING * 2,
                DefensiveMidfielderWeights.TACKLING * 2,
                DefensiveMidfielderWeights.ANTICIPATION * 2,
                DefensiveMidfielderWeights.COMPOSURE * 2,
                DefensiveMidfielderWeights.CONCENTRATION * 2,
                DefensiveMidfielderWeights.DECISIONS * 2,
                DefensiveMidfielderWeights.POSITIONING * 2,
                DefensiveMidfielderWeights.TEAMWORK * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
