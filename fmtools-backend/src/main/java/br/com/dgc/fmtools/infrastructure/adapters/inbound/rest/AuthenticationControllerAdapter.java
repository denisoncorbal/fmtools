package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgc.fmtools.application.ports.inbound.AuthenticationControllerPort;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.MeResponseDto;

@RestController
@RequestMapping("api/v1/auth")
public class AuthenticationControllerAdapter implements AuthenticationControllerPort {

    @Override
    @GetMapping("/login")
    public ResponseEntity<?> login() {
        URI location = URI.create("https://fmtools.denison.corbal.nom.br");
        return ResponseEntity.status(HttpStatus.FOUND).location(location).build();
    }

    @Override
    @GetMapping("/me")
    public ResponseEntity<?> me(@AuthenticationPrincipal OidcUser user) {
        if (user == null) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        return ResponseEntity.ok(new MeResponseDto(
                user.getFullName(),
                user.getEmail(),
                user.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList()));

    }

}
