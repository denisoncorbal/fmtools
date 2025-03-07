package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InvertedWingBackAt extends Position {

  public InvertedWingBackAt(LinePlayer player) {
    super(
        "Inverted Wing-Back (At)",
        List.of(
            player.getFirstTouch(),
            player.getLongShots(),
            player.getAnticipation(),
            player.getComposure(),
            player.getConcentration(),
            player.getFlair(),
            player.getPositioning(),
            player.getAgility(),
            player.getPace()),
        List.of(
            player.getDribbling(),
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getTechnique(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina()));
  }
}
