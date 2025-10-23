package com.training.model;

public class Bank {
	
	private Customer[] customers;
	private int numberOfCustomers;
	
	
	// Define a constructor
	public Bank() {
		customers = new Customer[10]; // intializes the customers array with some maximum size
		numberOfCustomers = 0;
	}

	public void addCustomer(String f, String l) {
		int  i = numberOfCustomers ++;
		customers[i] = new Customer(f, l);
	}
	
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int customer_index) {
		return customers[customer_index];
	}
}
