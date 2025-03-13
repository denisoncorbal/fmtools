package br.com.dgc.fmtools.formation_calculator_service.clients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class PositionsCalculatorClientService {

  private static final Logger log = LoggerFactory.getLogger(PositionsCalculatorClientService.class);

  @Autowired
  @Qualifier("positionsCalculatorRestClient") private RestClient positionsCalculatorRestClient;

  @CircuitBreaker(name = "call-get-line-positions-by-id")
  @Retry(name = "call-get-line-positions-by-id", fallbackMethod = "getLinePositionsByIdFallback")
  public Optional<List<PositionExternal>> getLinePositionsById(UUID id) {
    log.info("Post to generate line positions for id: {}", id);
    positionsCalculatorRestClient
        .post()
        .uri("/v1/api/calculateLinePositions/{id}", id)
        .retrieve()
        .onStatus(
            HttpStatusCode::is5xxServerError,
            (request, response) -> {
              log.info("Request to: " + request.getURI().toString());
              log.error(
                  "Error on generating line positions. Status:  "
                      + response.getStatusCode().toString());
            })
        .toBodilessEntity();
    log.info("Finished line positions generation for id: {}", id);

    log.info("Fetching line positions for id: {}", id);
    List<PositionExternal> positions =
        positionsCalculatorRestClient
            .get()
            .uri("/v1/api/getAllPositionsById/{id}", id)
            .retrieve()
            .onStatus(
                HttpStatusCode::is5xxServerError,
                (request, response) -> {
                  log.info("Request to: " + request.getURI().toString());
                  log.error(
                      "Error on fetching line positions. Status:  "
                          + response.getStatusCode().toString());
                })
            .body(new ParameterizedTypeReference<List<PositionExternal>>() {});

    log.info("Finished Fetching line positions for id: {}", id);

    return Optional.ofNullable(positions);
  }

  @CircuitBreaker(name = "call-get-goalkeeper-positions-by-id")
  @Retry(
      name = "call-get-goalkeeper-positions-by-id",
      fallbackMethod = "getGoalkeeperPositionsByIdFallback")
  public Optional<List<PositionExternal>> getGoalkeeperPositionsById(UUID id) {
    log.info("Post to generate goalkeeper positions for id: {}", id);
    positionsCalculatorRestClient
        .post()
        .uri("/v1/api/calculateGoalkeeperPositions/{id}", id)
        .retrieve()
        .onStatus(
            HttpStatusCode::is5xxServerError,
            (request, response) -> {
              log.info("Request to: " + request.getURI().toString());
              log.error(
                  "Error on generating goalkeeper positions. Status:  "
                      + response.getStatusCode().toString());
            })
        .toBodilessEntity();

    log.info("Finished goalkeeper positions generations for id: {}", id);

    log.info("Fetching goalkeeper positions for id: {}", id);
    List<PositionExternal> positions =
        positionsCalculatorRestClient
            .get()
            .uri("/v1/api/getAllPositionsById/{id}", id)
            .retrieve()
            .onStatus(
                HttpStatusCode::is5xxServerError,
                (request, response) -> {
                  log.info("Request to: " + request.getURI().toString());
                  log.error(
                      "Error on fetching goalkeeper positions. Status:  "
                          + response.getStatusCode().toString());
                })
            .body(new ParameterizedTypeReference<List<PositionExternal>>() {});
    log.info("Finished fetching goalkeeper positions for id: {}", id);
    return Optional.ofNullable(positions);
  }

  Optional<GoalkeeperPlayerExternal> getLinePositionsByIdFallback(UUID id, Throwable t) {
    log.info(
        "positions-manager-service get line positions by id fallback: id:{}, Error: {} ",
        id,
        t.getMessage());
    return Optional.empty();
  }

  Optional<GoalkeeperPlayerExternal> getGoalkeeperPositionsByIdFallback(UUID id, Throwable t) {
    log.info(
        "positions-manager-service get goalkeeper positions by id fallback: id:{}, Error: {} ",
        id,
        t.getMessage());
    return Optional.empty();
  }
}
