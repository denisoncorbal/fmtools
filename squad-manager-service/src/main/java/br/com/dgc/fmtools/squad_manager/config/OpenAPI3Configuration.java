package br.com.dgc.fmtools.squad_manager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPI3Configuration {
  @Bean
  OpenAPI openApi() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Squad Manager Service APIs")
                .description("BookStore Catalog Service APIs")
                .version("v1.0.0")
                .contact(
                    new Contact().name("Denison G. Corbal").email("denison.corbal@gmail.com")));
  }
}
