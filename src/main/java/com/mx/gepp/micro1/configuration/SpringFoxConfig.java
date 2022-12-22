package com.mx.gepp.micro1.configuration;

/** David Garcia Isario
 * Esta clase establece la configuracion de Swagger
 * El basepackage es de donde va a buscar las clases a mostrar
 * 
 * 
 */

import org.springframework.context.annotation.Bean;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


public class SpringFoxConfig {
	
	/**
	 * 
	 * Buscara en todas las clases que esten annotadas como Api
	 * Buscara en cada clase los metodos marcados @RequestMapping
	 * 
	 */
	@Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build().pathMapping("/")
                .apiInfo(apiInfo()).useDefaultResponseMessages(false);
    }
	
	 @Bean
	   ApiInfo apiInfo() {
	       final ApiInfoBuilder builder = new ApiInfoBuilder();
	       builder.title("GEPP API").version("1.0").license("(C) Copyright GEPP")
	               .description("List of all endpoints used in API");
	       return builder.build();
	   }
}
