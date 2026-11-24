package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgc.fmtools.application.ports.inbound.AuthControllerPort;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.GetMeResponseDto;

@RestController
@RequestMapping("api/v1/auth")
public class AuthControllerAdapter implements AuthControllerPort {

    @Override
    @GetMapping("/login")
    public ResponseEntity<?> login() {
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("https://fmtools.denison.corbal.nom.br")).build();
    }

    @Override
    @GetMapping("/me")
    public ResponseEntity<GetMeResponseDto> me(
            @AuthenticationPrincipal Jwt jwt) {

        if (jwt == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Map<String, Object> realmAccess = jwt.getClaim("realm_access");

        List<String> roles = realmAccess != null
                ? (List<String>) realmAccess.getOrDefault("roles", Collections.emptyList())
                : Collections.emptyList();

        GetMeResponseDto response = new GetMeResponseDto(
                jwt.getClaimAsString("name"),
                jwt.getClaimAsString("email"),
                roles);

        return ResponseEntity.ok(response);
    }
}
