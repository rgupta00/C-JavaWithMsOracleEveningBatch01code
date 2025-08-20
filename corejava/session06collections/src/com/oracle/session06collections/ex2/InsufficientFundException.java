package com.oracle.session06collections.ex2;
//how to create custom ex:
//chechked vs un..
//Exception vs RuntimeEx.....
public class InsufficientFundException extends Exception {

	public InsufficientFundException(String message) {
		super(message);
	}
}
