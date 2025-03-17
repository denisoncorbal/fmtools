package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class InsideForwardSuAMRL extends Position implements AttackingMidfielderRightLeftPositions {

  public InsideForwardSuAMRL(LinePlayer initPlayer) {
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
            player.getWorkRate(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getStamina(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getFinishing(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getFlair(),
            player.getVision(),
            player.getPace());

    List<Integer> keyAttributes =
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance());

    String name = "Inside Forward (Su) (AMRL)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
