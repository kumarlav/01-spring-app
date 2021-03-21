package com.king.beans;

public class PaymentProcessor {

	private ICardPayment payment;

	public PaymentProcessor() {
		System.out.println("PaymentProcessor constructor got called");
	}
	
	public PaymentProcessor(ICardPayment payment) {
		this.payment = payment;
		System.out.println("PaymentProcessor args constructor got called");
	}

	public void setPayment(ICardPayment payment) {
		this.payment = payment;
	}

	public void doPayment(Double amount) {
		boolean isPaymentDone = payment.doPayment(amount);
		if (isPaymentDone) {
			System.out.println("Payment done...");
		} else {
			System.out.println("Payment Not done...");
		}
	}

}
