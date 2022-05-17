package com.sample.processpension.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.processpension.model.ProcessPensionRequest;
import com.sample.processpension.model.ProcessPensionResponse;
import com.sample.processpension.service.ProcessPensionService;

@RestController
@RequestMapping("/processpension")
public class ProcessPensionContoller {
	
	@Autowired
	private ProcessPensionService processPensionService;

	@PostMapping
	public ProcessPensionResponse processPension(@RequestBody ProcessPensionRequest processPensionRequest) {

		return processPensionService.processPension(processPensionRequest);
		
	}
}
