package br.com.dgc.fmtools.positions_calculator_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class PositionsCalculatorServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(PositionsCalculatorServiceApplication.class, args);
  }
}
