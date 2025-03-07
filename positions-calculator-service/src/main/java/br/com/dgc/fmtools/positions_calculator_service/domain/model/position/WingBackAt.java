package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WingBackAt extends Position {

  public WingBackAt(LinePlayer player) {
    super(
        "Wing-Back (At)",
        List.of(
            player.getFirstTouch(),
            player.getMarking(),
            player.getPassing(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getDecisions(),
            player.getFlair(),
            player.getPositioning(),
            player.getAgility()),
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getTackling(),
            player.getTechnique(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getPace(),
            player.getStamina()));
  }
}
