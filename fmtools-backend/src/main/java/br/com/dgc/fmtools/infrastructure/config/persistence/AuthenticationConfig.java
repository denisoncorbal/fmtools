package br.com.dgc.fmtools.infrastructure.config.persistence;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationConfig {
    private final String PEPPER;

    public String getPEPPER() {
        return PEPPER;
    }

    public AuthenticationConfig(Environment environment) {
        this.PEPPER = environment.getProperty("APP_PEPPER");
    }
}
