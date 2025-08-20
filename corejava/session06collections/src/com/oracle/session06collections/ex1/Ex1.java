package com.oracle.session06collections.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("START");
		
		//Arm : automatic resurce mgt 1.7
		//JVM is rep for closing the res not the programming :)
		//programm need to use some special sy
		
		try(Scanner scanner=new Scanner(System.in)) {
			int x, y, z;
			System.out.println("PE two numbers to divide");
			x=scanner.nextInt();
			y=scanner.nextInt();
			z=x/y;
			System.out.println("result is :" + z);
		}
		
		catch(ArithmeticException ex) {
			System.out.println("divide by zero");
		}
		catch(InputMismatchException ex) {
			System.out.println("some bad input");
		}
		catch(Exception ex) {
			System.out.println("some other problem");
		}

		
		
		
		
		
//		Scanner scanner=null;
//		try {
//			 scanner=new Scanner(System.in);// memory leak?
//			int x, y, z;
//			System.out.println("PE two numbers to divide");
//			x=scanner.nextInt();
//			y=scanner.nextInt();
//			z=x/y;
//			System.out.println("result is :" + z);
//		}
//		
//		catch(ArithmeticException ex) {
//			System.out.println("divide by zero");
//		}
//		catch(InputMismatchException ex) {
//			System.out.println("some bad input");
//		}
//		catch(Exception ex) {
//			System.out.println("some other problem");
//		}finally {
//			scanner.close();
//		}

		
		System.out.println("END");
		
	}
}
