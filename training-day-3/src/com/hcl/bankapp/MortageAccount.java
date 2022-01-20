package com.hcl.bankapp;

import java.util.Date;

public class MortageAccount extends Account {
	
	private double monthlyPayment;
	private Date expectedFinishDate;
	private static double currentAnnualInterestRate;
	
	static {
		currentAnnualInterestRate = 13.5;
	}
	
	public MortageAccount(String id, Client client, double amount, double monthlyPayment, Date expectedFinishDate ) {
		super(id, client, amount);
		this.monthlyPayment = monthlyPayment;
		this.expectedFinishDate = expectedFinishDate;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public Date getExpectedFinishDate() {
		return expectedFinishDate;
	}

	public void setExpectedFinishDate(Date expectedFinishDate) {
		this.expectedFinishDate = expectedFinishDate;
	}

	public static double getCurrentAnnualInterestRate() {
		return currentAnnualInterestRate;
	}

	public static void setCurrentAnnualInterestRate(double currentAnnualInterestRate) {
		MortageAccount.currentAnnualInterestRate = currentAnnualInterestRate;
	}

	@Override
	public String toString() {
		String out = "";
		out += "Mortage account: ";
		out += super.toString();
		out += "Monthly payment: $"+ monthlyPayment + "\n";
		out	+= "Expected finish date:" + expectedFinishDate + "\n";
		out += "Current annual interest rate: " + currentAnnualInterestRate + "\n"; 
		return out;
	}
	
	

}
