package com.oracle.session06collections.ex4;

import java.util.*;

public class Ex4UserDefineCollection {
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<>();
		
		accounts.add(new Account(1, "raj", 56000.00));
		accounts.add(new Account(2, "simran", 42000.50));
		accounts.add(new Account(3, "amit", 78000.75));
		accounts.add(new Account(4, "neha", 91000.10));
		
		//print them
		System.out.println("---------account list as it is ---------");
		printAccountList(accounts);
		
		Collections.sort(accounts);
		

	}
	
	
	

	private static void printAccountList(List<Account> accounts) {
		for(Account account: accounts) {
			System.out.println(account);
		}
	}

}
