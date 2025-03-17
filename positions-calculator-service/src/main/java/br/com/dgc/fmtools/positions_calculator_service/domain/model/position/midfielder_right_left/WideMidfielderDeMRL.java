package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class WideMidfielderDeMRL extends Position implements MidfielderRightLeftPositions {

  public WideMidfielderDeMRL(LinePlayer initPlayer) {
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
            player.getPenaltyTaking(),
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getVision(),
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
            player.getMarking(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getPassing(),
            player.getTackling(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate());

    String name = "Wide Midfielder (De) (MRL)";

    int weight = 88;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
