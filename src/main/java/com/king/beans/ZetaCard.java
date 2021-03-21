package com.king.beans;

public class ZetaCard implements ICardPayment {

	public ZetaCard() {
		System.out.println("ZetaCard constructor got called...");
	}
	
	public boolean doPayment(Double amount) {
		System.out.println("ZetaCard doPayment() got called ");
		return true;
	}

}
