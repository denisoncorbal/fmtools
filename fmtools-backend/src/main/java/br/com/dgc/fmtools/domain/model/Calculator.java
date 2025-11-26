package br.com.dgc.fmtools.domain.model;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.jgrapht.Graph;
import org.jgrapht.alg.matching.MaximumWeightBipartiteMatching;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import br.com.dgc.fmtools.domain.model.constants.PositionAttributesList;
import br.com.dgc.fmtools.domain.model.interfaces.PlayerAttributes;

public class Calculator {
        public double calculatePlayerSuitabilityForPosition(Player player, TacticalPosition tacticalPosition) {
                List<PlayerAttributes> keyAttributes = PositionAttributesList.getInstance()
                                .getKeyAttributesList(tacticalPosition);
                List<PlayerAttributes> preferableAttributes = PositionAttributesList.getInstance()
                                .getPreferableAttributesList(tacticalPosition);

                double suitability = 0.0;

                suitability += keyAttributes.stream().map((ka) -> player.attributes.getOrDefault(ka.toString(), 0))
                                .reduce(Integer::sum)
                                .get();
                suitability *= 2;
                suitability += preferableAttributes.stream()
                                .map((pa) -> player.attributes.getOrDefault(pa.toString(), 0))
                                .reduce(Integer::sum).get();
                suitability /= (keyAttributes.size() * 2 + preferableAttributes.size());
                suitability = suitability * 100 / 20;

                return suitability;
        }

        /**
         * This method has sid effects on parameter tacticalPositions. After calculation
         * it attributes players on tacticalPositions according to result.
         * 
         * @param players
         * @param tacticalPositions
         */
        public double calculateBestPlayersForFormation(List<Player> players, List<TacticalPosition> tacticalPositions) {
                Graph<String, DefaultWeightedEdge> graph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);

                for (int i = 0; i < players.size(); i++) {
                        String pId = players.get(i).getId().toString();
                        graph.addVertex(pId);
                        for (int j = 0; j < tacticalPositions.size(); j++) {
                                String tpId = tacticalPositions.get(j).getId().toString();
                                graph.addVertex(tpId);
                                DefaultWeightedEdge e = graph.addEdge(pId, tpId);

                                graph.setEdgeWeight(e,
                                                calculatePlayerSuitabilityForPosition(players.get(i),
                                                                tacticalPositions.get(j)));
                        }
                }

                MaximumWeightBipartiteMatching<String, DefaultWeightedEdge> hungarianAlg = new MaximumWeightBipartiteMatching<>(
                                graph, players.stream().map(p -> p.getId().toString()).collect(Collectors.toSet()),
                                tacticalPositions.stream().map(
                                                tp -> tp.getId().toString())
                                                .collect(Collectors.toSet()));

                Set<DefaultWeightedEdge> matching = hungarianAlg.getMatching().getEdges();
                double totalWeight = hungarianAlg.getMatching().getWeight();

                for (DefaultWeightedEdge e : matching) {
                        Player p = players.stream().filter(pl -> pl.getId().toString().equals(graph.getEdgeSource(e)))
                                        .findFirst().get();
                        tacticalPositions.stream()
                                        .filter(tp -> tp.getId().toString().equals(graph.getEdgeTarget(e)))
                                        .findFirst().get().assignPlayer(p, graph.getEdgeWeight(e));
                }

                return totalWeight / 11;
        }
}
