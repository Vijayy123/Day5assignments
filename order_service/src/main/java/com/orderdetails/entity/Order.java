package com.orderdetails.entity;
import java.time.LocalDate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Order {
	
	    @Id
		private long orderid;
	    
		private double totalAmount;
		private LocalDate orderDate;
		private String orderstatus;
		private List<OrderLine> orderLines;
		private List<Address> addresses;
		
		public long getOrderid() {
			return orderid;
		}
		public void setOrderid(long orderid) {
			this.orderid = orderid;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public LocalDate getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}
		public String getOrderstatus() {
			return orderstatus;
		}
		public void setOrderstatus(String orderstatus) {
			this.orderstatus = orderstatus;
		}
		public List<OrderLine> getOrderLines() {
			return orderLines;
		}
		public void setOrderLines(List<OrderLine> orderLines) {
			this.orderLines = orderLines;
		}
		public List<Address> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}
		
		
	}

