package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.lang.JoseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.dgc.fmtools.application.ports.inbound.AuthenticationControllerPort;
import br.com.dgc.fmtools.application.services.AuthenticationService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.LoginRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.RefreshRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.SignInRequestDto;

@RestController
@RequestMapping("api/v1/auth")
public class AuthenticationControllerAdapter implements AuthenticationControllerPort {

    private final AuthenticationService authenticationService;

    public AuthenticationControllerAdapter(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    @PostMapping("/signIn")
    public ResponseEntity<?> signIn(@RequestBody SignInRequestDto signInRequestDto) {
        return ResponseEntity.ok(this.authenticationService.signIn(signInRequestDto));
    }

    @Override
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDto loginRequestDto)
            throws JsonProcessingException, JoseException {
        return ResponseEntity.ok(this.authenticationService.login(loginRequestDto));
    }

    @Override
    @PostMapping("/refresh")
    public ResponseEntity<?> refreshLogin(@RequestBody RefreshRequestDto refreshRequestDto) throws JsonMappingException,
            JsonProcessingException, MalformedClaimException, JoseException, InvalidJwtException {
        return ResponseEntity.ok(this.authenticationService.refresh(refreshRequestDto));
    }

}
