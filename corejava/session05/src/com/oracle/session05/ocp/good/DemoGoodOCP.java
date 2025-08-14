package com.oracle.session05.ocp.good;

/*
 * Open–Closed Principle (OCP) states that:

Software entities (classes, modules, functions) should be open for extension but closed for modification.

Meaning:

You should be able to add new features or behavior to a class without changing its existing code.

Achieved by using abstraction, interfaces, and polymorphism instead of altering existing logic.

Reduces risk of introducing bugs in tested code.
 */
interface Shape{
	public void draw();
}
class Square implements Shape{
	public void draw() {
		System.out.println("drawing sq");
	}
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("drawing Rectangle");
	}
}
class Triangle implements Shape{
	public void draw() {
		System.out.println("drawing Triangle");
	}
}
class Circle implements Shape{
	public void draw() {
		System.out.println("drawing Circle");
	}
}
class Pantagen implements Shape{
	public void draw() {
		System.out.println("drawing Pantagen");
	}
}

//i change this class whenever i need to add new funcation...
//never stable not easily tastable :(
//OCP
final class DrawShape{
	public void draw(Shape shape) {
		shape.draw();
	}
}

public class DemoGoodOCP {

	public static void main(String[] args) {
		Shape shape=new Pantagen();
		DrawShape drawShape=new DrawShape();
		drawShape.draw(shape);
		
	}

}
