package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class CompleteForwardAtSC extends Position implements StrikerCentrePositions {

  public CompleteForwardAtSC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFreeKickTaking(),
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
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getLongShots(),
            player.getPassing(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getPace(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getHeading(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility(),
            player.getStrength());

    String name = "Complete Forward (At) (SC)";

    int weight = 116;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
