package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import java.util.List;

public class GoalkeeperDe extends Position {
  public GoalkeeperDe(GoalkeeperPlayer player) {
    super(
        "Goalkeeper (De)",
        List.of(
            player.getOneOnOnes(),
            player.getThrowing(),
            player.getAnticipation(),
            player.getDecisions()),
        List.of(
            player.getAerialReach(),
            player.getCommandOfArea(),
            player.getCommunication(),
            player.getHandling(),
            player.getKicking(),
            player.getReflexes(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAgility()));
  }
}
