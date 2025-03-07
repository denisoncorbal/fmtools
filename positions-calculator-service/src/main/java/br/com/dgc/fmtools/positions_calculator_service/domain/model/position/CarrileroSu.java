package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CarrileroSu extends Position {

  public CarrileroSu(LinePlayer player) {
    super(
        "Carrilero (Su)",
        List.of(
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getOffTheBall(),
            player.getVision(),
            player.getWorkRate()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getStamina()));
  }
}
