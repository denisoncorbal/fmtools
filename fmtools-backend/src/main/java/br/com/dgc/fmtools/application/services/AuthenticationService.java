package br.com.dgc.fmtools.application.services;

import java.util.Map;
import java.util.UUID;

import org.jose4j.jwa.AlgorithmConstraints.ConstraintType;
import org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers;
import org.jose4j.jwe.JsonWebEncryption;
import org.jose4j.jwe.KeyManagementAlgorithmIdentifiers;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.lang.JoseException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.dgc.fmtools.application.ports.outbound.UserRepositoryPort;
import br.com.dgc.fmtools.application.services.mappers.UserMapper;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.LoginRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.RefreshRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.SignInRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.LoginResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.RefreshResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.SignInResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.UserEntity;
import br.com.dgc.fmtools.infrastructure.config.jwt.JwtConfig;
import br.com.dgc.fmtools.infrastructure.config.jwt.JwtType;
import br.com.dgc.fmtools.infrastructure.config.persistence.AuthenticationConfig;

@Service
public class AuthenticationService {

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationConfig authenticationConfig;
    private final UserRepositoryPort userRepositoryPort;
    private final RsaJsonWebKey rsaJsonWebKey;
    private final JwtConfig jwtConfig;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final String tokenKey = "token";

    public AuthenticationService(UserMapper userMapper, PasswordEncoder passwordEncoder,
            AuthenticationConfig authenticationConfig, UserRepositoryPort userRepositoryPort,
            RsaJsonWebKey rsaJsonWebKey, JwtConfig jwtConfig) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
        this.authenticationConfig = authenticationConfig;
        this.userRepositoryPort = userRepositoryPort;
        this.rsaJsonWebKey = rsaJsonWebKey;
        this.jwtConfig = jwtConfig;
    }

    public SignInResponseDto signIn(SignInRequestDto signInRequestDto) {
        UserEntity userEntity = this.userMapper.toUserEntity(signInRequestDto);
        userEntity.setSalt(UUID.randomUUID().toString());
        userEntity.setPassword(this.passwordEncoder
                .encode(signInRequestDto.password() + userEntity.getSalt() + this.authenticationConfig.getPEPPER()));
        userEntity = this.userRepositoryPort.saveToDatabase(userEntity);
        return this.userMapper.toSignInResponseDto(userEntity);
    }

    public LoginResponseDto login(LoginRequestDto loginRequestDto) throws JsonProcessingException, JoseException {
        UserEntity userEntity = this.userRepositoryPort.getFromDatabaseByUsername(loginRequestDto.username());
        this.passwordEncoder.matches(
                loginRequestDto.password() + userEntity.getSalt() + this.authenticationConfig.getPEPPER(),
                userEntity.getPassword());
        return new LoginResponseDto(this.generateToken(userEntity.getId().toString(), JwtType.ACCESS),
                this.generateToken(userEntity.getId().toString(), JwtType.REFRESH));
    }

    private String generateToken(String userId, JwtType jwtType) throws JoseException, JsonProcessingException {
        JwtClaims claims = new JwtClaims();
        claims.setIssuer(this.jwtConfig.getIssuer());
        claims.setAudience(this.jwtConfig.getAudience());
        if (jwtType.equals(JwtType.ACCESS)) {
            claims.setExpirationTimeMinutesInTheFuture(this.jwtConfig.getExpirationTimeMinutesInTheFuture());
            claims.setNotBeforeMinutesInThePast(this.jwtConfig.getNotBeforeMinutesInThePast());
        } else {
            claims.setExpirationTimeMinutesInTheFuture(
                    this.jwtConfig.getExpirationTimeMinutesInTheFuture()
                            + this.jwtConfig.getDiffBetweenAccessAndRefresh());
            claims.setNotBeforeMinutesInThePast(this.jwtConfig.getExpirationTimeMinutesInTheFuture());
        }

        claims.setGeneratedJwtId(this.jwtConfig.getNumberOfBytesForId());
        claims.setIssuedAtToNow();

        claims.setSubject(userId);

        JsonWebSignature jws = new JsonWebSignature();

        jws.setPayload(claims.toJson());

        jws.setKey(rsaJsonWebKey.getPrivateKey());

        jws.setKeyIdHeaderValue(rsaJsonWebKey.getKeyId());

        jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);

        String jwt = jws.getCompactSerialization();

        JsonWebEncryption jwe = new JsonWebEncryption();
        String payload = this.objectMapper.writeValueAsString(Map.of(AuthenticationService.tokenKey, jwt));
        jwe.setPayload(payload);
        jwe.setAlgorithmHeaderValue(KeyManagementAlgorithmIdentifiers.RSA_OAEP_256);
        jwe.setEncryptionMethodHeaderParameter(ContentEncryptionAlgorithmIdentifiers.AES_256_GCM);
        jwe.setKey(rsaJsonWebKey.getPublicKey());
        jwe.setKeyIdHeaderValue(rsaJsonWebKey.getKeyId());

        String jwtEncripted = jwe.getCompactSerialization();

        return jwtEncripted;
    }

    public String validateToken(String jwtEncripted) throws JoseException, JsonMappingException,
            JsonProcessingException, InvalidJwtException, MalformedClaimException {
        JsonWebEncryption jweDecryption = new JsonWebEncryption();
        jweDecryption.setCompactSerialization(jwtEncripted);
        jweDecryption.setKey(rsaJsonWebKey.getPrivateKey());

        String decryptedPayload = jweDecryption.getPayload();

        Map<String, String> json = this.objectMapper.readValue(decryptedPayload,
                new TypeReference<Map<String, String>>() {
                });

        String jwt = (String) json.get(AuthenticationService.tokenKey);

        JwtConsumer jwtConsumer = new JwtConsumerBuilder()
                .setRequireExpirationTime()
                .setAllowedClockSkewInSeconds(30)
                .setRequireSubject()
                .setExpectedIssuer(this.jwtConfig.getIssuer())
                .setExpectedAudience(this.jwtConfig.getAudience())
                .setVerificationKey(rsaJsonWebKey.getKey())
                .setJwsAlgorithmConstraints(
                        ConstraintType.PERMIT, AlgorithmIdentifiers.RSA_USING_SHA256)
                .build();

        JwtClaims jwtClaims = jwtConsumer.processToClaims(jwt);

        String subject = jwtClaims.getSubject();

        return subject;
    }

    public Object refresh(RefreshRequestDto refreshRequestDto) throws JsonMappingException, JsonProcessingException,
            MalformedClaimException, JoseException, InvalidJwtException {
        String subject = this.validateToken(refreshRequestDto.refreshToken());
        return new RefreshResponseDto(this.generateToken(subject, JwtType.ACCESS));
    }
}
