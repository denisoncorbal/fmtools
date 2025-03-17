package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class CompleteForwardSuSC extends Position implements StrikerCentrePositions {

  public CompleteForwardSuSC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFreeKickTaking(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getConcentration(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getPositioning(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getFinishing(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getPace(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getHeading(),
            player.getLongShots(),
            player.getPassing(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getVision(),
            player.getAcceleration(),
            player.getAgility(),
            player.getStrength());

    String name = "Complete Forward (Su) (SC)";

    int weight = 116;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
