package br.com.dgc.fmtools.positions_calculator_service.config;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import org.springframework.boot.actuate.autoconfigure.tracing.zipkin.ZipkinConnectionDetails;
import org.springframework.http.HttpStatusCode;
import zipkin2.reporter.BytesMessageSender;
import zipkin2.reporter.ClosedSenderException;
import zipkin2.reporter.Encoding;

final class ZipkinHttpClientBuilderCustomizerImpl extends BytesMessageSender.Base {
  volatile boolean closeCalled;

  private HttpClient httpClient;

  private ZipkinConnectionDetails zipkinConnectionDetails;

  ZipkinHttpClientBuilderCustomizerImpl(
      HttpClient httpClient, ZipkinConnectionDetails zipkinConnectionDetails) {
    super(Encoding.JSON);
    this.httpClient = httpClient;
    this.zipkinConnectionDetails = zipkinConnectionDetails;
  }

  @Override
  public int messageMaxBytes() {
    return 500_000;
  }

  @Override
  public void send(List<byte[]> encodedSpans) throws IOException {
    if (closeCalled) throw new ClosedSenderException();
    byte[] body = this.encoding.encode(encodedSpans);
    HttpRequest request =
        HttpRequest.newBuilder()
            .uri(URI.create(zipkinConnectionDetails.getSpanEndpoint()))
            .POST(BodyPublishers.ofByteArray(body))
            .build();
    HttpResponse<String> response;
    try {
      response = httpClient.send(request, BodyHandlers.ofString());
      if (!HttpStatusCode.valueOf(response.statusCode()).is2xxSuccessful()) {
        if (response.body().isEmpty()) {
          throw new IOException("response failed: " + response);
        }
        throw new IOException("response failed: " + response.body());
      }

    } catch (InterruptedException e) {
      throw new IOException("response failed: " + e.getLocalizedMessage());
    }
  }

  @Override
  public void close() throws IOException {
    closeCalled = true;
  }
}
