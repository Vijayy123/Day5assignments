package com.vijay.notificationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl {

	@Autowired
    private JavaMailSender javaMailSender;
	
	public void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("vijay.java914@gmail.com");

        msg.setSubject("Testing email service");
        msg.setText("Hello World \n Spring Boot Email");

        javaMailSender.send(msg);

    }
}
