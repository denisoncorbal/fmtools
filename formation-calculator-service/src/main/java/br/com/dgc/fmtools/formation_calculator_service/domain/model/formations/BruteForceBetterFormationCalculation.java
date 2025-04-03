package br.com.dgc.fmtools.formation_calculator_service.domain.model.formations;

import br.com.dgc.fmtools.formation_calculator_service.domain.model.Formation;
import br.com.dgc.fmtools.formation_calculator_service.domain.model.Position;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BruteForceBetterFormationCalculation {

  private int iterator = 0;

  public void calculateBetterFormation(
      Formation formation,
      List<Position> allLinePlayersPositions,
      List<Position> allGoalkeeperPlayersPositions) {

    calculateBetterGoalkeeper(formation, allGoalkeeperPlayersPositions);
    calculateBetterLinePlayers(formation, allLinePlayersPositions);
  }

  private void calculateBetterGoalkeeper(
      Formation formation, List<Position> allGoalkeeperPlayersPositions) {
    formation.setGoalkeeperPosition(
        allGoalkeeperPlayersPositions.stream()
            .filter(
                (position) ->
                    position.getName().equals(formation.getGoalkeeperPosition().getName()))
            .sorted(Comparator.comparingDouble(Position::getPercentage).reversed())
            .findFirst()
            .get());
  }

  private void calculateBetterLinePlayers(
      Formation formation, List<Position> allLinePlayerPositions) {
    List<List<Position>> possiblePositionsMatrix = new ArrayList<List<Position>>();
    iterator = 0;
    for (Position pos : formation.getLinePositions()) {
      possiblePositionsMatrix.add(new ArrayList<Position>());
      for (Position insidePos :
          allLinePlayerPositions.stream()
              .filter(
                  (linePosition) ->
                      linePosition.getName().equals(pos.getName())
                          && !possiblePositionsMatrix.get(iterator).stream()
                              .map(Position::getPlayerId)
                              .distinct()
                              .collect(Collectors.toList())
                              .contains(linePosition.getPlayerId()))
              .collect(Collectors.toList())) {
        possiblePositionsMatrix.get(iterator).add(insidePos);
      }
      iterator++;
    }

    formation.setLinePositions(getOptimalPositions(possiblePositionsMatrix));
  }

  public List<Position> getOptimalPositions(List<List<Position>> matrix) {
    // Mapa para armazenar os estados de soluções parciais: chave será o conjunto de
    // jogadores usados
    // e o valor será a soma máxima de porcentagens.
    Map<Set<String>, Double> dp = new HashMap<>();
    // Mapa para armazenar a melhor combinação de posições para cada estado
    Map<Set<String>, List<Position>> positionCombination = new HashMap<>();

    // Inicializa o estado com nenhum jogador usado e soma 0
    dp.put(new HashSet<>(), 0.0);
    positionCombination.put(new HashSet<>(), new ArrayList<>());

    // Iterar sobre cada linha (posição necessária no campo)
    for (List<Position> row : matrix) {
      // Novo mapa para armazenar as soluções atualizadas para a linha atual
      Map<Set<String>, Double> newDp = new HashMap<>();
      Map<Set<String>, List<Position>> newPositionCombination = new HashMap<>();

      // Iterar sobre todas as soluções parciais já encontradas
      for (Map.Entry<Set<String>, Double> entry : dp.entrySet()) {
        Set<String> usedPlayers = entry.getKey();
        Double currentSum = entry.getValue();
        List<Position> currentCombo = positionCombination.get(usedPlayers);

        // Iterar sobre as opções da linha atual
        for (Position position : row) {
          String playerKey = position.getPlayerId().toString() + "-" + position.getPlayerName();

          // Verificar se o jogador já foi usado na solução atual
          if (!usedPlayers.contains(playerKey)) {
            // Criar uma nova combinação de jogadores
            Set<String> newUsedPlayers = new HashSet<>(usedPlayers);
            newUsedPlayers.add(playerKey);
            Double newSum = currentSum + position.getPercentage();

            // Verificar se a nova soma é maior que a soma existente para esse estado
            if (!newDp.containsKey(newUsedPlayers) || newDp.get(newUsedPlayers) < newSum) {
              newDp.put(newUsedPlayers, newSum);
              List<Position> newCombo = new ArrayList<>(currentCombo);
              newCombo.add(position);
              newPositionCombination.put(newUsedPlayers, newCombo);
            }
          }
        }
      }

      // Atualizar o mapa de soluções com as soluções da linha atual
      dp.putAll(newDp);
      positionCombination.putAll(newPositionCombination);
    }

    // Encontrar a solução com a maior soma de porcentagens
    Double maxSum = Double.MIN_VALUE;
    Set<String> bestState = null;
    for (Map.Entry<Set<String>, Double> entry : dp.entrySet()) {
      if (entry.getValue() > maxSum) {
        maxSum = entry.getValue();
        bestState = entry.getKey();
      }
    }

    // Retornar a combinação de posições associada ao melhor estado
    return positionCombination.get(bestState);
  }
}
