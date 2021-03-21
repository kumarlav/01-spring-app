package com.king.beans;

public class DebitCardPayment implements ICardPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment constructor got called");
	}
	
	public boolean doPayment(Double amount) {
		System.out.println("DebitCardPayment :: doPayment() method got called ...");
		return true;
	}

}
