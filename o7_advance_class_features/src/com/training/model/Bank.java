package com.training.model;

public class Bank {
	
	private static Customer[] customers;
	private static int numberOfCustomers;
	
	// initializer
	static {
		customers = new Customer[10]; // intializes the customers array with some maximum size
		numberOfCustomers = 0;
	}
	
	
	// Define a constructor
	private  Bank() {
	
	}

	public static void addCustomer(String f, String l) {
		int  i = numberOfCustomers ++;
		customers[i] = new Customer(f, l);
	}
	
	public static int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public static Customer getCustomer(int customer_index) {
		return customers[customer_index];
	}
}
