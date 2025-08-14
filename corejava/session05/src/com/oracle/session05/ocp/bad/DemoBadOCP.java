package com.oracle.session05.ocp.bad;

/*
 * Open–Closed Principle (OCP) states that:

Software entities (classes, modules, functions) should be open for extension but closed for modification.

Meaning:

You should be able to add new features or behavior to a class without changing its existing code.

Achieved by using abstraction, interfaces, and polymorphism instead of altering existing logic.

Reduces risk of introducing bugs in tested code.
 */
class Square{
	public void drawSquare() {
		System.out.println("drawing sq");
	}
}
class Rectangle{
	public void drawRectangle() {
		System.out.println("drawing Rectangle");
	}
}
class Triangle{
	public void drawTriangle() {
		System.out.println("drawing Triangle");
	}
}
class Circle{
	public void drawSquare() {
		System.out.println("drawing Circle");
	}
}
//i change this class whenever i need to add new funcation... never stable not easily tastable :(
class DrawShape{
	
	public void draw(Object object) {
		if(object instanceof Square) {
			((Square) object).drawSquare();
		}
		else if(object instanceof Triangle) {
			((Triangle) object).drawTriangle();
		}
		else if(object instanceof Circle) {
			((Circle) object).drawSquare();
			
		}else if(object instanceof Rectangle) {
			((Rectangle) object).drawRectangle();
		}
	}
}

public class DemoBadOCP {

	public static void main(String[] args) {
		Object object=new Triangle();
		DrawShape drawShape=new DrawShape();
		drawShape.draw(object);
		
	}

}
