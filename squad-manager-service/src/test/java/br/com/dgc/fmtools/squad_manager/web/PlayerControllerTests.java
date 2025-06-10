package br.com.dgc.fmtools.squad_manager.web;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import br.com.dgc.fmtools.squad_manager.AbstractIntegrationTest;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetGoalkeeperPlayerByIdResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetLinePlayerByIdResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.PlayerCreatedResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.PlayerUpdatedResponse;
import io.opentelemetry.exporter.zipkin.ZipkinSpanExporter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.UUID;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@TestMethodOrder(OrderAnnotation.class)
@TestPropertySource(properties = {"server.ssl.enabled=false", "management.tracing.enabled=false"})
public class PlayerControllerTests extends AbstractIntegrationTest {

  @MockitoBean private ZipkinSpanExporter zipkinSpanExporter;
  private static UUID validLinePlayerId = null;
  private static UUID validGoalkeeperPlayerId = null;
  private String basePath = "/v1/api/";

  @Test
  @Order(1)
  public void givenValidLinePlayer_whenPost_shouldReturnCreated() {
    PlayerCreatedResponse playerCreatedResponse =
        RestAssured.given()
            .body(this.createValidLinePlayerRequest())
            .contentType(ContentType.JSON)
            .when()
            .post(basePath + "linePlayer")
            .then()
            .statusCode(HttpStatus.CREATED.value())
            .assertThat()
            .extract()
            .body()
            .as(PlayerCreatedResponse.class);

    assertTrue(playerCreatedResponse.id() != null);

    PlayerControllerTests.validLinePlayerId = playerCreatedResponse.id();
  }

  @Test
  @Order(3)
  public void givenValidGoalkeeperPlayer_whenPost_shouldReturnCreated() {
    PlayerCreatedResponse playerCreatedResponse =
        RestAssured.given()
            .body(this.createValidGoalkeeperPlayerRequest())
            .contentType(ContentType.JSON)
            .when()
            .post(basePath + "goalkeeperPlayer")
            .then()
            .statusCode(HttpStatus.CREATED.value())
            .assertThat()
            .extract()
            .body()
            .as(PlayerCreatedResponse.class);

    assertTrue(playerCreatedResponse.id() != null);

    PlayerControllerTests.validGoalkeeperPlayerId = playerCreatedResponse.id();
  }

  @Test
  public void givenInvalidLinePlayer_whenPost_shouldReturnBadRequest() {
    RestAssured.given()
        .body(this.createInvalidLinePlayerRequest())
        .contentType(ContentType.JSON)
        .when()
        .post(basePath + "linePlayer")
        .then()
        .statusCode(HttpStatus.BAD_REQUEST.value());
  }

  @Test
  public void givenInvalidGoalkeeperPlayer_whenPost_shouldReturnBadRequest() {
    RestAssured.given()
        .body(this.createInvalidGoalkeeperPlayerRequest())
        .contentType(ContentType.JSON)
        .when()
        .post(basePath + "goalkeeperPlayer")
        .then()
        .statusCode(HttpStatus.BAD_REQUEST.value());
  }

  @Test
  @Order(2)
  public void givenExistentId_whenGet_shouldReturnOkAndLinePlayerData() {
    GetLinePlayerByIdResponse getLinePlayerByIdResponse =
        RestAssured.given()
            .when()
            .get(basePath + "linePlayer/" + PlayerControllerTests.validLinePlayerId.toString())
            .then()
            .statusCode(HttpStatus.OK.value())
            .and()
            .extract()
            .as(GetLinePlayerByIdResponse.class);

    assertFalse(getLinePlayerByIdResponse.name().isBlank());
  }

  @Test
  @Order(4)
  public void givenExistentId_whenGet_shouldReturnOkAndGoalkeeperPlayerData() {
    GetGoalkeeperPlayerByIdResponse getGoalkeeperPlayerByIdResponse =
        RestAssured.given()
            .when()
            .get(
                basePath
                    + "goalkeeperPlayer/"
                    + PlayerControllerTests.validGoalkeeperPlayerId.toString())
            .then()
            .statusCode(HttpStatus.OK.value())
            .and()
            .extract()
            .as(GetGoalkeeperPlayerByIdResponse.class);

    assertFalse(getGoalkeeperPlayerByIdResponse.name().isBlank());
  }

  @Test
  public void givenNonExistentId_whenGet_shouldReturnNotFoundForLinePlayer() {
    RestAssured.given()
        .when()
        .get(basePath + "linePlayer/" + UUID.randomUUID().toString())
        .then()
        .statusCode(HttpStatus.NOT_FOUND.value());
  }

