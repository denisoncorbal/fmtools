package br.com.dgc.fmtools.squad_manager.domain.service;

import br.com.dgc.fmtools.squad_manager.domain.repository.LinePlayerRepository;
import br.com.dgc.fmtools.squad_manager.domain.repository.dao.LinePlayerEntity;
import br.com.dgc.fmtools.squad_manager.web.dto.request.LinePlayerRequest;
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
}
