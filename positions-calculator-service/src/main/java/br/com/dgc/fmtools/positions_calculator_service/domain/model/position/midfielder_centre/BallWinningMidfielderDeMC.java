package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class BallWinningMidfielderDeMC extends Position implements MidfielderCentrePositions {

  public BallWinningMidfielderDeMC(LinePlayer initPlayer) {
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
            player.getPassing(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getVision(),
            player.getAcceleration(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness());

    List<Integer> preferableAttributes =
        List.of(
            player.getMarking(),
            player.getBravery(),
            player.getConcentration(),
            player.getPositioning(),
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

    String name = "Ball Winning Midfielder (De) (MC)";

    int weight = 99;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
