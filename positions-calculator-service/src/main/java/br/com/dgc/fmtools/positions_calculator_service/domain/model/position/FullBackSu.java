package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class FullBackSu extends Position {

  public FullBackSu(LinePlayer player) {
    super(
        "Full-Back (Su)",
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
