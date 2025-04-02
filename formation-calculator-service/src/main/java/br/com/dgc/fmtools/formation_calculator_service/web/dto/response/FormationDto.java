package br.com.dgc.fmtools.formation_calculator_service.web.dto.response;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import java.util.List;

public record FormationDto(
    String name,
    List<PositionDto> linePositions,
    PositionDto goalkeeperPosition,
    Double averagePercentage) {
  public FormationDto(Formation formation) {
    this(
        formation.getName(),
        formation.getLinePositions().stream().map(PositionDto::new).toList(),
        new PositionDto(formation.getGoalkeeperPosition()),
        formation.getAveragePercentage());
  }
}
