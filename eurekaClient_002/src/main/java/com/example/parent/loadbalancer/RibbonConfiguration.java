package com.example.parent.loadbalancer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RibbonConfiguration {
	
	@Bean
	public IRule ribbonRule() {
		//随机负载
		return new RandomRule();
		//return new RoundRobinRule();
	}
}
