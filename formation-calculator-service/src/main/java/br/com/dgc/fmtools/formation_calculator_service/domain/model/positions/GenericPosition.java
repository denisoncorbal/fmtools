package br.com.dgc.fmtools.formation_calculator_service.domain.model.positions;

import java.util.UUID;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;

public class GenericPosition extends Position {

  public GenericPosition(String name, UUID playerId, String playerName, Double percentage) {
    super(name, playerId, playerName, percentage);
  }
}
