package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.PositionNames;
import java.util.List;

public class GoalkeeperDeGK extends Position {
  public GoalkeeperDeGK(GoalkeeperPlayer player) {
    super(
        PositionNames.GOALKEEPER_DE_GK_NAME,
        List.of(
            player.getOneOnOnes() * GoalkeeperWeights.ONE_ON_ONES,
            player.getThrowing() * GoalkeeperWeights.THROWING,
            player.getAnticipation() * GoalkeeperWeights.ANTICIPATION,
            player.getDecisions() * GoalkeeperWeights.DECISIONS),
        List.of(
            player.getAerialReach() * GoalkeeperWeights.AERIAL_REACH * 2,
            player.getCommandOfArea() * GoalkeeperWeights.COMMAND_OF_AREA * 2,
            player.getCommunication() * GoalkeeperWeights.COMMUNICATION * 2,
            player.getHandling() * GoalkeeperWeights.HANDLING * 2,
            player.getKicking() * GoalkeeperWeights.KICKING * 2,
            player.getReflexes() * GoalkeeperWeights.REFLEXES * 2,
            player.getConcentration() * GoalkeeperWeights.CONCENTRATION * 2,
            player.getPositioning() * GoalkeeperWeights.POSITIONING * 2,
            player.getAgility() * GoalkeeperWeights.AGILITY * 2),
        List.of(
                GoalkeeperWeights.ONE_ON_ONES,
                GoalkeeperWeights.THROWING,
                GoalkeeperWeights.ANTICIPATION,
                GoalkeeperWeights.DECISIONS,
                GoalkeeperWeights.AERIAL_REACH * 2,
                GoalkeeperWeights.COMMAND_OF_AREA * 2,
                GoalkeeperWeights.COMMUNICATION * 2,
                GoalkeeperWeights.HANDLING * 2,
                GoalkeeperWeights.KICKING * 2,
                GoalkeeperWeights.REFLEXES * 2,
                GoalkeeperWeights.CONCENTRATION * 2,
                GoalkeeperWeights.POSITIONING * 2,
                GoalkeeperWeights.AGILITY * 2)
            .stream()
            .reduce(0, Integer::sum));
  }
}
