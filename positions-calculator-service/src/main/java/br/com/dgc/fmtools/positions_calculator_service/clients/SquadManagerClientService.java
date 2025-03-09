package br.com.dgc.fmtools.positions_calculator_service.clients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class SquadManagerClientService {
  private static final Logger log = LoggerFactory.getLogger(SquadManagerClientService.class);

  private final RestClient restClient;

  SquadManagerClientService(RestClient restClient) {
    this.restClient = restClient;
  }

  @CircuitBreaker(name = "call-get-goalkeeper-player-by-id")
  @Retry(
      name = "call-get-goalkeeper-player-by-id",
      fallbackMethod = "getGoalkeeperPlayerByIdFallback")
  public Optional<GoalkeeperPlayerExternal> getGoalkeeperPlayerById(UUID id) {
    log.info("Fetching goalkeeper player for id: {}", id);
    GoalkeeperPlayerExternal player =
        restClient
            .get()
            .uri("/v1/api/goalkeeperPlayer/{id}", id)
            .retrieve()
            .onStatus(
                HttpStatusCode::is4xxClientError,
                (request, response) -> {
                  log.info("Request to: " + request.getURI().toString());
                  log.error(
                      "Error on fetching goalkeeper player data. Status:  "
                          + response.getStatusCode().toString());
                })
            .body(GoalkeeperPlayerExternal.class);

    return Optional.ofNullable(player);
  }

  @CircuitBreaker(name = "call-get-line-player-by-id")
  @Retry(name = "call-get-line-player-by-id", fallbackMethod = "getLinePlayerByIdFallback")
  public Optional<LinePlayerExternal> getLinePlayerById(UUID id) {
    log.info("Fetching line player for id: {}", id);
    LinePlayerExternal player =
        restClient
            .get()
            .uri("/v1/api/linePlayer/{id}", id)
            .retrieve()
            .body(LinePlayerExternal.class);
    return Optional.ofNullable(player);
  }

  Optional<GoalkeeperPlayerExternal> getGoalkeeperPlayerByIdFallback(UUID id, Throwable t) {
    log.info(
        "squad-manager-service get goalkeeper player by id fallback: id:{}, Error: {} ",
        id,
        t.getMessage());
    return Optional.empty();
  }

  Optional<LinePlayerExternal> getLinePlayerByIdFallback(UUID id, Throwable t) {
    log.info(
        "squad-manager-service get line player by id fallback: id:{}, Error: {} ",
        id,
        t.getMessage());
    return Optional.empty();
  }
}
