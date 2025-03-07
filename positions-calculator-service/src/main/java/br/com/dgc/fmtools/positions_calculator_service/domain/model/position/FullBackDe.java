package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class FullBackDe extends Position {

  public FullBackDe(LinePlayer player) {
    super(
        "Full-Back (De)",
        List.of(
            player.getCrossing(),
            player.getPassing(),
            player.getComposure(),
            player.getDecisions(),
            player.getTeamwork(),
            player.getPace(),
            player.getStamina()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getPositioning()));
  }
}
