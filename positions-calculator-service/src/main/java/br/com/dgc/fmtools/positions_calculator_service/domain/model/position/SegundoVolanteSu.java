package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class SegundoVolanteSu extends Position {

  public SegundoVolanteSu(LinePlayer player) {
    super(
        "Segundo Volante (Su)",
        List.of(
            player.getFinishing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getAcceleration(),
            player.getBalance(),
            player.getStrength()),
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getOffTheBall(),
            player.getPositioning(),
            player.getWorkRate(),
            player.getPace(),
            player.getStamina()));
  }
}
