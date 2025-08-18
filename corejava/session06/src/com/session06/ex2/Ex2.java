package com.session06.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("START");
		
		try {
			Scanner scanner=new Scanner(System.in);// memory leak?
			int x, y, z;
			System.out.println("PE two numbers to divide");
			x=scanner.nextInt();
			y=scanner.nextInt();
			z=x/y;
			System.out.println("result is :" + z);
			
			
		}
		//these ex are unchecked 
		catch(ArithmeticException ex) {
			System.out.println("dont do divide by zero");
		}
		catch(InputMismatchException ex) {
			System.out.println("only enter integers");
		}
		
		System.out.println("END");
	}
}
