package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class FullBackDeDRL extends Position implements DefenderRightLeftPositions {

  public FullBackDeDRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getAgility(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getCrossing(),
            player.getPassing(),
            player.getComposure(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getPace(),
            player.getStamina());

    List<Integer> keyAttributes =
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning());

    String name = "Full-Back (De) (DRL)";

    int weight = 87;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
