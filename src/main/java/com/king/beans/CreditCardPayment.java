package com.king.beans;

public class CreditCardPayment implements ICardPayment{

	public CreditCardPayment() {
		System.out.println("CreditCardPayment constructor got called");
	}
	
	public boolean doPayment(Double amount) {
		System.out.println("CreditCardPayment :: doPayment() method got called ...");
		return true;
	}

}
