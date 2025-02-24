package br.com.dgc.fmtools.squad_manager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SquadManagerExceptionHandler {

  @ExceptionHandler({PlayerNotFoundException.class})
  public ResponseEntity<?> playerNotFoundExceptionHandler(PlayerNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(ex.getMessage());
  }
}
