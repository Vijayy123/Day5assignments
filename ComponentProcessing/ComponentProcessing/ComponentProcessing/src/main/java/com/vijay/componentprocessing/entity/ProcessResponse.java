package com.vijay.componentprocessing.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProcessResponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long requestId;
	private double processingCharge;
	private double packingAndDeveliveryCharge;
	private LocalDate dateOfDevlivery;

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public double getProcessingCharge() {
		return processingCharge;
	}

	public void setProcessingCharge(double processingCharge) {
		this.processingCharge = processingCharge;
	}

	public double getPackingAndDeveliveryCharge() {
		return packingAndDeveliveryCharge;
	}

	public void setPackingAndDeveliveryCharge(double packingAndDeveliveryCharge) {
		this.packingAndDeveliveryCharge = packingAndDeveliveryCharge;
	}

	public LocalDate getDateOfDevlivery() {
		return dateOfDevlivery;
	}

	public void setDateOfDevlivery(LocalDate dateOfDevlivery) {
		this.dateOfDevlivery = dateOfDevlivery;
	}

}
