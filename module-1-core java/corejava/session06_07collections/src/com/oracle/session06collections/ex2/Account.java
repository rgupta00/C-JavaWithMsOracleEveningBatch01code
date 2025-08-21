package com.oracle.session06collections.ex2;

public class Account extends Object{

	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void withdraw(double amount)throws InsufficientFundException {
		double temp= balance-amount;
		if(temp<10000) {
			throw new InsufficientFundException("withdraw is not possible, due to min balance rule");
		}
		balance=temp;
	}
	
	
	public void deposit(double amount)throws OverFundException {
		double temp= balance+amount;
		if(temp>500_000) {
			throw new OverFundException
			("withdraw is not possible, due to overfund open current acc");
		}
		balance=temp;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
