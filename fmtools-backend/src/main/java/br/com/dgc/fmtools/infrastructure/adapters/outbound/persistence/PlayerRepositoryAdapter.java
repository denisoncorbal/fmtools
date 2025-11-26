package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.PlayerRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.PlayerEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.PlayerRepository;

@Component
public class PlayerRepositoryAdapter implements PlayerRepositoryPort {
    private final PlayerRepository playerRepository;

    public PlayerRepositoryAdapter(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public PlayerEntity saveToDatabase(PlayerEntity playerEntity) {
        return this.playerRepository.save(playerEntity);
    }

    @Override
    public PlayerEntity getFromDatabase(UUID id) {
        return this.playerRepository.getReferenceById(id);
    }

    @Override
    public List<PlayerEntity> getPlayersBySquadIdAndOwnerId(UUID squadId, UUID ownerId) {
        return this.playerRepository.findAllBySquadIdAndOwnerId(squadId, ownerId);
    }

    @Override
    public PlayerEntity getPlayerFromDatabase(UUID id, UUID ownerId) {
        return this.playerRepository.findByIdAndOwnerId(id, ownerId);
    }

}
