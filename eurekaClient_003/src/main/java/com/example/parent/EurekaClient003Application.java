package com.example.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient003Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient003Application.class, args);
	}

}
