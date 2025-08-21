package com.oracle.session02;

import java.util.Scanner;

//i should a abstraction

// abstract class vs interface

//abstract class Vehicle{
//	public abstract void move(String source, String destination);
//}
interface Vehicle{
	public void move(String source, String destination);
}
class Metro implements Vehicle{
	//method of base class is "overriden" by drive class
	public void move(String source, String destination){
		System.out.println("moving on metro from "+ source+" destination "+ destination);
	}
}

class Car implements Vehicle{
	public void move(String source, String destination){
		System.out.println("moving in a Car from "+ source+" destination "+ destination);
	}
}
class Bike implements Vehicle{
	public void move(String source, String destination){
		System.out.println("moving on a bike from "+ source+" destination "+ destination);
	}
}
//passannger class become "stable"
class Passanger{
	private String name;
	
	public Passanger(String name) {
		this.name = name;
	}
	public void travel(String source, String destination, Vehicle vehicle){
		System.out.println("name of the passanger : "+ name);
		vehicle.move(source, destination);
	}
}
public class PassangerProblem {

	public static void main(String[] args) {
		//"Polymorphism"
		Scanner scanner=new Scanner(System.in);
		Vehicle vehicle;
		
		System.out.println("PE 1. metro 2.car 3.bike");
		int choice= scanner.nextInt();
		if(choice==1) {
			vehicle=new Metro();
		}else if (choice==2) {
			vehicle=new Car();
		}else {
			vehicle=new Bike();
		}
		
		Passanger passanger=new Passanger("raj");
		passanger.travel("Laxmi nagar", "ITO", vehicle);
	}
}



