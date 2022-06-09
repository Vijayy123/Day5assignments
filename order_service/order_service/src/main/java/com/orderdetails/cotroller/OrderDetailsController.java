package com.orderdetails.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderdetails.dto.OrderDto;
import com.orderdetails.entity.Order;
import com.orderdetails.service.OrderDetailsService;
@RestController
public class OrderDetailsController {
	
		@Autowired
		private OrderDetailsService service;
		
		@PostMapping("/saveorder")
		public Order saveorderdetails(@RequestBody OrderDto order) {
			return service.saveorderdetails(order);
		}
		@GetMapping("/getOrderById/{orderId}")
		public Order getOrderById(@PathVariable Long orderId) {
			return service.getOrderById(orderId);
		}
		
		@GetMapping("/getOrderByPincode/{pincode}")
		public List<Order> getOrderByPincode(@PathVariable int pincode) {
			return service.getOrderByPincode(pincode);
		}
	}