package com.mybank.domain;

public class SavingsAccount extends Account {

	private double intrestRate;
	
	public SavingsAccount(double initBalance, double intrestRate) {
		super(initBalance); // Pass the initBalance parameter to the super constructor. eg  :- Account(initBalance)
//		balance = initBalance;
		this.intrestRate = intrestRate;
	}
}
