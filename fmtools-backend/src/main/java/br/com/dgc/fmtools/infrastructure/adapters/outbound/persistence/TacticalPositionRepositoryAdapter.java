package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.TacticalPositionRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalPositionEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.TacticalPositionRepository;

@Component
public class TacticalPositionRepositoryAdapter implements TacticalPositionRepositoryPort {
    private final TacticalPositionRepository tacticalPositionRepository;

    public TacticalPositionRepositoryAdapter(TacticalPositionRepository tacticalPositionRepository) {
        this.tacticalPositionRepository = tacticalPositionRepository;
    }

    @Override
    public TacticalPositionEntity saveToDatabase(TacticalPositionEntity tacticalPositionEntity) {
        return this.tacticalPositionRepository.save(tacticalPositionEntity);
    }

    @Override
    public TacticalPositionEntity getFromDatabase(UUID id) {
        return this.tacticalPositionRepository.getReferenceById(id);
    }

    @Override
    public List<TacticalPositionEntity> getAllTacticalPositionsFromDatabase(UUID formationId, UUID ownerId) {
        return this.tacticalPositionRepository.findAllByFormationIdAndOwnerId(formationId, ownerId);
    }
}
