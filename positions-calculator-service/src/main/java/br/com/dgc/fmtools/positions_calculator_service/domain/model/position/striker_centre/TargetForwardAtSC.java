package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class TargetForwardAtSC extends Position implements StrikerCentrePositions {

  public TargetForwardAtSC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFreeKickTaking(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPassing(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getTechnique(),
            player.getConcentration(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getPositioning(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getAgility(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStamina());

    List<Integer> preferableAttributes =
        List.of(
            player.getFirstTouch(),
            player.getAggression(),
            player.getAnticipation(),
            player.getDecisions(),
            player.getTeamwork());

    List<Integer> keyAttributes =
        List.of(
            player.getFinishing(),
            player.getHeading(),
            player.getBravery(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getStrength());

    String name = "Target Forward (At) (SC)";

    int weight = 116;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
