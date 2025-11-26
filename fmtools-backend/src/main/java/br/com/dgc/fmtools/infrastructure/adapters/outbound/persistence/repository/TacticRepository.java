package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticEntity;

public interface TacticRepository extends JpaRepository<TacticEntity, UUID> {

    List<TacticEntity> findAllByTeamIdAndOwnerId(UUID teamId, UUID ownerId);

    List<TacticEntity> findAllByOwnerId(UUID ownerId);

}
