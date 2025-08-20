package com.oracle.session06collections.ex2;

public class Main {

	public static void main(String[] args){
		
		try {
			Account account=new Account(1, "raj", 50000);
			System.out.println(account);
			
			account.withdraw(4500);
			System.out.println("withdraw is successful");
			System.out.println(account);
			
			account.deposit(700000);
			
		} catch(OverFundException e) {
//			e.printStackTrace(); 
			//logging: log4j*
			System.out.println(e.getMessage());
		}
		catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}
	}
}
