package br.com.dgc.fmtools.formation_calculator_service;

import org.springframework.boot.SpringApplication;

public class TestFormationCalculatorServiceApplication {

  public static void main(String[] args) {
    SpringApplication.from(FormationCalculatorServiceApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
