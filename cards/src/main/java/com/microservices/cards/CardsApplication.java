package com.microservices.cards;

import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Bank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Kolotov Maxim",
						email = "study.kolotushka@yandex.ru"
				),
				license = @License(
						name = "Apache 2.0"
				)
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
