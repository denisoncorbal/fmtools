package br.com.dgc.fmtools.application.ports.inbound;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

public interface AuthenticationControllerPort {
    public ResponseEntity<?> login();

    public ResponseEntity<?> me(OidcUser user);
}
