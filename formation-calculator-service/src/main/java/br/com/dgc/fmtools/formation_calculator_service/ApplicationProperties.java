package br.com.dgc.fmtools.formation_calculator_service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "formation-calculator")
public record ApplicationProperties(
    String squadManagerServiceUrl, String positionsCalculatorServiceUrl) {}
