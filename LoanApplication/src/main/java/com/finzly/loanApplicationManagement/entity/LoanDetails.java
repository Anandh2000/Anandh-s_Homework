package com.finzly.loanApplicationManagement.entity;

import java.time.LocalDate;

public class LoanDetails {
	private long customerId;
	private double loanAmount;
	private LocalDate tradeDate;
	private LocalDate loanStartDate;
	private LocalDate maturityDate;
	private String paymentFrequency;
	private double intrestRate;
	private String paymentTerm;
	
	public LoanDetails() {
	}

	public LoanDetails(long customerId, double loanAmount, LocalDate tradeDate, LocalDate loanStartDate,
			LocalDate maturityDate, String paymentFrequency, double intrestRate,String paymentTerm) {
		super();
		this.customerId = customerId;
		this.loanAmount = loanAmount;
		this.tradeDate = tradeDate;
		this.loanStartDate = loanStartDate;
		this.maturityDate = maturityDate;
		this.paymentFrequency = paymentFrequency;
		this.intrestRate = intrestRate;
		this.paymentTerm = paymentTerm;
	}

	public String getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public LocalDate getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(LocalDate tradeDate) {
		this.tradeDate = tradeDate;
	}

	public LocalDate getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(LocalDate loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}



	public double getIntrestRate() {
		return intrestRate;
	}



	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}



	@Override
	public String toString() {
		return "LoanDetails [customerId=" + customerId + ", loanAmount=" + loanAmount + ", tradeDate=" + tradeDate
				+ ", loanStartDate=" + loanStartDate + ", maturityDate=" + maturityDate + ", paymentFrequency="
				+ paymentFrequency + ", intrestRate=" + intrestRate + ", paymentTerm=" + paymentTerm + "]";
	}
	
	
	
	
	
}
