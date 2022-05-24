package com.vijay.componentprocessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.componentprocessing.entity.ProcessRequest;
import com.vijay.componentprocessing.entity.ProcessResponse;
import com.vijay.componentprocessing.service.ComponentProcessingService;

@RestController
public class ComponentProcessingController {

	@Autowired
	private ComponentProcessingService componentProcessingService;


	@PostMapping(value = "/processDetail")
	public ProcessResponse processRequest(@RequestBody ProcessRequest processRequest) {
		return componentProcessingService.processRequest(processRequest);
	}
}
