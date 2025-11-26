package br.com.dgc.fmtools.application.ports.outbound;

import java.util.UUID;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.UserEntity;

public interface UserRepositoryPort {

    public UserEntity saveToDatabase(UserEntity userEntity);

    public UserEntity getFromDatabaseByUsername(String username);

    public UserEntity getFromDatabaseById(UUID id);

}
