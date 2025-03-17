package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class FullBackAtDRL extends Position implements DefenderRightLeftPositions {

  public FullBackAtDRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getVision(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility());

    List<Integer> keyAttributes =
        List.of(
            player.getCrossing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getPace(),
            player.getStamina());

    String name = "Full-Back (At) (DRL)";

    int weight = 87;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
