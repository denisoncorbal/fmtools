package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class AdvancedForwardAtSC extends Position implements StrikerCentrePositions {

  public AdvancedForwardAtSC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getConcentration(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getVision(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getPassing(),
            player.getAnticipation(),
            player.getDecisions(),
            player.getWorkRate(),
            player.getAgility(),
            player.getBalance(),
            player.getPace(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getAcceleration());

    String name = "Advanced Forward (At) (SC)";

    int weight = 116;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
