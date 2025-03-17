package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class AdvancedPlaymakerAtMC extends Position implements MidfielderCentrePositions {

  public AdvancedPlaymakerAtMC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
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
            player.getConcentration(),
            player.getDetermination(),
            player.getLeadership(),
            player.getPositioning(),
            player.getWorkRate(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStamina(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getAnticipation(),
            player.getFlair(),
            player.getAcceleration(),
            player.getAgility());

    List<Integer> keyAttributes =
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getVision());

    String name = "Advanced Playmaker (At) (MC)";

    int weight = 99;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
