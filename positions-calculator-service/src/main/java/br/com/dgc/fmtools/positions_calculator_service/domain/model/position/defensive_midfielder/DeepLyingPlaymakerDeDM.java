package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class DeepLyingPlaymakerDeDM extends Position {

  public DeepLyingPlaymakerDeDM(LinePlayer player) {
    super(
        PositionNames.DEEP_LYING_PLAYMAKER_DE_DM_NAME,
        List.of(
            player.getTackling() * DefensiveMidfielderWeights.TACKLING,
            player.getAnticipation() * DefensiveMidfielderWeights.ANTICIPATION,
            player.getPositioning() * DefensiveMidfielderWeights.POSITIONING,
            player.getBalance() * DefensiveMidfielderWeights.BALANCE),
        List.of(
            player.getFirstTouch() * DefensiveMidfielderWeights.FIRST_TOUCH * 2,
            player.getPassing() * DefensiveMidfielderWeights.PASSING * 2,
            player.getTechnique() * DefensiveMidfielderWeights.TECHNIQUE * 2,
            player.getComposure() * DefensiveMidfielderWeights.COMPOSURE * 2,
            player.getDecisions() * DefensiveMidfielderWeights.DECISIONS * 2,
            player.getTeamwork() * DefensiveMidfielderWeights.TEAMWORK * 2,
            player.getVision() * DefensiveMidfielderWeights.VISION * 2),
        List.of(
                DefensiveMidfielderWeights.TACKLING,
                DefensiveMidfielderWeights.ANTICIPATION,
                DefensiveMidfielderWeights.POSITIONING,
                DefensiveMidfielderWeights.BALANCE,
                DefensiveMidfielderWeights.FIRST_TOUCH * 2,
                DefensiveMidfielderWeights.PASSING * 2,
                DefensiveMidfielderWeights.TECHNIQUE * 2,
                DefensiveMidfielderWeights.COMPOSURE * 2,
                DefensiveMidfielderWeights.DECISIONS * 2,
                DefensiveMidfielderWeights.TEAMWORK * 2,
                DefensiveMidfielderWeights.VISION * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
