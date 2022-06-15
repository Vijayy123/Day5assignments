package com.orderdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orderdetails.entity.OrderLine;
import com.orderdetails.repository.OrderDetailsRepository;
public class OrderDetailsService {
	@Service
	public class StoreDetailsService {
		@Autowired
		private OrderDetailsRepository repo;
		@SuppressWarnings("unused")
		@Autowired
		private RestTemplate restTemplate;
		public OrderLine saveorderdetails(OrderLine order) {
			return repo.save(saveorderdetails(null));
		}
	}
}

