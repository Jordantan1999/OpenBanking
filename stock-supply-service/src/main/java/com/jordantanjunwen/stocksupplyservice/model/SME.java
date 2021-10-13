package com.jordantanjunwen.stocksupplyservice.model;

import java.util.List;

//@Entity
public class SME {
	private String smeRegisteredId;
	private String name;
	private String industry;
	private int employeeAmount;
	private int turnover;

	public SME(String smeRegisteredId, String name, String industry, int employeeAmount, int turnover) {
		super();
		this.smeRegisteredId = smeRegisteredId;
		this.name = name;
		this.industry = industry;
		this.employeeAmount = employeeAmount;
		this.turnover = turnover;
	}

	public String getSmeRegisteredId() {
		return smeRegisteredId;
	}

	public void setSmeRegisteredId(String smeRegisteredId) {
		this.smeRegisteredId = smeRegisteredId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public int getEmployeeAmount() {
		return employeeAmount;
	}

	public void setEmployeeAmount(int employeeAmount) {
		this.employeeAmount = employeeAmount;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
}
