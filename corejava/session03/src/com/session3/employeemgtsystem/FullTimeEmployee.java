package com.session3.employeemgtsystem;

public class FullTimeEmployee extends Employee {
	private double baseSalary;
	private String ppfAccount;
	
	public FullTimeEmployee(int id, String name, double baseSalary,String ppfAccount ) {
		super(id, name);
		this.baseSalary=baseSalary;
		this.ppfAccount=ppfAccount;
	}

	@Override
	public double getPay() {
		return baseSalary*5*0.7;
	}
	public void print() {
		super.print();
		System.out.println("baseSalary: "+ baseSalary);
		System.out.println("ppfAccount: "+ ppfAccount);
	}
	
}
