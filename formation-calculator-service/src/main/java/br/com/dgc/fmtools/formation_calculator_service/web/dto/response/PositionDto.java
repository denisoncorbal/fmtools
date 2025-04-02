package br.com.dgc.fmtools.formation_calculator_service.web.dto.response;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.UUID;

public record PositionDto(String name, UUID playerId, String playerName, Double percentage) {
  public PositionDto(Position position) {
    this(
        position.getName(),
        position.getPlayerId(),
        position.getPlayerName(),
        position.getPercentage());
  }
}
