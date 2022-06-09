package com.orderdetails.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable{
	
	private static final long serialVersionUID = 204340155566180678L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String city;
	private String state;
	private int pincode;
	@OneToOne(mappedBy = "address")
	private OrderLine orderline;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public OrderLine getOrderline() {
		return orderline;
	}

	public void setOrderline(OrderLine orderline) {
		this.orderline = orderline;
	}

}
