package br.com.dgc.fmtools.squad_manager.web;

import br.com.dgc.fmtools.squad_manager.AbstractIntegrationTest;
import br.com.dgc.fmtools.squad_manager.web.dto.request.GoalkeeperPlayerRequest;
import br.com.dgc.fmtools.squad_manager.web.dto.request.LinePlayerRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class PlayerControllerTests extends AbstractIntegrationTest {

  private LinePlayerRequest createValidLinePlayerRequest() {
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

  private GoalkeeperPlayerRequest createValidGoalkeeperPlayerRequest() {
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

  @Test
  public void givenValidLinePlayer_whenPost_shouldReturnCreated() {
    RestAssured.given()
        .body(createValidLinePlayerRequest())
        .contentType(ContentType.JSON)
        .when()
        .post("/v1/api/linePlayer")
        .then()
        .statusCode(201)
        .assertThat()
        .extract()
        .body()
        .as(Map.class)
        .containsKey("id");
  }

  @Test
  public void givenValidGoalkeeperPlayer_whenPost_shouldReturnCreated() {
    RestAssured.given()
        .body(createValidGoalkeeperPlayerRequest())
        .contentType(ContentType.JSON)
        .when()
        .post("/v1/api/goalkeeperPlayer")
        .then()
        .statusCode(201)
        .assertThat()
        .extract()
        .body()
        .as(Map.class)
        .containsKey("id");
  }

  @Test
  public void givenInvalidLinePlayer_whenPost_shouldReturnBadRequest() {
    LinePlayerRequest linePlayerRequest = createValidLinePlayerRequest();
    linePlayerRequest.setAcceleration(0);
    RestAssured.given()
        .body(linePlayerRequest)
        .contentType(ContentType.JSON)
        .when()
        .post("/v1/api/linePlayer")
        .then()
        .statusCode(400);
  }

  @Test
  public void givenInvalidGoalkeeperPlayer_whenPost_shouldReturnBadRequest() {
    GoalkeeperPlayerRequest goalkeeperPlayerRequest = createValidGoalkeeperPlayerRequest();
    goalkeeperPlayerRequest.setAcceleration(0);
    RestAssured.given()
        .body(goalkeeperPlayerRequest)
        .contentType(ContentType.JSON)
        .when()
        .post("/v1/api/goalkeeperPlayer")
        .then()
        .statusCode(400);
  }
}
