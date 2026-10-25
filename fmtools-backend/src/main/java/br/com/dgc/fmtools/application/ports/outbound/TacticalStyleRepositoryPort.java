package br.com.dgc.fmtools.application.ports.outbound;

import java.util.List;
import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticalStyleEntity;

public interface TacticalStyleRepositoryPort {
    public TacticalStyleEntity saveToDatabase(TacticalStyleEntity tacticalStyleEntity);

    public TacticalStyleEntity getFromDatabase(UUID tacticalStyleId);

    public List<TacticalStyleEntity> getAllTacticalStylesByTacticIdAndOwnerIdFromDatabase(UUID tacticId, String ownerId);

    public List<TacticalStyleEntity> getAllTacticalStylesByOwnerIdFromDatabase(String ownerId);
}