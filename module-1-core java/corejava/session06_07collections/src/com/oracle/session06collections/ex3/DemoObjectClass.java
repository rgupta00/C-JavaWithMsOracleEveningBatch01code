package com.oracle.session06collections.ex3;

public class DemoObjectClass {

	public static void main(String[] args) {
		Account account1=new Account(1,"Raj",7000);
		Account account2=new Account(1,"Raj",7000);
		
		if(account1.equals(account2)) {
			System.out.println("both are eq");
		}else
			System.out.println("not eq");
		//System.out.println(account);
	}
}
