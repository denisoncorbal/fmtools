package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.SquadRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.SquadEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.SquadRepository;

@Component
public class SquadRepositoryAdapter implements SquadRepositoryPort {
    private final SquadRepository squadRepository;

    public SquadRepositoryAdapter(SquadRepository squadRepository) {
        this.squadRepository = squadRepository;
    }

    @Override
    public SquadEntity saveToDatabase(SquadEntity squadEntity) {
        return this.squadRepository.save(squadEntity);
    }

    @Override
    public SquadEntity getFromDatabase(UUID squadId) {
        return this.squadRepository.getReferenceById(squadId);
    }

    @Override
    public List<SquadEntity> getAllSquadsFromDatabaseByTeamIdAndOwnerId(UUID teamId, UUID ownerId) {
        return this.squadRepository.findAllByTeamIdAndOwnerId(teamId, ownerId);
    }

    @Override
    public List<SquadEntity> getAllSquadsFromDatabaseByOwnerId(UUID ownerId) {
        return this.squadRepository.findAllByOwnerId(ownerId);
    }
}
