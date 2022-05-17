package com.sample.processpension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sample.processpension.model.PensionerDetailDto;
import com.sample.processpension.model.ProcessPensionRequest;
import com.sample.processpension.model.ProcessPensionResponse;

@Service
public class ProcessPensionService {

	@Autowired
	public RestTemplate restTemplate;

	public ProcessPensionResponse processPension(ProcessPensionRequest processPensionRequest) {

		ProcessPensionResponse processPensionResponse = new ProcessPensionResponse();
		PensionerDetailDto pensionerDetails = restTemplate.getForObject(
				"http://PENSIONER-DETAIL/pensionerdetail/" + processPensionRequest.getAadharNum(), PensionerDetailDto.class);

		if (pensionerDetails != null) {
			double pensionAmt = 0.0;
			if (pensionerDetails.getSelfOrFamilyPension().equalsIgnoreCase("self")) {

				pensionAmt = ((pensionerDetails.getSalaryEarned() / 100) * 80)+ pensionerDetails.getAllowances();
			} else {
				pensionAmt = ((pensionerDetails.getSalaryEarned() / 100) * 50)+ pensionerDetails.getAllowances();
			}
			processPensionResponse.setPensionAmount(pensionAmt);
			processPensionResponse
					.setBankServiceCharge(pensionerDetails.getBankDetail().getBankType().equalsIgnoreCase("private") ? 550 : 500);

		}

		return processPensionResponse;
	}

}
