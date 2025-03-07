package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WingBackSu extends Position {

  public WingBackSu(LinePlayer player) {
    super(
        "Wing-Back (Su)",
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning(),
            player.getAgility(),
            player.getPace()),
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getMarking(),
            player.getTackling(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina()));
  }
}
