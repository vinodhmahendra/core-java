package com.training.model;

public class Account {


	private  double balance;
	
	public Account(double initBalance) {
		balance = initBalance;
	}

	// methods
	public void deposit(double amt) {
		balance = balance + amt;
	}
	
	public void withdraw(double amt) {
		if ( amt <= balance ) {
			balance = balance - amt;
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
