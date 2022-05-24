package com.vijay.componentprocessing.service;

import org.springframework.stereotype.Component;

import com.vijay.componentprocessing.entity.ProcessResponse;
@Component
public interface ComponentProcessing {
	
	ProcessResponse processIntegralAndAccessoryWorkflow(ProcessResponse processResponse);
	

}
