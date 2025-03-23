package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class SweeperKeeperDeGK extends Position {

  public SweeperKeeperDeGK(GoalkeeperPlayer player) {
    super(
        PositionNames.SWEEPER_KEEPER_DE_GK_NAME,
        List.of(
            player.getAerialReach() * GoalkeeperWeights.AERIAL_REACH,
            player.getCommunication() * GoalkeeperWeights.COMMUNICATION,
            player.getFirstTouch() * GoalkeeperWeights.FIRST_TOUCH,
            player.getHandling() * GoalkeeperWeights.HANDLING,
            player.getPassing() * GoalkeeperWeights.PASSING,
            player.getRushingOut() * GoalkeeperWeights.RUSHING_OUT,
            player.getThrowing() * GoalkeeperWeights.THROWING,
            player.getComposure() * GoalkeeperWeights.COMPOSURE,
            player.getDecisions() * GoalkeeperWeights.DECISIONS,
            player.getVision() * GoalkeeperWeights.VISION,
            player.getAcceleration() * GoalkeeperWeights.ACCELERATION),
        List.of(
            player.getCommandOfArea() * GoalkeeperWeights.COMMAND_OF_AREA * 2,
            player.getKicking() * GoalkeeperWeights.KICKING * 2,
            player.getOneOnOnes() * GoalkeeperWeights.ONE_ON_ONES * 2,
            player.getReflexes() * GoalkeeperWeights.REFLEXES * 2,
            player.getAnticipation() * GoalkeeperWeights.ANTICIPATION * 2,
            player.getConcentration() * GoalkeeperWeights.CONCENTRATION * 2,
            player.getPositioning() * GoalkeeperWeights.POSITIONING * 2,
            player.getAgility() * GoalkeeperWeights.AGILITY * 2),
        List.of(
                GoalkeeperWeights.AERIAL_REACH,
                GoalkeeperWeights.COMMUNICATION,
                GoalkeeperWeights.FIRST_TOUCH,
                GoalkeeperWeights.HANDLING,
                GoalkeeperWeights.PASSING,
                GoalkeeperWeights.RUSHING_OUT,
                GoalkeeperWeights.THROWING,
                GoalkeeperWeights.COMPOSURE,
                GoalkeeperWeights.DECISIONS,
                GoalkeeperWeights.VISION,
                GoalkeeperWeights.ACCELERATION,
                GoalkeeperWeights.COMMAND_OF_AREA * 2,
                GoalkeeperWeights.KICKING * 2,
                GoalkeeperWeights.ONE_ON_ONES * 2,
                GoalkeeperWeights.REFLEXES * 2,
                GoalkeeperWeights.ANTICIPATION * 2,
                GoalkeeperWeights.CONCENTRATION * 2,
                GoalkeeperWeights.POSITIONING * 2,
                GoalkeeperWeights.AGILITY * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
