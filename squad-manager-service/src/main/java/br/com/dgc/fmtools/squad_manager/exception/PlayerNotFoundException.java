package br.com.dgc.fmtools.squad_manager.exception;

import java.util.UUID;

public class PlayerNotFoundException extends Exception {
  public PlayerNotFoundException(UUID id) {
    super("Player not found with id: " + id.toString());
  }
}
