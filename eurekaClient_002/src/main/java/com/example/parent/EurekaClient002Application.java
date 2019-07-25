package com.example.parent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.parent.controller.HelloService;
import com.example.parent.loadbalancer.RibbonConfiguration;

//说明这是一个Eureka客户端，同时也可以获取到Eureka服务器中所注册的服务列表;
@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name="consumer-hello",configuration=RibbonConfiguration.class)
public class EurekaClient002Application implements CommandLineRunner {
	private final HelloService helloService;

	public EurekaClient002Application(HelloService helloService) {
        this.helloService = helloService;
    }

	@Bean
	// 该注解就是能够让RestTemplate启用客户端负载均衡。
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (args.length != 0) {
            System.out.println(helloService.sayHello(args[0]));
        } else {
            System.out.println(helloService.sayHello("nobody"));
        }
	}
}
