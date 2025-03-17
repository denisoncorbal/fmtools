package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class InsideForwardAtAMRL extends Position implements AttackingMidfielderRightLeftPositions {

  public InsideForwardAtAMRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getConcentration(),
            player.getDecisions(),
            player.getDetermination(),
            player.getLeadership(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getStamina(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getLongShots(),
            player.getPassing(),
            player.getAnticipation(),
            player.getComposure(),
            player.getFlair(),
            player.getPace());

    List<Integer> keyAttributes =
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance());

    String name = "Inside Forward (At) (AMRL)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
