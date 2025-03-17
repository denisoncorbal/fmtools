package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class AttackingMidfielderSuAMC extends Position
    implements AttackingMidfielderCentrePositions {

  public AttackingMidfielderSuAMC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getConcentration(),
            player.getDetermination(),
            player.getLeadership(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStamina(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getDribbling(), player.getComposure(), player.getVision(), player.getAgility());

    List<Integer> keyAttributes =
        List.of(
            player.getFirstTouch(),
            player.getLongShots(),
            player.getPassing(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getDecisions(),
            player.getFlair(),
            player.getOffTheBall());

    String name = "Attacking Midfielder (Su) (AMC)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
