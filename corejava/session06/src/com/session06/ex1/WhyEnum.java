package com.session06.ex1;
enum ShirtSize{

	SMALL(38), MEDIUM(40), LARGE(42);
	
	private int size;
	
	ShirtSize(int size){
		this.size=size;
	}

	public int getSize() {
		return size;
	}
	
}
class Shirt{
	private String color;
	private ShirtSize size;
	public Shirt(String color, ShirtSize size) {
		super();
		this.color = color;
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ShirtSize getSize() {
		return size;
	}
	public void setSize(ShirtSize size) {
		this.size = size;
	}
	
	public void print() {
		System.out.println("color: "+ color +" size "+ size);
	}
}
public class WhyEnum {

	public static void main(String[] args) {
		//40 42 44
		Shirt shirt=new Shirt("red", ShirtSize.LARGE);
		shirt.print();
		ShirtSize shirtSize=ShirtSize.MEDIUM;
		System.out.println(shirtSize.getSize());
	}
}