  @Test
  public void givenNonExistentId_whenGet_shouldReturnNotFoundForGoalkeeperPlayer() {
    RestAssured.given()
        .when()
        .get(basePath + "goalkeeperPlayer/" + UUID.randomUUID().toString())
        .then()
        .statusCode(HttpStatus.NOT_FOUND.value());
  }

  @Test
  @Order(5)
  public void givenExistentId_whenPut_shouldReturnOkAndLinePlayerId() {
    PlayerUpdatedResponse playerUpdatedResponse =
        RestAssured.given()
            .body(this.createValidLinePlayerRequest())
            .contentType(ContentType.JSON)
            .when()
            .put(basePath + "linePlayer/" + PlayerControllerTests.validLinePlayerId.toString())
            .then()
            .statusCode(HttpStatus.OK.value())
            .and()
            .extract()
            .as(PlayerUpdatedResponse.class);

    assertFalse(playerUpdatedResponse.id().toString().isBlank());
  }

  @Test
  @Order(6)
  public void givenExistentId_whenPut_shouldReturnOkAndGoalkeeperId() {
    PlayerUpdatedResponse playerUpdatedResponse =
        RestAssured.given()
            .when()
            .body(this.createValidGoalkeeperPlayerRequest())
            .contentType(ContentType.JSON)
            .put(
                basePath
                    + "goalkeeperPlayer/"
                    + PlayerControllerTests.validGoalkeeperPlayerId.toString())
            .then()
            .statusCode(HttpStatus.OK.value())
            .and()
            .extract()
            .as(PlayerUpdatedResponse.class);

    assertFalse(playerUpdatedResponse.id().toString().isBlank());
  }

  @Test
  public void givenNonExistentId_whenPut_shouldReturnNotFoundForLinePlayer() {
    RestAssured.given()
        .when()
        .body(this.createValidLinePlayerRequest())
        .contentType(ContentType.JSON)
        .put(basePath + "linePlayer/" + UUID.randomUUID().toString())
        .then()
        .statusCode(HttpStatus.NOT_FOUND.value());
  }

  @Test
  public void givenNonExistentId_whenPut_shouldReturnNotFoundForGoalkeeperPlayer() {
    RestAssured.given()
        .when()
        .body(this.createValidGoalkeeperPlayerRequest())
        .contentType(ContentType.JSON)
        .put(basePath + "goalkeeperPlayer/" + UUID.randomUUID().toString())
        .then()
        .statusCode(HttpStatus.NOT_FOUND.value());
  }

  @Test
  @Order(7)
  public void givenExistentId_whenDelete_shouldReturnNoContentForLinePlayer() {
    RestAssured.given()
        .when()
        .delete(basePath + "linePlayer/" + PlayerControllerTests.validLinePlayerId)
        .then()
        .statusCode(HttpStatus.NO_CONTENT.value());
  }

  @Test
  @Order(8)
  public void givenExistentId_whenDelete_shouldReturnNoContentForGoalkeeperPlayer() {
    RestAssured.given()
        .when()
        .delete(basePath + "goalkeeperPlayer/" + PlayerControllerTests.validGoalkeeperPlayerId)
        .then()
        .statusCode(HttpStatus.NO_CONTENT.value());
  }

  @Test
  public void givenNonExistentId_whenDelete_shouldReturnNoContentForLinePlayer() {
    RestAssured.given()
        .when()
        .delete(basePath + "linePlayer/" + UUID.randomUUID())
        .then()
        .statusCode(HttpStatus.NO_CONTENT.value());
  }

  @Test
  public void givenNonExistentId_whenDelete_shouldReturnNoContentForGoalkeeperPlayer() {
    RestAssured.given()
        .when()
        .delete(basePath + "goalkeeperPlayer/" + UUID.randomUUID())
        .then()
        .statusCode(HttpStatus.NO_CONTENT.value());
  }

  @Test
  public void whenGet_shouldReturnOkOnLinePlayer() {
    RestAssured.given()
        .when()
        .get(basePath + "linePlayer")
        .then()
        .statusCode(HttpStatus.OK.value());
  }

  @Test
  public void whenGet_shouldReturnOkOnGoalkeeperPlayer() {
    RestAssured.given()
        .when()
        .get(basePath + "goalkeeperPlayer")
        .then()
        .statusCode(HttpStatus.OK.value());
  }
}
