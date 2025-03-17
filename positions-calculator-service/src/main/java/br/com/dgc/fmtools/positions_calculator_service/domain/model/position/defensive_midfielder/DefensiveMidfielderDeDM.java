package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class DefensiveMidfielderDeDM extends Position implements DefensiveMidfielderPositions {

  public DefensiveMidfielderDeDM(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getVision(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace());

    List<Integer> preferableAttributes =
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getAggression(),
            player.getComposure(),
            player.getDecisions(),
            player.getWorkRate(),
            player.getStamina(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning(),
            player.getTeamwork());

    String name = "Defensive Midfielder (De) (DM)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
