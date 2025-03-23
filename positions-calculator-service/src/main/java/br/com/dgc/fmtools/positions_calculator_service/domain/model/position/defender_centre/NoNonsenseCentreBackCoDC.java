package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class NoNonsenseCentreBackCoDC extends Position {

  public NoNonsenseCentreBackCoDC(LinePlayer player) {
    super(
        PositionNames.NO_NONSENSE_CENTRE_BACK_CO_DC_NAME,
        List.of(
            player.getHeading() * DefenderCentreWeights.HEADING,
            player.getBravery() * DefenderCentreWeights.BRAVERY,
            player.getJumpingReach() * DefenderCentreWeights.JUMPING_REACH,
            player.getStrength() * DefenderCentreWeights.STRENGTH),
        List.of(
            player.getMarking() * DefenderCentreWeights.MARKING * 2,
            player.getTackling() * DefenderCentreWeights.TACKLING * 2,
            player.getAnticipation() * DefenderCentreWeights.ANTICIPATION * 2,
            player.getConcentration() * DefenderCentreWeights.CONCENTRATION * 2,
            player.getPositioning() * DefenderCentreWeights.POSITIONING * 2,
            player.getPace() * DefenderCentreWeights.PACE * 2),
        List.of(
                DefenderCentreWeights.HEADING,
                DefenderCentreWeights.BRAVERY,
                DefenderCentreWeights.JUMPING_REACH,
                DefenderCentreWeights.STRENGTH,
                DefenderCentreWeights.MARKING * 2,
                DefenderCentreWeights.TACKLING * 2,
                DefenderCentreWeights.ANTICIPATION * 2,
                DefenderCentreWeights.CONCENTRATION * 2,
                DefenderCentreWeights.POSITIONING * 2,
                DefenderCentreWeights.PACE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
