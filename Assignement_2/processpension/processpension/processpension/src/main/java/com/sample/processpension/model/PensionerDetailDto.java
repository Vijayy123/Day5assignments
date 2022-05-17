package com.sample.processpension.model;

public class PensionerDetailDto {

	private String name;
	private String pan;
	private double salaryEarned;
	private double allowances;
	private String selfOrFamilyPension;
	private BankDetails bankDetail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public String getSelfOrFamilyPension() {
		return selfOrFamilyPension;
	}
	public void setSelfOrFamilyPension(String selfOrFamilyPension) {
		this.selfOrFamilyPension = selfOrFamilyPension;
	}
	public BankDetails getBankDetail() {
		return bankDetail;
	}
	public void setBankDetail(BankDetails bankDetail) {
		this.bankDetail = bankDetail;
	}
	
}
