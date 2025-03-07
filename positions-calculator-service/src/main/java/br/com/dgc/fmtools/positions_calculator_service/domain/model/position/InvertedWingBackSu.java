package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class InvertedWingBackSu extends Position {

  public InvertedWingBackSu(LinePlayer player) {
    super(
        "Inverted Wing-Back (Su)",
        List.of(
            player.getDribbling(),
            player.getFirstTouch(),
            player.getTechnique(),
            player.getConcentration(),
            player.getAcceleration(),
            player.getAgility(),
            player.getComposure(),
            player.getAnticipation(),
            player.getPositioning()),
        List.of(
            player.getMarking(),
            player.getPassing(),
            player.getTackling(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getOffTheBall(),
            player.getStamina()));
  }
}
