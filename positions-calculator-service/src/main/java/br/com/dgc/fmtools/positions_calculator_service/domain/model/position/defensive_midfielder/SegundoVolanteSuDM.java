package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class SegundoVolanteSuDM extends Position {

  public SegundoVolanteSuDM(LinePlayer player) {
    super(
        PositionNames.SEGUNDO_VOLANTE_SU_DM_NAME,
        List.of(
            player.getFinishing() * DefensiveMidfielderWeights.FINISHING,
            player.getFirstTouch() * DefensiveMidfielderWeights.FIRST_TOUCH,
            player.getLongShots() * DefensiveMidfielderWeights.LONG_SHOTS,
            player.getAnticipation() * DefensiveMidfielderWeights.ANTICIPATION,
            player.getComposure() * DefensiveMidfielderWeights.COMPOSURE,
            player.getConcentration() * DefensiveMidfielderWeights.CONCENTRATION,
            player.getDecisions() * DefensiveMidfielderWeights.DECISIONS,
            player.getAcceleration() * DefensiveMidfielderWeights.ACCELERATION,
            player.getBalance() * DefensiveMidfielderWeights.BALANCE,
            player.getStrength() * DefensiveMidfielderWeights.STRENGTH),
        List.of(
            player.getMarking() * DefensiveMidfielderWeights.MARKING * 2,
            player.getPassing() * DefensiveMidfielderWeights.PASSING * 2,
            player.getTackling() * DefensiveMidfielderWeights.TACKLING * 2,
            player.getOffTheBall() * DefensiveMidfielderWeights.OFF_THE_BALL * 2,
            player.getPositioning() * DefensiveMidfielderWeights.POSITIONING * 2,
            player.getWorkRate() * DefensiveMidfielderWeights.WORK_RATE * 2,
            player.getPace() * DefensiveMidfielderWeights.PACE * 2,
            player.getStamina() * DefensiveMidfielderWeights.STAMINA * 2),
        List.of(
                DefensiveMidfielderWeights.FINISHING,
                DefensiveMidfielderWeights.FIRST_TOUCH,
                DefensiveMidfielderWeights.LONG_SHOTS,
                DefensiveMidfielderWeights.ANTICIPATION,
                DefensiveMidfielderWeights.COMPOSURE,
                DefensiveMidfielderWeights.CONCENTRATION,
                DefensiveMidfielderWeights.DECISIONS,
                DefensiveMidfielderWeights.ACCELERATION,
                DefensiveMidfielderWeights.BALANCE,
                DefensiveMidfielderWeights.STRENGTH,
                DefensiveMidfielderWeights.MARKING * 2,
                DefensiveMidfielderWeights.PASSING * 2,
                DefensiveMidfielderWeights.TACKLING * 2,
                DefensiveMidfielderWeights.OFF_THE_BALL * 2,
                DefensiveMidfielderWeights.POSITIONING * 2,
                DefensiveMidfielderWeights.WORK_RATE * 2,
                DefensiveMidfielderWeights.PACE * 2,
                DefensiveMidfielderWeights.STAMINA * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
