package com.oracle.session02;
import java.util.*;
//collection api: aka readymade ds
class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void printEmployeeDetails() {
		System.out.println("id : "+ id +" name: "+name+" salary: "+salary);
	}	
}
class Compnay{
	private String companyName;
	private String companyLocation;
	private List<Employee> employees;
	
	public Compnay(String companyName,String companyLocation ) {
		this.companyLocation=companyLocation;
		this.companyName=companyName;
		this.employees=new LinkedList<>();
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public void printCompnayDetails() {
		System.out.println("companyName: "+ companyName);
		System.out.println("companyLocation: "+ companyLocation);
		
		System.out.println("------getting all employees-------------");
		//enhance for loop
		for(Employee employee: employees) {
			employee.printEmployeeDetails();
		}
	}
}

public class HasAExample {

	public static void main(String[] args) {
		Compnay compnay=new Compnay("Oracle", "Banglore");
		compnay.addEmployee(new Employee(1, "raj", 20000));
		compnay.addEmployee(new Employee(5, "gunika", 7000));
		compnay.addEmployee(new Employee(1, "ekta", 5000));
		compnay.addEmployee(new Employee(1, "john", 9000));
		
		compnay.printCompnayDetails();
		
	}
}
