package br.com.dgc.fmtools.application.ports.outbound;

import java.util.List;
import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalPositionEntity;

public interface TacticalPositionRepositoryPort {
    public TacticalPositionEntity saveToDatabase(TacticalPositionEntity tacticalPositionEntity);

    public TacticalPositionEntity getFromDatabase(UUID id);

    public List<TacticalPositionEntity> getAllTacticalPositionsFromDatabase(UUID formationId, UUID ownerId);
}
