package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InvertedWingBackDe extends Position {

  public InvertedWingBackDe(LinePlayer player) {
    super(
        "Inverted Wing-Back (De)",
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getConcentration(),
            player.getOffTheBall(),
            player.getAcceleration(),
            player.getAgility(),
            player.getStamina()),
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getAnticipation(),
            player.getDecisions(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate()));
  }
}
