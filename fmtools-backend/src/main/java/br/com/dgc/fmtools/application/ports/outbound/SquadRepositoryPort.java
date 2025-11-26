package br.com.dgc.fmtools.application.ports.outbound;

import java.util.List;
import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.SquadEntity;

public interface SquadRepositoryPort {
    public SquadEntity saveToDatabase(SquadEntity squadEntity);

    public SquadEntity getFromDatabase(UUID squadId);

    public List<SquadEntity> getAllSquadsFromDatabaseByTeamIdAndOwnerId(UUID teamId, UUID ownerId);

    public List<SquadEntity> getAllSquadsFromDatabaseByOwnerId(UUID ownerId);
}
