package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class RoamingPlaymakerSu extends Position {

  public RoamingPlaymakerSu(LinePlayer player) {
    super(
        "Roaming Playmaker (Su)",
        List.of(
            player.getDribbling(),
            player.getLongShots(),
            player.getConcentration(),
            player.getPositioning(),
            player.getAgility(),
            player.getBalance(),
            player.getPace()),
        List.of(
            player.getFirstTouch(),
            player.getPassing(),
            player.getTechnique(),
            player.getAnticipation(),
            player.getComposure(),
            player.getDecisions(),
            player.getOffTheBall(),
            player.getTeamwork(),
            player.getVision(),
            player.getWorkRate(),
            player.getAcceleration(),
            player.getStamina()));
  }
}
