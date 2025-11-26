package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.TacticalStyleRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalStyleEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.TacticalStyleRepository;

@Component
public class TacticalStyleRepositoryAdapter implements TacticalStyleRepositoryPort {
    private final TacticalStyleRepository tacticalStyleRepository;

    public TacticalStyleRepositoryAdapter(TacticalStyleRepository tacticalStyleRepository) {
        this.tacticalStyleRepository = tacticalStyleRepository;
    }

    @Override
    public TacticalStyleEntity saveToDatabase(TacticalStyleEntity tacticalStyleEntity) {
        return this.tacticalStyleRepository.save(tacticalStyleEntity);
    }

    @Override
    public TacticalStyleEntity getFromDatabase(UUID tacticalStyleId) {
        return this.tacticalStyleRepository.getReferenceById(tacticalStyleId);
    }

    @Override
    public List<TacticalStyleEntity> getAllTacticalStylesByTacticIdAndOwnerIdFromDatabase(UUID tacticId, UUID ownerId) {
        return this.tacticalStyleRepository.findAllByTacticIdAndOwnerId(tacticId, ownerId);
    }

    @Override
    public List<TacticalStyleEntity> getAllTacticalStylesByOwnerIdFromDatabase(UUID ownerId) {
        return this.tacticalStyleRepository.findAllByOwnerId(ownerId);
    }
}
