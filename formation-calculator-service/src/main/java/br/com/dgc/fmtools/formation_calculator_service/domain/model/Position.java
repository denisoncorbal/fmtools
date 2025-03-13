package br.com.dgc.fmtools.formation_calculator_service.domain.model;

import java.util.UUID;

public abstract class Position {
  String name;
  UUID playerId;
  String playerName;
  int percentage;

  public Position(String name) {
    this.name = name;
  }

  public Position(String name, UUID playerId, String playerName, int percentage) {
    this.name = name;
    this.playerId = playerId;
    this.playerName = playerName;
    this.percentage = percentage;
  }

  public String getName() {
    return name;
  }

  public UUID getPlayerId() {
    return playerId;
  }

  public String getPlayerName() {
    return playerName;
  }

  public int getPercentage() {
    return percentage;
  }
}
