package com.training.model;

public class Customer {
	
	private String firstName; // reference type 'String'
	private String lastName; 
	private Account account; // reference type 'Account'
	
	public Customer(String f,String l) {
		firstName = f;
		lastName = l;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setAccount(Account acct) {
		account = acct;
	}
	public Account getAccount() {
		return account;
	}
}
