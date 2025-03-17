package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class LiberoSuDC extends Position implements DefenderCentrePositions {

  public LiberoSuDC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getAggression(),
            player.getDetermination(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getDribbling(),
            player.getHeading(),
            player.getTechnique(),
            player.getBravery(),
            player.getFlair(),
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
            player.getPositioning(),
            player.getTeamwork(),
            player.getVision(),
            player.getPace());

    String name = "Libero (Su) (DC)";

    int weight = 103;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
