package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class BallWinningMidfielderSuDM extends Position implements DefensiveMidfielderPositions {

  public BallWinningMidfielderSuDM(LinePlayer initPlayer) {
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
            player.getComposure(),
            player.getDecisions(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getVision(),
            player.getAcceleration(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getBravery(),
            player.getConcentration(),
            player.getAgility(),
            player.getPace(),
            player.getStrength());

    List<Integer> keyAttributes =
        List.of(
            player.getTackling(),
            player.getAggression(),
            player.getAnticipation(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina());

    String name = "Ball Winning Midfielder (Su) (DM)";

    int weight = 98;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
