package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class SegundoVolanteSuDM extends Position implements DefensiveMidfielderPositions {

  public SegundoVolanteSuDM(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getDribbling(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getTeamwork(),
            player.getVision(),
            player.getAgility(),
            player.getJumpingReach(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getFinishing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getAcceleration(),
            player.getBalance(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getWorkRate(),
            player.getPace(),
            player.getStamina());

    String name = "Segundo Volante (Su) (DM)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
