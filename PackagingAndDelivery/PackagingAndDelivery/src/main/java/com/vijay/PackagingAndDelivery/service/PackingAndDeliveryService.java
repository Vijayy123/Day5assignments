package com.vijay.PackagingAndDelivery.service;

import org.springframework.stereotype.Service;

import com.vijay.PackagingAndDelivery.dto.ItemType;
import com.vijay.PackagingAndDelivery.entity.ProductDetails;
@Service
public class PackingAndDeliveryService {

	public double getPackagingDeliveryCharge(ProductDetails productDetails) {

		double charge = 0.0;

		if (ItemType.INTEGRAL.equals(productDetails.getComponentType())) {
			charge = productDetails.getCount() * (100 + 200);
		} else if (ItemType.ACCESSORY.equals(productDetails.getComponentType())) {
			charge = productDetails.getCount() * (50 + 100);
		}
		return charge;
	}

}
