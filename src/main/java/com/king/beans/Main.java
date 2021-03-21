package com.king.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");

		@SuppressWarnings("deprecation")
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		PaymentProcessor paymentProcessor = beanFactory.getBean("paymentProcessor", PaymentProcessor.class);
		paymentProcessor.doPayment(1234.0);
		//CreditCardPayment credit = beanFactory.getBean("credit", CreditCardPayment.class);
		
		/*
		 * DebitCardPayment debit = (DebitCardPayment)beanFactory.getBean("debit");
		 * paymentProcessor.setPayment(debit); paymentProcessor.doPayment(2222.0);
		 */
		
	} // end of main() method
} // end of class
