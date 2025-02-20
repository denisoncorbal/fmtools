package br.com.dgc.fmtools.positions_calculator_service;

import org.springframework.boot.SpringApplication;

public class TestPositionsCalculatorServiceApplication {

  public static void main(String[] args) {
    SpringApplication.from(PositionsCalculatorServiceApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
