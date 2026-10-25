package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {

    List<PlayerEntity> findAllBySquadIdAndOwnerId(UUID squadId, String ownerId);

    PlayerEntity findByIdAndOwnerId(UUID id, String ownerId);

}
