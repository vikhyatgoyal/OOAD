package com.cub.foodbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.cub.foodbuddy.repository")
@SpringBootApplication
@ComponentScan("com.cub.foodbuddy.*")
@EnableAutoConfiguration
public class SpringBootFoodbuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFoodbuddyApplication.class, args);
	}
}
