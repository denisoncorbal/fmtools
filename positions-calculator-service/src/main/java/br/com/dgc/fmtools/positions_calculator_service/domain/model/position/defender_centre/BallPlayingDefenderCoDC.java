package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class BallPlayingDefenderCoDC extends Position implements DefenderCentrePositions {

  public BallPlayingDefenderCoDC(LinePlayer initPlayer) {
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
            player.getAggression(),
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
            player.getStamina());

    List<Integer> preferableAttributes =
        List.of(
            player.getFirstTouch(),
            player.getHeading(),
            player.getTechnique(),
            player.getBravery(),
            player.getVision(),
            player.getJumpingReach(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getPace());

    String name = "Ball Playing Defender (Co) (DC)";

    int weight = 103;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
