package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class MezzalaAtMC extends Position implements MidfielderCentrePositions {

  public MezzalaAtMC(LinePlayer initPlayer) {
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
            player.getDetermination(),
            player.getLeadership(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getAgility(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getFinishing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getFlair(),
            player.getBalance(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getDribbling(),
            player.getPassing(),
            player.getTechnique(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration());

    String name = "Mezzala (At) (MC)";

    int weight = 99;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
