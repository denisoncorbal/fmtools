package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class WingBackDe extends Position {

  public WingBackDe(LinePlayer player) {
    super(
        "Wing-Back (De)",
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getConcentration(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getAgility(),
            player.getPace()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina()));
  }
}
