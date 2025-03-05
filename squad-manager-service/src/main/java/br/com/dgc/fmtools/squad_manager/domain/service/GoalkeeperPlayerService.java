package br.com.dgc.fmtools.squad_manager.domain.service;

import br.com.dgc.fmtools.squad_manager.domain.repository.GoalkeeperPlayerRepository;
import br.com.dgc.fmtools.squad_manager.domain.repository.dao.GoalkeeperPlayerEntity;
import br.com.dgc.fmtools.squad_manager.exception.PlayerNotFoundException;
import br.com.dgc.fmtools.squad_manager.web.dto.request.GoalkeeperPlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetAllGoalkeeperPlayersResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetGoalkeeperPlayerByIdResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class GoalkeeperPlayerService {
  private final GoalkeeperPlayerRepository goalkeeperPlayerRepository;
  private final ObjectMapper objectMapper = new ObjectMapper();

  public GoalkeeperPlayerService(GoalkeeperPlayerRepository goalkeeperPlayerRepository) {
    this.goalkeeperPlayerRepository = goalkeeperPlayerRepository;
  }

  public UUID createGoalkeeperPlayer(GoalkeeperPlayerRequest goalkeeperPlayerRequest) {
    GoalkeeperPlayerEntity goalkeeperPlayerEntity =
        objectMapper.convertValue(goalkeeperPlayerRequest, GoalkeeperPlayerEntity.class);
    return goalkeeperPlayerRepository.save(goalkeeperPlayerEntity).getId();
  }

  public GetGoalkeeperPlayerByIdResponse getGoalkeeperPlayerById(UUID id)
      throws PlayerNotFoundException {
    return this.goalkeeperPlayerRepository
        .findGoalkeeperPlayerEntityById(id)
        .orElseThrow(() -> new PlayerNotFoundException(id));
  }

  public UUID updateGoalkeeperPlayer(UUID id, GoalkeeperPlayerRequest goalkeeperPlayerRequest)
      throws PlayerNotFoundException {
    GoalkeeperPlayerEntity goalkeeperPlayerEntity =
        objectMapper.convertValue(goalkeeperPlayerRequest, GoalkeeperPlayerEntity.class);
    goalkeeperPlayerEntity.setId(id);

    try {
      goalkeeperPlayerRepository.save(goalkeeperPlayerEntity);
    } catch (org.springframework.orm.ObjectOptimisticLockingFailureException e) {
      throw new PlayerNotFoundException(id);
    }

    return id;
  }

  public void deleteGoalkeeperPlayer(UUID id) {
    goalkeeperPlayerRepository.deleteById(id);
  }

  public List<GetAllGoalkeeperPlayersResponse> getAllGoalkeeperPlayers() {
    return this.goalkeeperPlayerRepository.findAllProjectedBy();
  }
}
