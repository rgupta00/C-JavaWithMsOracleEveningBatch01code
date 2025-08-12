package com.oracle.session02;
//Account class: capsulate data + methods 
public class Account {
	private int id; //instance variable
	private String name;
	private double balance;
	
	//static data
	private static int counter=0;
	
	//static method ? can not access instance varaible
	//u can call static method without the object of Account class
	public static int getCounter() {
		return counter;
	}
	
	//						local variable
	public Account(String name, double balance) {
		id=++counter;
		this.name=name;
		this.balance=balance;
	}
	public void print() {
		System.out.println("id: "+ this.id+" name: "+this.name+" balance "+this.balance);
	}

}
