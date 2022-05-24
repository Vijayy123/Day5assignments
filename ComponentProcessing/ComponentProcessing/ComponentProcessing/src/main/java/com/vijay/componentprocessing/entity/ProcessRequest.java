package com.vijay.componentprocessing.entity;

public class ProcessRequest {

	private String name;
	private String contactNumber;
	private String defective_component_type;
	private String defective_component_name;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDefective_component_type() {
		return defective_component_type;
	}

	public void setDefective_component_type(String defective_component_type) {
		this.defective_component_type = defective_component_type;
	}

	public String getDefective_component_name() {
		return defective_component_name;
	}

	public void setDefective_component_name(String defective_component_name) {
		this.defective_component_name = defective_component_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
