package com.sample.pensionerdetail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.pensionerdetail.model.PensionerDetail;
import com.sample.pensionerdetail.model.PensionerDetailDto;
import com.sample.pensionerdetail.service.PensionerDetailService;

@RestController
@RequestMapping("/pensionerdetail")
public class PensionerDetailController {

	@Autowired
	private PensionerDetailService pensionerDetailService;

	@GetMapping("/{aadharNumber}")
	public PensionerDetailDto getPensionerDetailByAadhaar(@PathVariable("aadharNumber") Long id) {
		return pensionerDetailService.getPensionerDetailByAadhaar(id);
	}
	
	@PostMapping
	public PensionerDetail savePensionerDetails(@RequestBody PensionerDetail pensionerDetail) {
		return pensionerDetailService.savePensionerDetails(pensionerDetail);
	}
}
