package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import java.util.List;

public class SweeperKeeperSu extends Position {

  public SweeperKeeperSu(GoalkeeperPlayer player) {
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
