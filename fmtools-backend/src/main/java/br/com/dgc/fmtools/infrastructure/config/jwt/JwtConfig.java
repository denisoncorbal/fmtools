package br.com.dgc.fmtools.infrastructure.config.jwt;

import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.lang.JoseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Value("${custom.jwt.issuer}")
    private String issuer;

    @Value("${custom.jwt.audience}")
    private String audience;

    @Value("${custom.jwt.keyId}")
    private String keyId;

    @Value("${custom.jwt.expirationTimeMinutesInTheFuture}")
    private int expirationTimeMinutesInTheFuture;

    @Value("${custom.jwt.notBeforeMinutesInThePast}")
    private int notBeforeMinutesInThePast;

    @Value("${custom.jwt.diffBetweenAccessAndRefreshInMinutes}")
    private int diffBetweenAccessAndRefresh;

    @Value("${custom.jwt.numberOfBytesForId}")
    private int numberOfBytesForId;

    public String getIssuer() {
        return issuer;
    }

    public String getAudience() {
        return audience;
    }

    public int getExpirationTimeMinutesInTheFuture() {
        return expirationTimeMinutesInTheFuture;
    }

    public int getNotBeforeMinutesInThePast() {
        return notBeforeMinutesInThePast;
    }

    public int getDiffBetweenAccessAndRefresh() {
        return diffBetweenAccessAndRefresh;
    }

    public int getNumberOfBytesForId() {
        return numberOfBytesForId;
    }

    @Bean
    public RsaJsonWebKey rsaJsonWebKey() throws JoseException {
        RsaJsonWebKey rsaJsonWebKey = RsaJwkGenerator.generateJwk(3072);
        rsaJsonWebKey.setKeyId(this.keyId);
        return rsaJsonWebKey;
    }

}
