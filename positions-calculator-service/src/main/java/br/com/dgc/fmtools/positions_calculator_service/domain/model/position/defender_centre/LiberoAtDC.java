package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class LiberoAtDC extends Position {

  public LiberoAtDC(LinePlayer player) {
    super(
        PositionNames.LIBERO_AT_DC_NAME,
        List.of(
            player.getHeading() * DefenderCentreWeights.HEADING,
            player.getLongShots() * DefenderCentreWeights.LONG_SHOTS,
            player.getTechnique() * DefenderCentreWeights.TECHNIQUE,
            player.getBravery() * DefenderCentreWeights.BRAVERY,
            player.getAcceleration() * DefenderCentreWeights.ACCELERATION,
            player.getAgility() * DefenderCentreWeights.AGILITY,
            player.getBalance() * DefenderCentreWeights.BALANCE,
            player.getJumpingReach() * DefenderCentreWeights.JUMPING_REACH,
            player.getStamina() * DefenderCentreWeights.STAMINA,
            player.getStrength() * DefenderCentreWeights.STRENGTH),
        List.of(
            player.getFirstTouch() * DefenderCentreWeights.FIRST_TOUCH * 2,
            player.getMarking() * DefenderCentreWeights.MARKING * 2,
            player.getPassing() * DefenderCentreWeights.PASSING * 2,
            player.getTackling() * DefenderCentreWeights.TACKLING * 2,
            player.getAnticipation() * DefenderCentreWeights.ANTICIPATION * 2,
            player.getComposure() * DefenderCentreWeights.COMPOSURE * 2,
            player.getConcentration() * DefenderCentreWeights.CONCENTRATION * 2,
            player.getDecisions() * DefenderCentreWeights.DECISIONS * 2,
            player.getFlair() * DefenderCentreWeights.FLAIR * 2,
            player.getPositioning() * DefenderCentreWeights.POSITIONING * 2,
            player.getTeamwork() * DefenderCentreWeights.TEAMWORK * 2,
            player.getVision() * DefenderCentreWeights.VISION * 2,
            player.getPace() * DefenderCentreWeights.PACE * 2),
        List.of(
                DefenderCentreWeights.HEADING,
                DefenderCentreWeights.LONG_SHOTS,
                DefenderCentreWeights.TECHNIQUE,
                DefenderCentreWeights.BRAVERY,
                DefenderCentreWeights.ACCELERATION,
                DefenderCentreWeights.AGILITY,
                DefenderCentreWeights.BALANCE,
                DefenderCentreWeights.JUMPING_REACH,
                DefenderCentreWeights.STAMINA,
                DefenderCentreWeights.STRENGTH,
                DefenderCentreWeights.FIRST_TOUCH * 2,
                DefenderCentreWeights.MARKING * 2,
                DefenderCentreWeights.PASSING * 2,
                DefenderCentreWeights.TACKLING * 2,
                DefenderCentreWeights.ANTICIPATION * 2,
                DefenderCentreWeights.COMPOSURE * 2,
                DefenderCentreWeights.CONCENTRATION * 2,
                DefenderCentreWeights.DECISIONS * 2,
                DefenderCentreWeights.FLAIR * 2,
                DefenderCentreWeights.POSITIONING * 2,
                DefenderCentreWeights.TEAMWORK * 2,
                DefenderCentreWeights.VISION * 2,
                DefenderCentreWeights.PACE * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
