package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.CircuitBreakerService;

@RestController
public class CircuitBreakerController {

	@Autowired
	private CircuitBreakerService circuitBreakerService;

	@RequestMapping(value = "/circuit-breaker", method = RequestMethod.GET)
	public String getDetailsFromCircuitBreakerMethod() {
		return circuitBreakerService.getCircuitBreakerDetails();
	}

}
