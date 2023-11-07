package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.sip.ams.entities.Provider;
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
		//Provider p = new Provider(1L,"HP","USA");
		//System.out.println(p.toString());
		//Provider p  =  new Provider();
		
	}

}
