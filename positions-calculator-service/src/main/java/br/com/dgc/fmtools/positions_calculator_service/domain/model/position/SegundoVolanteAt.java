package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class SegundoVolanteAt extends Position {

  public SegundoVolanteAt(LinePlayer player) {
    super(
        "Segundo Voltante (At)",
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getAcceleration(),
            player.getBalance(),
            player.getStrength()),
        List.of(
            player.getFinishing(),
            player.getLongShots(),
            player.getPassing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getWorkRate(),
            player.getPace(),
            player.getStamina()));
  }
}
