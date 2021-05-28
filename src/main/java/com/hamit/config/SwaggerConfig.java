package com.hamit.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	// localhost:9292/swagger-ui.html
	// http://localhost:9292/explorer/index.html#uri=/
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("for Spring Boot Swagger 2 Hamit Mızrak").description("for Spring boot Swagger 2 in Malatya")
				.termsOfServiceUrl("http://www.hamitmizrak.com.tr").license("http://www.hamitmizrak.com.tr").licenseUrl("http://www.hamitmizrak.com.tr")
				.version("1.44").build();
	}
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.hamit")).build().pathMapping("/")
				.useDefaultResponseMessages(false).directModelSubstitute(LocalDate.class, String.class)
				.genericModelSubstitutes(ResponseEntity.class);
	}
	
	
	
	
}
