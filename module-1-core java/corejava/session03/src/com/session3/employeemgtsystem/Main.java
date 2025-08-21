package com.session3.employeemgtsystem;

public class Main {

	public static void main(String[] args) {
		Employee employee=new FullTimeEmployee(1, "raj", 40000, "afjdlkfjd");
		
		Invoice invoice=new Invoice(121, 444, 67000);
		
		PaymentProcessingSystem paymentProcessingSystem=
				new PaymentProcessingSystem();
		paymentProcessingSystem.processPayment(employee);
		
		paymentProcessingSystem.processPayment(invoice);
	}
}
