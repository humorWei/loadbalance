package com.example.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.netflix.discovery.shared.Application;

//这里核心就是在启动类上添加@EnableEurekaServer，声明这是一个Eureka服务器。
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer001Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer001Application.class, args);
		// new SpringApplicationBuilder(Application.class).web().run(args);
	}
}
