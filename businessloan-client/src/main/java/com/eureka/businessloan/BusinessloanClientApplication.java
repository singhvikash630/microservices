package com.eureka.businessloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusinessloanClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessloanClientApplication.class, args);
	}

}
