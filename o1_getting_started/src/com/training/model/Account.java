package com.training.model;

public class Account {
	
	// field
	public double balance;
	
	//Initialize the field (constructor)
	public Account(double initBalance) {
		balance = initBalance;
	}
	
	//Business Methods
	public void deposit ( double amt ) {
		balance = balance + amt;
	}
	
	public void withdraw( double amt ) {
		balance = balance - amt;
	}
	
	//accessor method
	public double getBalance() {
		return balance;
	}

}
