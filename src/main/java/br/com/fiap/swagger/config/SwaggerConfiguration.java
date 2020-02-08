package br.com.fiap.swagger.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
	
	public Docket usuario() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.fiap.swagger")).paths(PathSelectors.ant("/**"))
				.build().globalOperationParameters(
						Arrays.asList(new ParameterBuilder().description("API de verejo").build()));

	}

}
