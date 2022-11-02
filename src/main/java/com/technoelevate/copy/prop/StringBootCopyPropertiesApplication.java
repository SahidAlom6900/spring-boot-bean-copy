package com.technoelevate.copy.prop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@SpringBootApplication
public class StringBootCopyPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringBootCopyPropertiesApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper().
	            registerModule(new JavaTimeModule());
	}
	
//	@Bean
//	public Jackson2ObjectMapperBuilder objectMapperBuilder() {
//	    Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
//	    builder.modules(new JavaTimeModule());
//
//	    return builder;
//	}
}
