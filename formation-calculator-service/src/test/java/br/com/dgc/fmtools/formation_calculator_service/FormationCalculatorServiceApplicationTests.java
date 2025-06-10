package br.com.dgc.fmtools.formation_calculator_service;

import io.opentelemetry.exporter.zipkin.ZipkinSpanExporter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@TestPropertySource(properties = {"server.ssl.enabled=false", "management.tracing.enabled=false"})
class FormationCalculatorServiceApplicationTests {

  @MockitoBean private ZipkinSpanExporter zipkinSpanExporter;

  @Test
  void contextLoads() {}
}
