package com.session3.ex1;
//Base class
class Employee{
	 int id;
	 String name;
	
	public void printEmployeeDetails() {
		System.out.println("id: "+ id+" name: "+name);
	}
}
//Drived class
class FullTimeEmployee extends Employee{
	
	 double salary;
	 
	public void printEmployeeDetails() {
			super.printEmployeeDetails();//drived class have reused the logic of base class
			System.out.println("salary: "+ salary);
	}
}
public class A_NeedOfInheritance {

	public static void main(String[] args) {
		
	}
}
