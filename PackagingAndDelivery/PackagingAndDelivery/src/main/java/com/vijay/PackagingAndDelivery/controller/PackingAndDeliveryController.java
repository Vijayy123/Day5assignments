package com.vijay.PackagingAndDelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.PackagingAndDelivery.entity.ProductDetails;
import com.vijay.PackagingAndDelivery.service.PackingAndDeliveryService;

@RestController
public class PackingAndDeliveryController {

	@Autowired
	private PackingAndDeliveryService PackingAndDeliveryService;


	@PostMapping(value = "/getPackagingDeliveryCharge")
	public double getPackagingDeliveryCharge(@RequestBody ProductDetails productDetails) {
		return PackingAndDeliveryService.getPackagingDeliveryCharge(productDetails);
	}

}

