package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.FormationEntity;

public interface FormationRepository extends JpaRepository<FormationEntity, UUID> {

    List<FormationEntity> findAllByTacticalStyleIdAndOwnerId(UUID tacticalStyleId, UUID ownerId);

    List<FormationEntity> findAllByOwnerId(UUID ownerId);

}
