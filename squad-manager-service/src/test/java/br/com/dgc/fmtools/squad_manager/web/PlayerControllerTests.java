package br.com.dgc.fmtools.squad_manager.web;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import br.com.dgc.fmtools.squad_manager.AbstractIntegrationTest;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetGoalkeeperPlayerByIdResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.GetLinePlayerByIdResponse;
import br.com.dgc.fmtools.squad_manager.web.dto.response.PlayerCreatedResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.UUID;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class PlayerControllerTests extends AbstractIntegrationTest {

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
            .statusCode(201)
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
            .statusCode(201)
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
        .statusCode(400);
  }

  @Test
  public void givenInvalidGoalkeeperPlayer_whenPost_shouldReturnBadRequest() {
    RestAssured.given()
        .body(this.createInvalidGoalkeeperPlayerRequest())
        .contentType(ContentType.JSON)
        .when()
        .post(basePath + "goalkeeperPlayer")
        .then()
        .statusCode(400);
  }

  @Test
  @Order(2)
  public void givenExistentId_whenGet_shouldReturnOkAndLinePlayerData() {
    GetLinePlayerByIdResponse getLinePlayerByIdResponse =
        RestAssured.given()
            .when()
            .get(basePath + "linePlayer/" + PlayerControllerTests.validLinePlayerId.toString())
            .then()
            .statusCode(200)
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
            .statusCode(200)
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
        .statusCode(404);
  }

  @Test
  public void givenNonExistentId_whenGet_shouldReturnNotFoundForGoalkeeperPlayer() {
    RestAssured.given()
        .when()
        .get(basePath + "goalkeeperPlayer/" + UUID.randomUUID().toString())
        .then()
        .statusCode(404);
  }
}
