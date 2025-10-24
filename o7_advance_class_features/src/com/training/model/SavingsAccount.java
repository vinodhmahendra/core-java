package com.training.model;

public class SavingsAccount extends Account{
	

	public double interestRate;
	
	public SavingsAccount(double initBalance, double interestRate) {
		super(initBalance); // invoke a super class constructor
		this.interestRate =  interestRate;
	}
	

	protected SavingsAccount(double initBalance) {
		super(initBalance);
		
	}

}
