package br.com.dgc.fmtools.formation_calculator_service.clients;

import br.com.dgc.fmtools.formation_calculator_service.ApplicationProperties;
import java.time.Duration;
import org.springframework.boot.http.client.ClientHttpRequestFactoryBuilder;
import org.springframework.boot.http.client.ClientHttpRequestFactorySettings;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

@Configuration
public class SquadManagerClientConfiguration {

  @Bean("squadManagerRestClient")
  RestClient squadManagerRestClient(
      RestClient.Builder builder, ApplicationProperties properties, SslBundles sslBundles) {
    ClientHttpRequestFactory requestFactory =
        ClientHttpRequestFactoryBuilder.simple()
            .build(
                new ClientHttpRequestFactorySettings(
                    null,
                    Duration.ofSeconds(5),
                    Duration.ofSeconds(5),
                    sslBundles.getBundle("client")));
    return builder
        .baseUrl(properties.squadManagerServiceUrl())
        .requestFactory(requestFactory)
        .build();
  }
}
