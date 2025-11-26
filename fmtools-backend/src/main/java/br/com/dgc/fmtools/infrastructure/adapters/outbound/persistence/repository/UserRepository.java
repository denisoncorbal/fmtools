package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    UserEntity getReferenceByUsername(String username);

}
