package br.com.dgc.fmtools.application.ports.outbound;

import java.util.List;
import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.FormationEntity;

public interface FormationRepositoryPort {
    public FormationEntity saveToDatabase(FormationEntity formationEntity);

    public List<FormationEntity> getAllFormationsFromDatabaseByTacticalStyleIdAndOwnerId(UUID tacticalStyleId,
            UUID ownerId);

    public List<FormationEntity> getAllFormationsFromDatabaseByOwnerId(UUID ownerId);
}
