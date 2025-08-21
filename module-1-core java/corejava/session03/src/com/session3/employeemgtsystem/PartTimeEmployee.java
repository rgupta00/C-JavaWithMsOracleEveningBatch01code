package com.session3.employeemgtsystem;

public class PartTimeEmployee extends Employee{
	private int noOfDays;
	private double ratePerDay;
		
	public 	PartTimeEmployee(int id, String name, int noOfDays, double  ratePerDay) {
		super(id, name);
		this.noOfDays=noOfDays;
		this.ratePerDay=ratePerDay;
	}

	
	public double getPay() {
		return noOfDays*ratePerDay*0.8;
	}
	public void print() {
		super.print();
		System.out.println("noOfDays: "+ noOfDays);
		System.out.println("ratePerDay: "+ ratePerDay);
	}
}
