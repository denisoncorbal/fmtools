package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class WidePlaymakerSuMRL extends Position implements MidfielderRightLeftPositions {

  public WidePlaymakerSuMRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getCrossing(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getMarking(),
            player.getPenaltyTaking(),
            player.getTackling(),
            player.getAggression(),
            player.getAnticipation(),
            player.getBravery(),
            player.getConcentration(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getPositioning(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStamina(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(player.getDribbling(), player.getOffTheBall(), player.getAgility());

    List<Integer> keyAttributes =
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getVision());

    String name = "Wide Playmaker (Su) (MRL)";

    int weight = 88;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
