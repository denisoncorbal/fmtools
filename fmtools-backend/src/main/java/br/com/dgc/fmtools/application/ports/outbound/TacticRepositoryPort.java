package br.com.dgc.fmtools.application.ports.outbound;

import java.util.List;
import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticEntity;

public interface TacticRepositoryPort {
    public TacticEntity saveToDatabase(TacticEntity tacticEntity);

    public TacticEntity getFromDatabase(UUID tacticId);

    public List<TacticEntity> getAllTacticsFromDatabaseByTeamIdAndOwnerId(UUID teamId, UUID ownerId);

    public List<TacticEntity> getAllTacticsFromDatabaseByOwnerId(UUID ownerId);
}
