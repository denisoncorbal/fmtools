package br.com.dgc.fmtools.application.ports.outbound;

import java.util.List;
import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.PlayerEntity;

public interface PlayerRepositoryPort {
    public PlayerEntity saveToDatabase(PlayerEntity playerEntity);

    public PlayerEntity getFromDatabase(UUID id);

    public List<PlayerEntity> getPlayersBySquadIdAndOwnerId(UUID squadId, UUID ownerId);

    public PlayerEntity getPlayerFromDatabase(UUID id, UUID ownerId);
}
