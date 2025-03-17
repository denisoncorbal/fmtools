package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.attacking_midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class WingerAtAMRL extends Position implements AttackingMidfielderRightLeftPositions {

  public WingerAtAMRL(LinePlayer initPlayer) {
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
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getDetermination(),
            player.getLeadership(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getStamina(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getAnticipation(),
            player.getFlair(),
            player.getAgility());

    List<Integer> keyAttributes =
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getPace());

    String name = "Winger (At) (AMRL)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
