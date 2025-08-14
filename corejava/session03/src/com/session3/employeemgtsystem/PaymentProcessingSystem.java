package com.session3.employeemgtsystem;

public class PaymentProcessingSystem {

	public  void processPayment(Payable payable) {
		//
		System.out.println("db connection and i do store info in mysql data");
		System.out.println(payable.getPay());
	}
}
