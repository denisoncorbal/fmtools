package br.com.dgc.fmtools.formation_calculator_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class FormationCalculatorServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(FormationCalculatorServiceApplication.class, args);
  }
}
