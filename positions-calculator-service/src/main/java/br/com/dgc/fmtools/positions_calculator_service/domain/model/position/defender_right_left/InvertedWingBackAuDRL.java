package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class InvertedWingBackAuDRL extends Position implements DefenderRightLeftPositions {

  public InvertedWingBackAuDRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
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
            player.getPace(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAcceleration(),
            player.getAgility());

    List<Integer> keyAttributes =
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina());

    String name = "Inverted Wing-Back (Au) (DRL)";

    int weight = 87;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
