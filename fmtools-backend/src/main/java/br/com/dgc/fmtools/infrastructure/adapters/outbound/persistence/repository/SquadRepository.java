package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.SquadEntity;

public interface SquadRepository extends JpaRepository<SquadEntity, UUID> {

    List<SquadEntity> findAllByTeamIdAndOwnerId(UUID teamId, UUID ownerId);

    List<SquadEntity> findAllByOwnerId(UUID ownerId);

}
