package com.stackcodie.ThirdPartyAPIIntegrationInSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ThirdPartyApiIntegrationInSpringBootApplication {

	@Bean
	public RestTemplate restTempalte() {
		return new  RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(ThirdPartyApiIntegrationInSpringBootApplication.class, args);
	}
}
