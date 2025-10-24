package com.training.client;

import com.training.model.Account;
import com.training.model.Bank;
import com.training.model.CheckingAccount;
import com.training.model.Customer;
import com.training.model.SavingsAccount;

public class TestBanking {

	public static void main(String[] args) {
		
//		Bank myBank = new Bank(); Error : the constructor is private
		
		System.out.println("Creating the customer Jane Smith.");
		Bank.addCustomer("Jane", "Smith");
		System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
		Bank.getCustomer(0).setAccount(new SavingsAccount(500.00, 3.0));
		
		System.out.println("Creating the customer Owen Bryant.");
		Bank.addCustomer("Owen", "Bryant");
		System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection");
		Bank.getCustomer(1).setAccount(new CheckingAccount(500.00));
		
		System.out.println("Creating the customer Tim Soley.");
		Bank.addCustomer("Tim", "Soley");
		System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection.");
		Bank.getCustomer(2).setAccount(new CheckingAccount(500.00,500.00));
		
		System.out.println("Creating the customer Maria Soley.");
		Bank.addCustomer("Maria", "Soley");
		System.out.println("Maria shares her Checking Account with her husband Tim.");
		Bank.getCustomer(3).setAccount(Bank.getCustomer(2).getAccount());
		
		System.out.println(" ======================================================  ");
		
		System.out.println("Retrieving the customer Jane Smith with her savings account.");
		System.out.println("Withdraw 150.00: "+Bank.getCustomer(0).getAccount().withdraw(150.00));
		System.out.println("Deposit 22.50: "+Bank.getCustomer(0).getAccount().deposit(22.50));
		System.out.println("Withdraw 47.62: "+Bank.getCustomer(0).getAccount().withdraw(47.62));
		System.out.println("Withdraw 400.00: "+Bank.getCustomer(0).getAccount().withdraw(400.00));
		System.out.println("Customer ["+Bank.getCustomer(0).getFirstName()+","+
				Bank.getCustomer(0).getLastName()+"] has a balance of "+ Bank.getCustomer(0).getAccount().getBalance());
		
		
		System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection");
		System.out.println("Withdraw 150.00: "+Bank.getCustomer(1).getAccount().withdraw(150.00));
		System.out.println("Deposit 22.50: "+Bank.getCustomer(1).getAccount().deposit(22.50));
		System.out.println("Withdraw 47.62: "+Bank.getCustomer(1).getAccount().withdraw(47.62));
		System.out.println("Withdraw 400.00: "+Bank.getCustomer(1).getAccount().withdraw(400.00));
		System.out.println("Customer ["+Bank.getCustomer(1).getFirstName()+","+
				Bank.getCustomer(1).getLastName()+"] has a balance of "+ Bank.getCustomer(1).getAccount().getBalance());
		
		

		System.out.println("Retrieving the customer Tim Soley with his checking account that has overdraft protection");
		System.out.println("Withdraw 150.00: "+Bank.getCustomer(2).getAccount().withdraw(150.00));
		System.out.println("Deposit 22.50: "+Bank.getCustomer(2).getAccount().deposit(22.50));
		System.out.println("Withdraw 47.62: "+Bank.getCustomer(2).getAccount().withdraw(47.62));
		System.out.println("Withdraw 400.00: "+Bank.getCustomer(2).getAccount().withdraw(400.00));
		System.out.println("Customer ["+Bank.getCustomer(2).getFirstName()+","+
				Bank.getCustomer(2).getLastName()+"] has a balance of "+ Bank.getCustomer(2).getAccount().getBalance());
		
		
		System.out.println("Retrieving the customer Maria Soley with her joint checking account with\n"
				+ "husband Tim.");
		System.out.println("Deposit 150: "+Bank.getCustomer(3).getAccount().deposit(150.00));
		System.out.println("Withdraw 750.00: "+Bank.getCustomer(3).getAccount().withdraw(750.00));
		System.out.println("Customer ["+Bank.getCustomer(3).getFirstName()+","+
				Bank.getCustomer(3).getLastName()+"] has a balance of "+ Bank.getCustomer(3).getAccount().getBalance());
		
	}
}
