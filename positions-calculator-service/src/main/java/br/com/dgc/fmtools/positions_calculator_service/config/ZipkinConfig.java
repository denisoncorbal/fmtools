package br.com.dgc.fmtools.positions_calculator_service.config;

import io.opentelemetry.exporter.zipkin.ZipkinSpanExporter;
import io.opentelemetry.exporter.zipkin.ZipkinSpanExporterBuilder;
import java.net.http.HttpClient;
import org.springframework.boot.actuate.autoconfigure.tracing.zipkin.ZipkinConnectionDetails;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZipkinConfig {

  private SslBundles sslBundles;

  private ZipkinConnectionDetails zipkinConnectionDetails;

  public ZipkinConfig(SslBundles sslBundles, ZipkinConnectionDetails zipkinConnectionDetails) {
    this.sslBundles = sslBundles;
    this.zipkinConnectionDetails = zipkinConnectionDetails;
  }

  @Bean
  public ZipkinSpanExporter zipkinSpanExporter() {
    ZipkinSpanExporterBuilder zipkinSpanExporterBuilder = new ZipkinSpanExporterBuilder();
    return zipkinSpanExporterBuilder
        .setSender(
            new ZipkinHttpClientBuilderCustomizerImpl(
                HttpClient.newBuilder()
                    .sslContext(sslBundles.getBundle("client").createSslContext())
                    .build(),
                zipkinConnectionDetails))
        .build();
  }
}
