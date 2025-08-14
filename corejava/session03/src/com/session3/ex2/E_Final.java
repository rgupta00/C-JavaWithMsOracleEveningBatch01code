package com.session3.ex2;
class Emp{
	private int id;
	private String name;
	private double salary;
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void print() {
		System.out.println("id : "+ id +" name: "+ name+" salary: "+ salary);
	}
}
public class E_Final {
	
	public static void main(String[] args) {
		//emp is aka final pointer/ ref u can not re assign new object to this pointer now, u can not 
		//not nullify this object now
		final Emp emp=new Emp(1, "raj", 5000);
		
		emp.print();
		emp.setSalary(90000);
		
		emp.print();
	}

}





