package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class FullBackAt extends Position {

  public FullBackAt(LinePlayer player) {
    super(
        "Full-Back (At)",
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getConcentration(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility()),
        List.of(
            player.getCrossing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getPace(),
            player.getStamina()));
  }
}
