package com.orderdetails.cotroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderdetails.entity.OrderLine;
@RestController
public class OrderDetailsController {
	
		@Autowired
		private OrderLine service;
		
		@PostMapping("/Orderdetails")
		public OrderLine saveorderdetails(@Valid @RequestBody OrderLine order) {
			return service.saveorderdetails(order);
		}
	}