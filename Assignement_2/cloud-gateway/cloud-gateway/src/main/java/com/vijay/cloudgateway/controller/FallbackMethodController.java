package com.vijay.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

	@GetMapping("/processPensionServiceFallBack")
	public String userServiceFallBackMethod() {
		return "Process pension service is taking longer than expected. Please try later";
	}

	
	@GetMapping("/pensionerDetailServiceFallBack")
	public String pensionerDetailServiceFallBackMethod() {
		return "Pensioner detail service is taking longer than expected. Please try later";
	}

}
