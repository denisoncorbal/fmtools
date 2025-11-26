package br.com.dgc.fmtools.application.ports.outbound;

import java.util.List;
import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TeamEntity;

public interface TeamRepositoryPort {
    public TeamEntity saveToDatabase(TeamEntity teamEntity);

    public TeamEntity getFromDatabase(UUID teamId);

    public List<TeamEntity> getAllTeamsFromDatabase(UUID ownerId);
}
