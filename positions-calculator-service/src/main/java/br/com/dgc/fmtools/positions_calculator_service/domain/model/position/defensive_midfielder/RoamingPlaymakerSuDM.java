package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class RoamingPlaymakerSuDM extends Position implements DefensiveMidfielderPositions {

  public RoamingPlaymakerSuDM(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getDribbling(),
            player.getLongShots(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAgility(),
            player.getBalance(),
            player.getPace());

    List<Integer> keyAttributes =
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina());

    String name = "Roaming Playmaker (Su) (DM)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
