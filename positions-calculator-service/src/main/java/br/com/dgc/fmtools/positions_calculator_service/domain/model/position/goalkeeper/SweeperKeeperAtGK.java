package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class SweeperKeeperAtGK extends Position implements GoalkeeperPositions {
  public SweeperKeeperAtGK(GoalkeeperPlayer initPlayer) {
    super();
    GoalkeeperPlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getAggression(),
            player.getBravery(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getPace(),
            player.getStamina(),
            player.getStrength(),
            player.getFreeKickTaking(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getPunching());

    List<Integer> preferableAttributes =
        List.of(
            player.getAerialReach(),
            player.getCommunication(),
            player.getFirstTouch(),
            player.getHandling(),
            player.getPassing(),
            player.getRushingOut(),
            player.getThrowing(),
            player.getComposure(),
            player.getDecisions(),
            player.getVision(),
            player.getAcceleration(),
            player.getEccentricity());

    List<Integer> keyAttributes =
        List.of(
            player.getCommandOfArea(),
            player.getKicking(),
            player.getOneOnOnes(),
            player.getReflexes(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAgility());

    String name = "Sweeper Keeper (At) (GK)";

    int weight = 113;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
