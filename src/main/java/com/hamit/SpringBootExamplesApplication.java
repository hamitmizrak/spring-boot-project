package com.hamit;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@SpringBootApplication
// @EnableSwagger2
public class SpringBootExamplesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExamplesApplication.class, args);
	}
	
	//model mapper
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	//Jackson=json uretme,json parcalama
	@Bean
	public Jackson2RepositoryPopulatorFactoryBean jackson2RepositoryPopulatorFactoryBean() {
		
		// package org.springframework.core.io;
		
		Resource json1 = (Resource) new ClassPathResource("manuel_writer.json");
		Resource json2 = (Resource) new ClassPathResource("writer.json");
		
		Jackson2RepositoryPopulatorFactoryBean factoryBean = new Jackson2RepositoryPopulatorFactoryBean();
		factoryBean.setResources(new Resource[] { json1, json2 });
		return factoryBean;
	}
	
}
