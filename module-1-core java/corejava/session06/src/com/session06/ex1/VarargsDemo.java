package com.session06.ex1;
//OCP
class Cal{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add(int ...a) {
		System.out.println("public int add(int ...a)");
		int sum=0;
		for(int temp: a) {
			sum+=temp;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
		Cal cal=new Cal();
		System.out.println(cal.add(4,6,7,8,99));
	}
}
