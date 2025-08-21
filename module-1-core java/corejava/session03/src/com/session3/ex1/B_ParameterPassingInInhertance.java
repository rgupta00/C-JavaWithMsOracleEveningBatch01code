package com.session3.ex1;
class A{
	private int i;
	
	public A(int i) {
		this.i=i;
	}
	public void print() {
		System.out.println("i: "+ i);
	}
}
class B extends A{
	private int j;
	
	public B(int i, int j) {
		super(i);
		this.j=j;
	}
	public void print() {
		super.print();// drived class can reuse the logic of base class
		System.out.println("j: "+ j);
	}
}
public class B_ParameterPassingInInhertance {
	public static void main(String[] args) {
		B b=new B(2,5);
		b.print();
	}
}
