package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class FullBackAu extends Position {

  public FullBackAu(LinePlayer player) {
    super(
        "Full-Back (Au)",
        List.of(
            player.getCrossing(),
            player.getDribbling(),
            player.getPassing(),
            player.getTechnique(),
            player.getComposure(),
            player.getDecisions(),
            player.getPace(),
            player.getStamina()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning(),
            player.getTeamwork(),
            player.getWorkRate()));
  }
}
