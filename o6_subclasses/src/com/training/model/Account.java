package com.training.model;

public class Account {


	protected double balance;
	
	protected Account(double initBalance) {
		balance = initBalance;
	}

	// methods
	public boolean deposit(double amt) {
		balance = balance + amt;
		return true;
	}
	
	public boolean withdraw(double amt) {
		boolean result = false; // assume operation failure
		if ( amt  <= balance ) {
			balance = balance - amt;
			result = true; // operation successful
		}
		return result;
	}
	
	public double getBalance() {
		return balance;
	}
}
