package com.session3.ex2;
class Cal{
	public long add(int a, long b) {
		System.out.println("public int add(int a, long b)");
		return a+b;
	}
	public long add(long a, int b) {
		System.out.println("public int add(long a, int b)");
		return a+b;
	}
//	public int add(int a, int b, int c) {
//		System.out.println("public int add(int a, int b, int c)");
//		return a+b+c;
//	}
}
public class A_FunctionOverloading {
	public static void main(String[] args) {
		Cal c=new Cal();
		System.out.println(c.add(2, (long)1));
	}
}
