package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class WideTargetForwardAtAMRL extends Position
    implements AttackingMidfielderRightLeftPositions {

  public WideTargetForwardAtAMRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getDribbling(),
            player.getFreeKickTaking(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPassing(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getTechnique(),
            player.getAggression(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getPositioning(),
            player.getVision(),
            player.getAcceleration(),
            player.getAgility(),
            player.getNaturalFitness(),
            player.getPace());

    List<Integer> preferableAttributes =
        List.of(
            player.getCrossing(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getAnticipation(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getBalance(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getHeading(),
            player.getBravery(),
            player.getOffTheBall(),
            player.getJumpingReach(),
            player.getStrength());

    String name = "Wide Target Forward (At) (AMRL)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
