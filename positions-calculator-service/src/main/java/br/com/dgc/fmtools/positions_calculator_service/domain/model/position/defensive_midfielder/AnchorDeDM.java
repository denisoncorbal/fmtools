package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class AnchorDeDM extends Position {

  public AnchorDeDM(LinePlayer player) {
    super(
        PositionNames.ANCHOR_DE_DM_NAME,
        List.of(
            player.getComposure() * DefensiveMidfielderWeights.COMPOSURE,
            player.getTeamwork() * DefensiveMidfielderWeights.TEAMWORK,
            player.getStrength() * DefensiveMidfielderWeights.STRENGTH),
        List.of(
            player.getMarking() * DefensiveMidfielderWeights.MARKING * 2,
            player.getTackling() * DefensiveMidfielderWeights.TACKLING * 2,
            player.getAnticipation() * DefensiveMidfielderWeights.ANTICIPATION * 2,
            player.getConcentration() * DefensiveMidfielderWeights.CONCENTRATION * 2,
            player.getDecisions() * DefensiveMidfielderWeights.DECISIONS * 2,
            player.getPositioning() * DefensiveMidfielderWeights.POSITIONING * 2),
        List.of(
                DefensiveMidfielderWeights.COMPOSURE,
                DefensiveMidfielderWeights.TEAMWORK,
                DefensiveMidfielderWeights.STRENGTH,
                DefensiveMidfielderWeights.MARKING * 2,
                DefensiveMidfielderWeights.TACKLING * 2,
                DefensiveMidfielderWeights.ANTICIPATION * 2,
                DefensiveMidfielderWeights.CONCENTRATION * 2,
                DefensiveMidfielderWeights.DECISIONS * 2,
                DefensiveMidfielderWeights.POSITIONING * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
