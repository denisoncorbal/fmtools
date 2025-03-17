package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class LiberoAtDC extends Position implements DefenderCentrePositions {

  public LiberoAtDC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getAggression(),
            player.getDetermination(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getWorkRate(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getHeading(),
            player.getLongShots(),
            player.getTechnique(),
            player.getBravery(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getStamina(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getFlair(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getVision(),
            player.getPace());

    String name = "Libero (At) (DC)";

    int weight = 103;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
