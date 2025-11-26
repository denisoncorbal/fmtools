package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.TacticRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.TacticEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.TacticRepository;

@Component
public class TacticRepositoryAdapter implements TacticRepositoryPort {
    private final TacticRepository tacticRepository;

    public TacticRepositoryAdapter(TacticRepository tacticRepository) {
        this.tacticRepository = tacticRepository;
    }

    @Override
    public TacticEntity saveToDatabase(TacticEntity tacticEntity) {
        return this.tacticRepository.save(tacticEntity);
    }

    @Override
    public TacticEntity getFromDatabase(UUID tacticId) {
        return this.tacticRepository.getReferenceById(tacticId);
    }

    @Override
    public List<TacticEntity> getAllTacticsFromDatabaseByTeamIdAndOwnerId(UUID teamId, UUID ownerId) {
        return this.tacticRepository.findAllByTeamIdAndOwnerId(teamId, ownerId);
    }

    @Override
    public List<TacticEntity> getAllTacticsFromDatabaseByOwnerId(UUID ownerId) {
        return this.tacticRepository.findAllByOwnerId(ownerId);
    }
}
