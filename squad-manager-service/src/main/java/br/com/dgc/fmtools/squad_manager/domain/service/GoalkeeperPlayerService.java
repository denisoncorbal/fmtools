package br.com.dgc.fmtools.squad_manager.domain.service;

import br.com.dgc.fmtools.squad_manager.domain.repository.GoalkeeperPlayerRepository;
import br.com.dgc.fmtools.squad_manager.domain.repository.dao.GoalkeeperPlayerEntity;
import br.com.dgc.fmtools.squad_manager.web.dto.request.GoalkeeperPlayerRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
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
}
