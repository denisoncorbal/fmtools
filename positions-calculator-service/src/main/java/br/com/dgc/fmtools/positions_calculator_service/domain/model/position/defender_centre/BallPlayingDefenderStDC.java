package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class BallPlayingDefenderStDC extends Position implements DefenderCentrePositions {

  public BallPlayingDefenderStDC(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStamina());

    List<Integer> preferableAttributes =
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getVision());

    List<Integer> keyAttributes =
        List.of(
            player.getHeading(),
            player.getPassing(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getComposure(),
            player.getDecisions(),
            player.getPositioning(),
            player.getJumpingReach(),
            player.getStrength());

    String name = "Ball Playing Defender (St) (DC)";

    int weight = 103;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
