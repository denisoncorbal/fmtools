package br.com.dgc.fmtools.infrastructure.config.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.dgc.fmtools.application.ports.outbound.UserRepositoryPort;

@Configuration
public class UserSecurityConfig {

    private final UserRepositoryPort userRepositoryPort;

    public UserSecurityConfig(UserRepositoryPort userRepositoryAdapter) {
        this.userRepositoryPort = userRepositoryAdapter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailService(this.userRepositoryPort);
    }

    @Bean
    public AuthenticationManager authenticationManager() {
        return new ProviderManager(List.of(
                new DaoAuthenticationProvider(this.userDetailsService())));

    }
}
