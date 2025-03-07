package br.com.dgc.fmtools.positions_calculator_service.domain.service;

import br.com.dgc.fmtools.positions_calculator_service.clients.GoalkeeperPlayerExternal;
import br.com.dgc.fmtools.positions_calculator_service.clients.LinePlayerExternal;
import br.com.dgc.fmtools.positions_calculator_service.clients.SquadManagerClientService;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;
import br.com.dgc.fmtools.positions_calculator_service.domain.model.position.SuitablePosition;
import br.com.dgc.fmtools.positions_calculator_service.domain.repository.PositionsCalculatorRepository;
import br.com.dgc.fmtools.positions_calculator_service.domain.repository.dao.Positions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class PositionsCalculatorService {

  private ObjectMapper objectMapper = new ObjectMapper();

  private SquadManagerClientService squadManagerClientService;

  private PositionsCalculatorRepository positionsCalculatorRepository;

  public PositionsCalculatorService(
      SquadManagerClientService squadManagerClientService,
      PositionsCalculatorRepository positionsCalculatorRepository) {
    this.squadManagerClientService = squadManagerClientService;
    this.positionsCalculatorRepository = positionsCalculatorRepository;
  }

  public List<SuitablePosition> calculateGoalkeeperPositions(UUID id)
      throws JsonProcessingException {
    GoalkeeperPlayerExternal goalkeeperPlayerExternal =
        this.squadManagerClientService.getGoalkeeperPlayerById(id).get();
    GoalkeeperPlayer goalkeeperPlayer =
        this.objectMapper.convertValue(goalkeeperPlayerExternal, GoalkeeperPlayer.class);

    List<SuitablePosition> suitablePositions = goalkeeperPlayer.calculateSuitablePositions();

    this.positionsCalculatorRepository.save(
        new Positions(id, objectMapper.writeValueAsString(suitablePositions)));

    return suitablePositions;
  }

  public List<SuitablePosition> calculateLinePositions(UUID id) throws JsonProcessingException {
    LinePlayerExternal linePlayerExternal =
        this.squadManagerClientService.getLinePlayerById(id).get();
    LinePlayer linePlayer = this.objectMapper.convertValue(linePlayerExternal, LinePlayer.class);

    List<SuitablePosition> suitablePositions = linePlayer.calculateSuitablePositions();

    this.positionsCalculatorRepository.save(
        new Positions(id, objectMapper.writeValueAsString(suitablePositions)));

    return suitablePositions;
  }
}
