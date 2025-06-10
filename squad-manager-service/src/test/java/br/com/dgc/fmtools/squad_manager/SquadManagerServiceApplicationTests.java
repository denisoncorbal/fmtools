package br.com.dgc.fmtools.squad_manager;

import io.opentelemetry.exporter.zipkin.ZipkinSpanExporter;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@TestPropertySource(properties = {"server.ssl.enabled=false", "management.tracing.enabled=false"})
class SquadManagerServiceApplicationTests extends AbstractIntegrationTest {

  @MockitoBean private ZipkinSpanExporter zipkinSpanExporter;

  @Test
  void contextLoads() {}
}
