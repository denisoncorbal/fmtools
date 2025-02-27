package br.com.dgc.fmtools.squad_manager.domain.service;

import br.com.dgc.fmtools.squad_manager.domain.repository.LinePlayerRepository;
import br.com.dgc.fmtools.squad_manager.domain.repository.dao.LinePlayerEntity;
import br.com.dgc.fmtools.squad_manager.exception.PlayerNotFoundException;
import br.com.dgc.fmtools.squad_manager.web.dto.request.LinePlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetLinePlayerByIdResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class LinePlayerService {
  private final LinePlayerRepository linePlayerRepository;
  private final ObjectMapper objectMapper = new ObjectMapper();

  public LinePlayerService(LinePlayerRepository linePlayerRepository) {
    this.linePlayerRepository = linePlayerRepository;
  }

  public UUID createLinePlayer(LinePlayerRequest linePlayerRequest) {
    LinePlayerEntity linePlayerEntity =
        objectMapper.convertValue(linePlayerRequest, LinePlayerEntity.class);
    return linePlayerRepository.save(linePlayerEntity).getId();
  }

  public GetLinePlayerByIdResponse getLinePlayerById(UUID id) throws PlayerNotFoundException {
    return linePlayerRepository
        .findLinePlayerEntityById(id)
        .orElseThrow(() -> new PlayerNotFoundException(id));
  }

  public UUID updateLinePlayer(UUID id, LinePlayerRequest linePlayerRequest)
      throws PlayerNotFoundException {
    LinePlayerEntity linePlayerEntity =
        objectMapper.convertValue(linePlayerRequest, LinePlayerEntity.class);
    linePlayerEntity.setId(id);

    try {
      linePlayerRepository.save(linePlayerEntity);
    } catch (org.springframework.orm.ObjectOptimisticLockingFailureException e) {
      throw new PlayerNotFoundException(id);
    }

    return id;
  }

  public void deleteLinePlayer(UUID id) {
    linePlayerRepository.deleteById(id);
  }
}
