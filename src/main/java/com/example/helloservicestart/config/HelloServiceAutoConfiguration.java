package com.example.helloservicestart.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.helloservicestart.service.HelloService;
import com.example.helloservicestart.service.HelloServiceImp;

@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {
	
	@Bean
	@ConditionalOnMissingBean
	public HelloService helloService() {
		return new HelloServiceImp();
	}

}
