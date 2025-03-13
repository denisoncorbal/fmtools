package br.com.dgc.fmtools.formation_calculator_service.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Formation {

  private final Logger log = LoggerFactory.getLogger(Formation.class);

  String name;
  List<Position> linePositions = new ArrayList<Position>(10);
  Position goalkeeperPosition;
  int averagePercentage;

  public Formation(String name, List<Position> linePositions, Position goalkeeperPosition) {
    this.name = name;
    this.linePositions = linePositions;
    this.goalkeeperPosition = goalkeeperPosition;
  }

  void calculateBetterFormation(
      List<Position> allLinePlayersPositions, List<Position> allGoalkeeperPlayersPositions) {
    log.info("Calculating formation for: {}", this.getName());
    log.info("Copying line and goalkeeper player list positions to mutate data");

    List<Position> copyAllLinePlayersPositions = new ArrayList<Position>(allLinePlayersPositions);
    List<Position> copyAllGoalkeeperPlayersPositions =
        new ArrayList<Position>(allGoalkeeperPlayersPositions);

    log.info("Beggin line positions associations");
    this.linePositions =
        this.linePositions.stream()
            .map(
                (linePosition) -> {
                  log.info("Looking for: {}", linePosition.name);

                  Position tempPosition =
                      copyAllLinePlayersPositions.stream()
                          .filter(
                              (position) ->
                                  position
                                      .name
                                      .toLowerCase()
                                      .equals(linePosition.name.toLowerCase()))
                          .sorted((a, b) -> b.percentage - a.percentage)
                          .findFirst()
                          .get();

                  copyAllLinePlayersPositions.removeAll(
                      copyAllLinePlayersPositions.stream()
                          .filter(
                              (position) ->
                                  position.getPlayerId().equals(tempPosition.getPlayerId()))
                          .toList());

                  return tempPosition;
                })
            .toList();

    this.goalkeeperPosition =
        copyAllGoalkeeperPlayersPositions.stream()
            .filter((position) -> position.name.equals(goalkeeperPosition.name))
            .sorted((a, b) -> b.percentage - a.percentage)
            .peek(System.out::println)
            .findFirst()
            .get();
  }

  void calculatePercentage() {
    this.averagePercentage =
        (int)
                (this.linePositions.stream()
                        .collect(Collectors.summarizingInt((position) -> position.percentage))
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

  public int getAveragePercentage() {
    return averagePercentage;
  }
}
