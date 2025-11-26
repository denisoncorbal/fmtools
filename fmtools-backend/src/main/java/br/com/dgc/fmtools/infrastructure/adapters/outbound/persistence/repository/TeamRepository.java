package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TeamEntity;

public interface TeamRepository extends JpaRepository<TeamEntity, UUID> {

    List<TeamEntity> findAllByOwnerId(UUID ownerId);

}
