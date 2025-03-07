package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class TrequartistaAt extends Position {

  public TrequartistaAt(LinePlayer player) {
    super(
        "Trequartista (At)",
        List.of(
            player.getFinishing(),
            player.getAnticipation(),
            player.getAgility(),
            player.getBalance()),
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getFlair(),
            player.getOffTheBall(),
            player.getVision(),
            player.getAcceleration()));
  }
}
