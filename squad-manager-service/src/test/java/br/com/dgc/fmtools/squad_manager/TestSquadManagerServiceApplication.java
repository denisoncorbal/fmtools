package br.com.dgc.fmtools.squad_manager;

import org.springframework.boot.SpringApplication;

public class TestSquadManagerServiceApplication {

  public static void main(String[] args) {
    SpringApplication.from(SquadManagerServiceApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
