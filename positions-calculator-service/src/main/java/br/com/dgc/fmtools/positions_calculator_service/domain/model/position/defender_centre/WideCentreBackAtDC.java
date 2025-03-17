package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class WideCentreBackAtDC extends Position implements DefenderCentrePositions {

  public WideCentreBackAtDC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getFreeKickTaking(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPassing(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getTeamwork(),
            player.getVision(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getWorkRate());

    List<Integer> keyAttributes =
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getHeading(),
            player.getMarking(),
            player.getTackling(),
            player.getOffTheBall(),
            player.getJumpingReach(),
            player.getPace(),
            player.getStamina(),
            player.getStrength());

    String name = "Wide Centre-Back (At) (DC)";

    int weight = 103;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
