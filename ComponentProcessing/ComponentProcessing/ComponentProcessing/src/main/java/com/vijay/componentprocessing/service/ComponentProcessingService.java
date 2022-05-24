package com.vijay.componentprocessing.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vijay.componentprocessing.entity.ItemType;
import com.vijay.componentprocessing.entity.ProcessRequest;
import com.vijay.componentprocessing.entity.ProcessResponse;
import com.vijay.componentprocessing.entity.ProductDetails;

@Service
public class ComponentProcessingService {

	@Autowired
	private RepairService repairService;

	@Autowired
	private ReplacementService replacementService;

	@Autowired
	RestTemplate restTemplate;

	public ProcessResponse processRequest(ProcessRequest processRequest) {
		ProcessResponse response = new ProcessResponse();
		ProductDetails pd = new ProductDetails();
		pd.setCount(processRequest.getQuantity());
		pd.setComponentType(
				processRequest.getDefective_component_type().equalsIgnoreCase("Integral") ? ItemType.INTEGRAL
						: ItemType.ACCESSORY);
		ResponseEntity<Double> pr = restTemplate.postForEntity("http://localhost:8083/getPackagingDeliveryCharge", pd,
				Double.class);
		
		response.setPackingAndDeveliveryCharge(pr.getBody());
		LocalDate now = LocalDate.now();
		if (processRequest.getDefective_component_type().equalsIgnoreCase("Integral")) {
			response.setProcessingCharge(500);
			response.setDateOfDevlivery(now.plusDays(5));
			response = repairService.processIntegralAndAccessoryWorkflow(response);
		}
		if (processRequest.getDefective_component_type().equalsIgnoreCase("Accessory")) {
			response.setProcessingCharge(300);
			response.setDateOfDevlivery(now.plusDays(2));
			response = replacementService.processIntegralAndAccessoryWorkflow(response);
		}

		return response;
	}

}
