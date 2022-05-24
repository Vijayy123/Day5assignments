package com.vijay.PackagingAndDelivery.entity;

import com.vijay.PackagingAndDelivery.dto.ItemType;

public class ProductDetails {

	private ItemType componentType;
	private int count;

	

	public ItemType getComponentType() {
		return componentType;
	}

	public void setComponentType(ItemType componentType) {
		this.componentType = componentType;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
