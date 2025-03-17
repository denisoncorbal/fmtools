package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class NoNonsenseCentreBackDeDC extends Position implements DefenderCentrePositions {

  public NoNonsenseCentreBackDeDC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getFreeKickTaking(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPassing(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getNaturalFitness(),
            player.getStamina());

    List<Integer> preferableAttributes =
        List.of(
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getConcentration(),
            player.getPace());

    List<Integer> keyAttributes =
        List.of(
            player.getHeading(),
            player.getMarking(),
            player.getTackling(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStrength());

    String name = "No-Nonsense Centre-Back (De) (DC)";

    int weight = 103;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
