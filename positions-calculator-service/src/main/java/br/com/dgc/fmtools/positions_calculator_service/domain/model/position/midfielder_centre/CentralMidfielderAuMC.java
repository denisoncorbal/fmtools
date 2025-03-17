package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class CentralMidfielderAuMC extends Position implements MidfielderCentrePositions {

  public CentralMidfielderAuMC(LinePlayer initPlayer) {
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
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getPositioning(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getOffTheBall(),
            player.getVision(),
            player.getWorkRate(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getTeamwork());

    String name = "Central Midfielder (Au) (MC)";

    int weight = 99;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
