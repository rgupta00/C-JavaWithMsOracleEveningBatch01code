package com.session3.employeemgtsystem;

abstract public class Employee implements Payable {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public void print() {
		System.out.println("id : "+ id);
		System.out.println("name: "+name);
	}
}
