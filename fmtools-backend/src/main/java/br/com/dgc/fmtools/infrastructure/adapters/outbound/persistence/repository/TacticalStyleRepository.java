package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalStyleEntity;

public interface TacticalStyleRepository extends JpaRepository<TacticalStyleEntity, UUID> {

    List<TacticalStyleEntity> findAllByTacticIdAndOwnerId(UUID tacticId, UUID ownerId);

    List<TacticalStyleEntity> findAllByOwnerId(UUID ownerId);
}
