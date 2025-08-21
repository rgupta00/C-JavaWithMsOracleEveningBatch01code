package com.oracle.session02;

public class DemoAccount {

	public static void main(String[] args) {
		System.out.println("main of DemoAccount");
		Account account=new Account("raj",7000);
		account.print();
		
		Account account2=new Account("gunika",7080);
		// this : special ref that is pass implicility in a method call
		account2.print();
		
		//System.out.println(account.getCounter());
		System.out.println(Account.getCounter());
		
	}
}
