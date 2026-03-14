package com.mounstros_de_la_computacion.sistemaTI.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI soporteApiConfig() {
        return new OpenAPI()
            .info(new Info()
                .title("SGSTI")
                .description("Un sistema de gestión de solicitudes TI")
                .version("1.0")
                .contact(new Contact()
                    .name("Grupo 07")
                    .email("grupo07@correo.com")
                    .url("http://mounstros_de_la_computacion.com/sistemaTI")
                )
                .license(new License()
                    .name("Proyecto de Los Mounstros de la Computación")
                    .url("http://mounstros_de_la_computacion.com/sistemaTI")
                ));
    }
}