package com.medicare.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		/*new SpringApplication(GatewayApplication.class)
				.web(WebApplicationType.REACTIVE)
				.run(args);*/
		SpringApplication.run(GatewayApplication.class, args);
	}

}