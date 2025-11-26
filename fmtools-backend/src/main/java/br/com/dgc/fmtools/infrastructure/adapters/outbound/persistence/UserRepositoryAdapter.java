package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence;

import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.application.ports.outbound.UserRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.UserEntity;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository.UserRepository;

@Component
public class UserRepositoryAdapter implements UserRepositoryPort {
    private final UserRepository userRepository;

    public UserRepositoryAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity saveToDatabase(UserEntity userEntity) {
        return this.userRepository.save(userEntity);
    }

    @Override
    public UserEntity getFromDatabaseByUsername(String username) {
        return this.userRepository.getReferenceByUsername(username);
    }

    @Override
    public UserEntity getFromDatabaseById(UUID id) {
        return this.userRepository.getReferenceById(id);
    }
}
