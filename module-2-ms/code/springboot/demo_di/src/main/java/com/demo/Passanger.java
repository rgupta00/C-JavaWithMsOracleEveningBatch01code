package com.demo;
//OCP :)
public class Passanger {

	private Vehicle vehicle;
	
	public Passanger(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void travel() {
		System.out.println("passanger is traveling");
		vehicle.move();
	}
}
