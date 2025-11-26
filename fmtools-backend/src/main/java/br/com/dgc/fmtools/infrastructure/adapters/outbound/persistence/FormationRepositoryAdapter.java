package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.FormationRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.FormationEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.FormationRepository;

@Component
public class FormationRepositoryAdapter implements FormationRepositoryPort {
    private final FormationRepository formationRepository;

    public FormationRepositoryAdapter(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    @Override
    public FormationEntity saveToDatabase(FormationEntity formationEntity) {
        return this.formationRepository.save(formationEntity);
    }

    @Override
    public List<FormationEntity> getAllFormationsFromDatabaseByTacticalStyleIdAndOwnerId(UUID tacticalStyleId,
            UUID ownerId) {
        return this.formationRepository.findAllByTacticalStyleIdAndOwnerId(tacticalStyleId, ownerId);
    }

    @Override
    public List<FormationEntity> getAllFormationsFromDatabaseByOwnerId(UUID ownerId) {
        return this.formationRepository.findAllByOwnerId(ownerId);
    }
}
