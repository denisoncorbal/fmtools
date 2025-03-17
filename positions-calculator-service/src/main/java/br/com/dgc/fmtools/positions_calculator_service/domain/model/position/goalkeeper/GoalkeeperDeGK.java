package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class GoalkeeperDeGK extends Position implements GoalkeeperPositions {
  public GoalkeeperDeGK(GoalkeeperPlayer initPlayer) {
    super();
    GoalkeeperPlayer player = this.applyAttributeWeight(initPlayer);

    List<Integer> normalAttributes =
        List.of(
            player.getEccentricity(),
            player.getPassing(),
            player.getRushingOut(),
            player.getAggression(),
            player.getBravery(),
            player.getComposure(),
            player.getDetermination(),
            player.getFlair(),
            player.getLeadership(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getAggression(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getBalance(),
            player.getJumpingReach(),
            player.getNaturalFitness(),
            player.getBalance(),
            player.getStamina(),
            player.getStrength(),
            player.getFreeKickTaking(),
            player.getPenaltyTaking(),
            player.getTechnique(),
            player.getFirstTouch(),
            player.getPace());

    List<Integer> preferableAttributes =
        List.of(
            player.getOneOnOnes(),
            player.getThrowing(),
            player.getAnticipation(),
            player.getDecisions());

    List<Integer> keyAttributes =
        List.of(
            player.getAerialReach(),
            player.getCommandOfArea(),
            player.getCommunication(),
            player.getHandling(),
            player.getKicking(),
            player.getReflexes(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAgility());

    String name = "Goalkeeper (De) (GK)";

    int weight = 113;

    this.normalAttributes = normalAttributes;
    this.preferableAttributes = preferableAttributes;
    this.keyAttributes = keyAttributes;
    this.name = name;
    this.weight = weight;
  }
}
