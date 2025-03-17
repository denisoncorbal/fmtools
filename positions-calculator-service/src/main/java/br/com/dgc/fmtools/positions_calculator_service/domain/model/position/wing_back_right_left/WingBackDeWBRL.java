package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.wing_back_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class WingBackDeWBRL extends Position implements WingBackRightLeftPositions {

  public WingBackDeWBRL(LinePlayer initPlayer) {
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
            player.getComposure(),
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
            player.getCrossing(),
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getConcentration(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getAgility(),
            player.getPace());

    List<Integer> keyAttributes =
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina());

    String name = "Wing-Back (De) (WBRL)";

    int weight = 85;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
