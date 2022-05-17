package com.vijay.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.notificationservice.service.EmailServiceImpl;

@RestController
@RequestMapping(value = "/sendemail")
public class EmailController {
	
	@Autowired
	private EmailServiceImpl emailServiceImpl;

	@GetMapping
	public String sendEmail() {
		
		emailServiceImpl.sendEmail();
		return "Email sent successfully";
	}
}
