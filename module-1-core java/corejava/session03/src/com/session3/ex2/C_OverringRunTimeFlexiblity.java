package com.session3.ex2;

import java.util.Scanner;

abstract class Shape{
	private String color;
	public Shape(String color) {
		this.color = color;
	}
	public abstract void calArea();
	
}
class Tringle extends Shape{

	public Tringle(String color) {
		super(color);
	}

	@Override
	public void calArea() {
		System.out.println("area : 0.5 X b X H");
	}
}
class Circle extends Shape{

	public Circle(String color) {
		super(color);
	}

	@Override
	public void calArea() {
		System.out.println("area : PI X r X r");
	}
}
class Rectangle extends Shape{

	public Rectangle(String color) {
		super(color);
	}

	@Override
	public void calArea() {
		System.out.println("area : l x b");
	}
}
public class C_OverringRunTimeFlexiblity {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE 1. for Sq 2. for Tri 3. for default Circle");
		int choice= scanner.nextInt();
		Shape shape;
		if(choice==1) {
			shape=new Rectangle("red");
		}else if (choice==2) {
			shape=new Tringle("red");
		}else {
			shape=new Circle("red");
		}
		
		shape.calArea();
	}
}











