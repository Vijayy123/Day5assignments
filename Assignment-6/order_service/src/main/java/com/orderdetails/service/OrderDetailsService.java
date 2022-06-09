package com.orderdetails.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderdetails.dto.OrderDto;
import com.orderdetails.dto.OrderLineDto;
import com.orderdetails.entity.Address;
import com.orderdetails.entity.Order;
import com.orderdetails.entity.OrderLine;
import com.orderdetails.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService {
	@Autowired
	private OrderDetailsRepository repo;

	public Order saveorderdetails(OrderDto order) {
		
		Order entity = new Order();
		entity.setTotalAmount(order.getTotalAmount());
		entity.setOrderstatus(order.getOrderStatus());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		entity.setOrderDate(LocalDate.parse(order.getOrderDate(), formatter));
		
		
		List<OrderLine> orderLines = new ArrayList<>();
		
		for(OrderLineDto o : order.getOrderLines()) {
			OrderLine orderline = new OrderLine();
			orderline.setEta(o.getEta());
			orderline.setItem(o.getItem());
			orderline.setOrder(entity);
			orderline.setOrderLineStatus(o.getOrderLineStatus());
			orderline.setPrice(o.getPrice());
			Address ad = new Address();
			ad.setPincode(o.getAddress().getPincode());
			orderline.setAddress(ad);
			ad.setOrderline(orderline);
			orderLines.add(orderline);
		}
		entity.setOrderLines(orderLines);
		return repo.save(entity);
	}

	public Order getOrderById(Long orderId) {
		return repo.findById(orderId).get();
	}

	public List<Order> getOrderByPincode(int pincode) {
		return repo.findByOrderLines_Address_Pincode(pincode);
	}
}
