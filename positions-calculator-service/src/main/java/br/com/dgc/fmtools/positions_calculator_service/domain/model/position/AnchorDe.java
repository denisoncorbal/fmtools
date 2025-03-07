package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class AnchorDe extends Position {

  public AnchorDe(LinePlayer player) {
    super(
        "Anchor (De)",
        List.of(player.getComposure(), player.getTeamwork(), player.getStrength()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getConcentration(),
            player.getDecisions(),
            player.getPositioning()));
  }
}
