package com.jipasoft.lands.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jipasoft.lands.controller"})
public class SpringConfig {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfig.class, args);
	}
}
