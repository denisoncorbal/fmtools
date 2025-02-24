package br.com.dgc.fmtools.squad_manager.domain.repository;

import br.com.dgc.fmtools.squad_manager.domain.repository.dao.GoalkeeperPlayerEntity;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetGoalkeeperPlayerByIdResponse;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalkeeperPlayerRepository extends JpaRepository<GoalkeeperPlayerEntity, UUID> {
  Optional<GetGoalkeeperPlayerByIdResponse> findGoalkeeperPlayerEntityById(UUID id);
}
