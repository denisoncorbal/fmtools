package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class CentralMidfielderDeMC extends Position implements MidfielderCentrePositions {

  public CentralMidfielderDeMC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
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
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTechnique(),
            player.getAggression(),
            player.getAnticipation(),
            player.getComposure(),
            player.getWorkRate(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getTackling(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getTeamwork());

    String name = "Central Midfielder (De) (MC)";

    int weight = 99;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
