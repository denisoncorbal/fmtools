package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InvertedWingBackAu extends Position {

  public InvertedWingBackAu(LinePlayer player) {
    super(
        "Inverted Wing-Back (Au)",
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAcceleration(),
            player.getAgility()),
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina()));
  }
}
