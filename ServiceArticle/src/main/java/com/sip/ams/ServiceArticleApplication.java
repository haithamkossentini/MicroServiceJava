package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceArticleApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getProviderFromMicroServiceProvider()
	{
	return new RestTemplate();
	}

}
