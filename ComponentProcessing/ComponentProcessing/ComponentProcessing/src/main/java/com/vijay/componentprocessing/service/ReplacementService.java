package com.vijay.componentprocessing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.componentprocessing.entity.ProcessResponse;
import com.vijay.componentprocessing.repo.ComponentProcessingRepository;

@Service
public class ReplacementService implements ComponentProcessing {

	@Autowired
	private ComponentProcessingRepository componentProcessingRepository;

	@Override
	public ProcessResponse processIntegralAndAccessoryWorkflow(ProcessResponse processResponse) {
		return componentProcessingRepository.save(processResponse);

	}

}
