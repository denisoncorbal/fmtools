package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class DefensiveWingerSuMRL extends Position implements MidfielderRightLeftPositions {

  public DefensiveWingerSuMRL(LinePlayer initPlayer) {
    super();
    LinePlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getCorners(),
            player.getFinishing(),
            player.getFreeKickTaking(),
            player.getHeading(),
            player.getLongShots(),
            player.getLongThrows(),
            player.getPenaltyTaking(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getVision(),
            player.getAgility(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStrength());

    List<Integer> preferableAttributes =
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getAggression(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getAcceleration());

    List<Integer> keyAttributes =
        List.of(
            player.getCrossing(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina());

    String name = "Defensive Winger (Su) (MRL)";

    int weight = 88;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
