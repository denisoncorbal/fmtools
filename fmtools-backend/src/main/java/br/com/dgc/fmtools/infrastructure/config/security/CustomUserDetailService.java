package br.com.dgc.fmtools.infrastructure.config.security;

import java.util.UUID;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.dgc.fmtools.application.ports.outbound.UserRepositoryPort;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.UserEntity;

public class CustomUserDetailService implements UserDetailsService {

    private final UserRepositoryPort userRepositoryPort;

    public CustomUserDetailService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = this.userRepositoryPort.getFromDatabaseById(UUID.fromString(username));

        return User.builder().username(userEntity.getId().toString()).password("").roles("").build();
    }

}
