package br.com.dgc.fmtools.squad_manager;

import br.com.dgc.fmtools.squad_manager.web.dto.request.GoalkeeperPlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.request.LinePlayerRequest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
public abstract class AbstractIntegrationTest {
  @LocalServerPort int port;

  @BeforeEach
  void setUp() {
    RestAssured.port = this.port;
  }

  protected LinePlayerRequest createValidLinePlayerRequest() {
    return new LinePlayerRequest(
        "Test",
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1));
  }

  protected LinePlayerRequest createInvalidLinePlayerRequest() {
    return new LinePlayerRequest(
        "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0);
  }

  protected GoalkeeperPlayerRequest createValidGoalkeeperPlayerRequest() {
    return new GoalkeeperPlayerRequest(
        "Test",
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1),
        (int) (Math.random() * 20 + 1));
  }

  protected GoalkeeperPlayerRequest createInvalidGoalkeeperPlayerRequest() {
    return new GoalkeeperPlayerRequest(
        "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0);
  }
}
