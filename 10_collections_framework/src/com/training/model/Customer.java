package com.training.model;

public class Customer {

	private String name;
	private int tokenNumber;
	
	public Customer(String name, int tokenNumber) {
		this.name = name;
		this.tokenNumber = tokenNumber;
	}
	
	@Override
	public String toString() {
		  return "Token #" + tokenNumber + " - " + name;
	}
}
