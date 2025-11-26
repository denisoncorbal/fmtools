package br.com.dgc.fmtools.application.ports.inbound;

import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.lang.JoseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.LoginRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.RefreshRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.SignInRequestDto;

public interface AuthenticationControllerPort {
    public ResponseEntity<?> signIn(SignInRequestDto signInRequestDto);

    public ResponseEntity<?> login(@RequestBody LoginRequestDto loginRequestDto)
            throws JsonProcessingException, JoseException;

    public ResponseEntity<?> refreshLogin(@RequestBody RefreshRequestDto refreshRequestDto) throws JsonMappingException,
            JsonProcessingException, MalformedClaimException, JoseException, InvalidJwtException;
}
