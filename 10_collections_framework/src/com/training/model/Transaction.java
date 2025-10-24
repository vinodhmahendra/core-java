package com.training.model;

import java.util.Date;

public class Transaction {
	
	
	private String transactionId;
	private String type;
	private double amount;
	private Date date;
	
	
	public Transaction(String id, String type, double amount) {
        this.transactionId = id;
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }
	
	@Override
	public String toString() {
		return transactionId + " | " + type + " | ₹" + amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getType() {
		return type;
	}

}
