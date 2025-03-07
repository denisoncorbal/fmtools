package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class CompleteWingBackSu extends Position {

  public CompleteWingBackSu(LinePlayer player) {
    super(
        "Complete Wing-Back (Su)",
        List.of(
            player.getTackling(),
            player.getAnticipation(),
            player.getComposure(),
            player.getFlair(),
            player.getAgility(),
            player.getBalance()),
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getPace(),
            player.getStamina()));
  }
}
