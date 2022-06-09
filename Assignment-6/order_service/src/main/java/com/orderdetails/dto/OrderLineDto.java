package com.orderdetails.dto;

public class OrderLineDto {

	private String items;
	private double price;
	private int quatity;
	private String eta;
	private String orderLineStatus;
	private AddressDto address;

	public String getItem() {
		return items;
	}

	public void setItem(String item) {
		this.items = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getOrderLineStatus() {
		return orderLineStatus;
	}

	public void setOrderLineStatus(String orderLineStatus) {
		this.orderLineStatus = orderLineStatus;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}
	
	
}
