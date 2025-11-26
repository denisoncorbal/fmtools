package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.TeamRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TeamEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.TeamRepository;

@Component
public class TeamRepositoryAdapter implements TeamRepositoryPort {
    private final TeamRepository teamRepository;

    public TeamRepositoryAdapter(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public TeamEntity saveToDatabase(TeamEntity teamEntity) {
        return this.teamRepository.save(teamEntity);
    }

    @Override
    public TeamEntity getFromDatabase(UUID teamId) {
        return this.teamRepository.getReferenceById(teamId);
    }

    @Override
    public List<TeamEntity> getAllTeamsFromDatabase(UUID ownerId) {
        return this.teamRepository.findAllByOwnerId(ownerId);
    }
}
