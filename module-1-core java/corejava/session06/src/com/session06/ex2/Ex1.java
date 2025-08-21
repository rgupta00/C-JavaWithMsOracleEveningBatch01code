package com.session06.ex2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("START");
		Scanner scanner=new Scanner(System.in);// memory leak?
		int x, y, z;
		System.out.println("PE two numbers to divide");
		x=scanner.nextInt();
		y=scanner.nextInt();
		z=x/y;
		System.out.println("result is :" + z);
		
		System.out.println("END");
		
	}
}
