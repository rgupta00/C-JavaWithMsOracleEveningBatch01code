package com.demo;

public class Main {

	public static void main(String[] args) {
		//programmer is resp for creating the object of 
		//bike or car and "manully" assign into the ctr of passanger
		Vehicle vehicle=new Bike();
		Passanger passanger=new Passanger(vehicle);
		passanger.travel();
	}
}
