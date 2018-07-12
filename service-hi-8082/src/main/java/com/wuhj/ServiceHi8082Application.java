package com.wuhj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHi8082Application {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(ServiceHi8082Application.class, args);
	}

	@GetMapping("/hi")
	public String sayHi(@RequestParam String name) {
		System.out.println("api-a 调用的");
		return "i am " + name + " port " + port;
	}
}
