package com.eureka.carloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarloanClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarloanClientApplication.class, args);
	}

}
