package br.com.dgc.fmtools.squad_manager.domain.repository;

import br.com.dgc.fmtools.squad_manager.domain.repository.dao.LinePlayerEntity;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetLinePlayerByIdResponse;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinePlayerRepository extends JpaRepository<LinePlayerEntity, UUID> {
  Optional<GetLinePlayerByIdResponse> findLinePlayerEntityById(UUID id);
}
