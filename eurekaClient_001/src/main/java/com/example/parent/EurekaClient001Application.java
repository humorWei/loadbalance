package com.example.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
  * 这里与service-discovery的唯一区别就是启动类上注解变成了@EnableDiscoveryClient，
  * 声明这是一个Eureka Client
*/
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient001Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient001Application.class, args);
	}

}
