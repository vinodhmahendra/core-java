package com.mybank.domain;

public class CheckingAccount extends Account {

	private double overdraftAmount;
	
	// first constructor
	public CheckingAccount(double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
	}
	
	//second constructor
	public CheckingAccount(double initBalance) {
		//call the first constructor with the initBalance parameter and use the default value 0.0 for overdraftAmount parameter
		this(initBalance,0.0);
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean result = true;
		if (balance < amount) {
			double overdraftNeeded = amount - balance;
			if ( overdraftAmount < overdraftNeeded) {
				result = false;
			}else {
				balance = 0.0; // #
				overdraftAmount -= overdraftNeeded;
			}
		}else {
			balance -= amount;
		}
		return result;
	}
}
