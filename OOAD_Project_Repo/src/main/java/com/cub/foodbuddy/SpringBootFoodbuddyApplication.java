package com.cub.foodbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.cub.foodbuddy.repository")
@SpringBootApplication
public class SpringBootFoodbuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFoodbuddyApplication.class, args);
	}
}
