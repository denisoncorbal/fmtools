package br.com.dgc.fmtools.squad_manager.domain.repository;

import br.com.dgc.fmtools.squad_manager.domain.repository.dao.GoalkeeperPlayerEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalkeeperPlayerRepository extends JpaRepository<GoalkeeperPlayerEntity, UUID> {}
