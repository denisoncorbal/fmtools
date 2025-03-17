package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class BoxToBoxMidfielderSuMC extends Position implements MidfielderCentrePositions {

  public BoxToBoxMidfielderSuMC(LinePlayer initPlayer) {
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
            player.getBravery(),
            player.getConcentration(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getVision(),
            player.getAgility(),
            player.getJumpingReach(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getTechnique(),
            player.getAggression(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getPositioning(),
            player.getAcceleration(),
            player.getBalance(),
            player.getPace(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getPassing(),
            player.getTackling(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina());

    String name = "Box to Box Midfielder (Su) (MC)";

    int weight = 99;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
