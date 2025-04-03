package br.com.dgc.fmtools.formation_calculator_service.domain.model;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.formations.BruteForceBetterFormationCalculation;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Formation {
  String name;
  List<Position> linePositions = new ArrayList<Position>(10);
  Position goalkeeperPosition;
  Double averagePercentage;

  public Formation(String name, List<Position> linePositions, Position goalkeeperPosition) {
    this.name = name;
    this.linePositions = linePositions;
    this.goalkeeperPosition = goalkeeperPosition;
  }

  void calculateBetterFormation(
      List<Position> allLinePlayersPositions, List<Position> allGoalkeeperPlayersPositions) {
    new BruteForceBetterFormationCalculation()
        .calculateBetterFormation(this, allLinePlayersPositions, allGoalkeeperPlayersPositions);
  }

  void calculatePercentage() {
    this.averagePercentage =
        (this.linePositions.stream()
                    .collect(Collectors.summarizingDouble((position) -> position.percentage))
                    .getSum()
                + this.goalkeeperPosition.percentage)
            / (this.linePositions.size() + 1);
  }

  public String getName() {
    return name;
  }

  public List<Position> getLinePositions() {
    return linePositions;
  }

  public Position getGoalkeeperPosition() {
    return goalkeeperPosition;
  }

  public Double getAveragePercentage() {
    return averagePercentage;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLinePositions(List<Position> linePositions) {
    this.linePositions = linePositions;
  }

  public void setGoalkeeperPosition(Position goalkeeperPosition) {
    this.goalkeeperPosition = goalkeeperPosition;
  }

  public void setAveragePercentage(Double averagePercentage) {
    this.averagePercentage = averagePercentage;
  }
}
