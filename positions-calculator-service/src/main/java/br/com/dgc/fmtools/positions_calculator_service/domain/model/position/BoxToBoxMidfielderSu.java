package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class BoxToBoxMidfielderSu extends Position {

  public BoxToBoxMidfielderSu(LinePlayer player) {
    super(
        "Box to Box Midfielder (Su)",
        List.of(
            player.getDribbling(),
            player.getFinishing(),
            player.getFirstTouch(),
            player.getLongShots(),
            player.getTechnique(),
            player.getAggression(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getPositioning(),
            player.getAcceleration(),
            player.getBalance(),
            player.getPace(),
            player.getStrength()),
        List.of(
            player.getPassing(),
            player.getTackling(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getWorkRate(),
            player.getStamina()));
  }
}
