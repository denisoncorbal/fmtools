package br.com.dgc.fmtools.positions_calculator_service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "positions-calculator")
public record ApplicationProperties(String squadManagerServiceUrl) {}
