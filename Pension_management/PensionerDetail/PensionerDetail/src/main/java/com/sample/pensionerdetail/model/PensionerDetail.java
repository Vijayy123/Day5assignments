package com.sample.pensionerdetail.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PensionerDetail {

	@Id
	private long id;
	private String name;
	private String pan;
	private double salaryEarned;
	private double allowances;
	private String selfOrFamilyPension;
	private String bankName;
	private String accountNum;
	private String bankType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

}
