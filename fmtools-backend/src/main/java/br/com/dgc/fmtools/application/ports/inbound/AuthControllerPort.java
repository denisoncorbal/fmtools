package br.com.dgc.fmtools.application.ports.inbound;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.Jwt;

public interface AuthControllerPort {
    public ResponseEntity<?> login();

    public ResponseEntity<?> me(Jwt jwt);
}