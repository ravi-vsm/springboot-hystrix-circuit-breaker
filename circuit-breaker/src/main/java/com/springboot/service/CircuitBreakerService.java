package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CircuitBreakerService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "callBackUpCircuitBreaker")
	public String getCircuitBreakerDetails() {
		// TODO Auto-generated method stub
		// return
		// restTemplate.getForObject("http://localhost:9000/client-app?client-id={client-Id}",
		// String.class, "client call");
		return restTemplate.getForObject("http://localhost:9000", String.class);
	}

	public String callBackUpCircuitBreaker() {

		return "Returning response from the FallBack Method!";
	}

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}
}
