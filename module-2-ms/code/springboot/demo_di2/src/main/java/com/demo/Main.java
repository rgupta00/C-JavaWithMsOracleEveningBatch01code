package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
		//-Dspring.profiles.active=test
	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Passanger passanger=(Passanger) ctx.getBean("passanger");
		passanger.travel();
		
	}
}











//programmer is resp for creating the object of 
//bike or car and "manully" assign into the ctr of passanger
//Vehicle vehicle=new Bike();
//Passanger passanger=new Passanger(vehicle);
//passanger.travel();