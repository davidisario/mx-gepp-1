package com.mx.gepp.micro1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		
	return new OpenAPI().info(new Info()
						.title("GEPP API")
						.version("1.0")
						.license(new License().name("(C) Copyright Gepp"))
						.description("List of all endpoints used in API"));

	}

}
