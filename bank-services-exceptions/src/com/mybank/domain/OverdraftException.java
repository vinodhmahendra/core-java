package com.mybank.domain;

public class OverdraftException extends Exception{
	
	private final double deficit;
	
	public OverdraftException(String message,double deficit) {
		super(message);
		this.deficit = deficit;
	}
	
	public double getDeficit() {
		return deficit;
	}

}
