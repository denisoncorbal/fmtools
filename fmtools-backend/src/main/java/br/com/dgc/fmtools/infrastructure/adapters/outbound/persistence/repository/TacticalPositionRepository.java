package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalPositionEntity;

public interface TacticalPositionRepository extends JpaRepository<TacticalPositionEntity, UUID> {

    List<TacticalPositionEntity> findAllByFormationIdAndOwnerId(UUID formationId, UUID ownerId);

}
