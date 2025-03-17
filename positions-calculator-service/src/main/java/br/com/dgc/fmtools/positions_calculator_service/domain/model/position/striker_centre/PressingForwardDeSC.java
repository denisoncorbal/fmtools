package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class PressingForwardDeSC extends Position implements StrikerCentrePositions {

  public PressingForwardDeSC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPassing(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getTechnique(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getVision(),
            player.getJumpingReach(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getFirstTouch(),
            player.getComposure(),
            player.getConcentration(),
            player.getAgility(),
            player.getBalance(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getPace(),
            player.getStamina());

    String name = "Pressing Forward (De) (SC)";

    int weight = 116;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
