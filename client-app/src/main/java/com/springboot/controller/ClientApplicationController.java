package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client-app")
public class ClientApplicationController {

	@GetMapping
	public String returnResponseForGet(@RequestParam("client-id") String client) {
		return "Hello - " + client;
	}
}
