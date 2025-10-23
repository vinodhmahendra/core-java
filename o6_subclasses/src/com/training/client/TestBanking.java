package com.training.client;

import com.training.model.Account;
import com.training.model.Bank;
import com.training.model.CheckingAccount;
import com.training.model.Customer;
import com.training.model.SavingsAccount;

public class TestBanking {

	public static void main(String[] args) {
		
		Bank myBank = new Bank();
		
		System.out.println("Creating the customer Jane Smith.");
		myBank.addCustomer("Jane", "Smith");
		System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
		myBank.getCustomer(0).setAccount(new SavingsAccount(500.00, 3.0));
		
		System.out.println("Creating the customer Owen Bryant.");
		myBank.addCustomer("Owen", "Bryant");
		System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection");
		myBank.getCustomer(1).setAccount(new CheckingAccount(500.00));
		
		System.out.println("Creating the customer Tim Soley.");
		myBank.addCustomer("Tim", "Soley");
		System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection.");
		myBank.getCustomer(2).setAccount(new CheckingAccount(500.00,500.00));
		
		System.out.println("Creating the customer Maria Soley.");
		myBank.addCustomer("Maria", "Soley");
		System.out.println("Maria shares her Checking Account with her husband Tim.");
		myBank.getCustomer(3).setAccount(myBank.getCustomer(2).getAccount());
		
		System.out.println(" ======================================================  ");
		
		System.out.println("Retrieving the customer Jane Smith with her savings account.");
		System.out.println("Withdraw 150.00: "+myBank.getCustomer(0).getAccount().withdraw(150.00));
		System.out.println("Deposit 22.50: "+myBank.getCustomer(0).getAccount().deposit(22.50));
		System.out.println("Withdraw 47.62: "+myBank.getCustomer(0).getAccount().withdraw(47.62));
		System.out.println("Withdraw 400.00: "+myBank.getCustomer(0).getAccount().withdraw(400.00));
		System.out.println("Customer ["+myBank.getCustomer(0).getFirstName()+","+
				myBank.getCustomer(0).getLastName()+"] has a balance of "+ myBank.getCustomer(0).getAccount().getBalance());
		
	}

}
