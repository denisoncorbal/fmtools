package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class SegundoVolanteAtDM extends Position implements DefensiveMidfielderPositions {

  public SegundoVolanteAtDM(LinePlayer initPlayer) {
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
            player.getFirstTouch(),
            player.getMarking(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getAcceleration(),
            player.getBalance(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getFinishing(),
            player.getLongShots(),
            player.getPassing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getWorkRate(),
            player.getPace(),
            player.getStamina());

    String name = "Segundo Voltante (At) (DM)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
