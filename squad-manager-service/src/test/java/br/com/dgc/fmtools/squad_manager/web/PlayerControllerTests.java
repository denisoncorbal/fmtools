package br.com.dgc.fmtools.squad_manager.web;

import br.com.dgc.fmtools.squad_manager.AbstractIntegrationTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class PlayerControllerTests extends AbstractIntegrationTest {

  @Test
  public void givenValidLinePlayer_whenPost_shouldReturnCreated() {
    RestAssured.given()
        .body(this.createValidLinePlayerRequest())
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
        .body(this.createValidGoalkeeperPlayerRequest())
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
    RestAssured.given()
        .body(this.createInvalidLinePlayerRequest())
        .contentType(ContentType.JSON)
        .when()
        .post("/v1/api/linePlayer")
        .then()
        .statusCode(400);
  }

  @Test
  public void givenInvalidGoalkeeperPlayer_whenPost_shouldReturnBadRequest() {
    RestAssured.given()
        .body(this.createInvalidGoalkeeperPlayerRequest())
        .contentType(ContentType.JSON)
        .when()
        .post("/v1/api/goalkeeperPlayer")
        .then()
        .statusCode(400);
  }
}
