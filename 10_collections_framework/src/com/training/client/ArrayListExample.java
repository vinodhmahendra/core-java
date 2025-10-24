package com.training.client;

import java.util.ArrayList;

import com.training.model.Transaction;

public class ArrayListExample { 
	
	public static void main(String[] args) {
		ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        // Adding transactions
        transactions.add(new Transaction("TXN001", "DEPOSIT", 5000));
        transactions.add(new Transaction("TXN002", "WITHDRAWAL", 1000));
        transactions.add(new Transaction("TXN003", "DEPOSIT", 3000));
        transactions.add(new Transaction("TXN004", "WITHDRAWAL", 500));
        
        System.out.println("Total Transactions: " + transactions.size());
        
        for ( Transaction txn : transactions) {
        	System.out.println(txn); // invoke toString()
        }
        
        double totalDeposits = 0 ;
        for (Transaction txn: transactions ) {
        	if ( txn.getType().equals("DEPOSIT")) {
        		totalDeposits += txn.getAmount();
        	}
        }
        System.out.println("\n Total  Deposits:  ₹" + totalDeposits);
        
        
        transactions.remove(1);
        System.out.println("\n After removing 2nd transactions: " + transactions.size() + " transactions");
	}

}


 
