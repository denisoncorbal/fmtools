package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.Position;
import java.util.List;

public class SweeperKeeperSuGK extends Position implements GoalkeeperPositions {

  public SweeperKeeperSuGK(GoalkeeperPlayer player) {
    super(
        "Sweeper Keeper (Su)",
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
            player.getAcceleration()),
        List.of(
            player.getCommandOfArea(),
            player.getKicking(),
            player.getOneOnOnes(),
            player.getReflexes(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAgility()));
  }
}
