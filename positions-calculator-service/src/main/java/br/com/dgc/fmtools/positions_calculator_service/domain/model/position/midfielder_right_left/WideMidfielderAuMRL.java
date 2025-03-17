package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class WideMidfielderAuMRL extends Position implements MidfielderRightLeftPositions {

  public WideMidfielderAuMRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getCrossing(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getVision());

    List<Integer> keyAttributes =
        List.of(
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina());

    String name = "Wide Midfielder (Au) (MRL)";

    int weight = 88;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
