package br.com.dgc.fmtools.positions_calculator_service.domain.model.position;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import java.util.List;

public class NoNonsenseFullBackDe extends Position {

  public NoNonsenseFullBackDe(LinePlayer player) {
    super(
        "No-Nonsense Full-Back (De)",
        List.of(
            player.getHeading(),
            player.getAggression(),
            player.getBravery(),
            player.getConcentration(),
            player.getTeamwork()),
        List.of(
            player.getMarking(),
            player.getTackling(),
            player.getAnticipation(),
            player.getPositioning(),
            player.getStrength()));
  }
}
