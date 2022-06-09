package com.orderdetails.dto;

import java.util.List;

public class OrderDto {

	private double totalAmount;
	private String orderDate;
	private String orderStatus;
	private List<OrderLineDto> orderLines;

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<OrderLineDto> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLineDto> orderLines) {
		this.orderLines = orderLines;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
