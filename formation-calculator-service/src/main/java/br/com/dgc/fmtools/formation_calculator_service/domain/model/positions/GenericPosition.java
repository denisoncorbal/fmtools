package br.com.dgc.fmtools.formation_calculator_service.domain.model.positions;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.UUID;

public class GenericPosition extends Position {

  public GenericPosition(String name, UUID playerId, String playerName, int percentage) {
    super(name, playerId, playerName, percentage);
  }
}
