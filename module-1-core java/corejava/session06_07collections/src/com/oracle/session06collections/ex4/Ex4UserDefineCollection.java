package com.oracle.session06collections.ex4;

import java.util.*;

public class Ex4UserDefineCollection {
	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<>();
		
		accounts.add(new Account(106, "raj", 56000.00));
		accounts.add(new Account(82, "simran", 42000.50));
		accounts.add(new Account(3, "amit", 42000.50));
		accounts.add(new Account(4000, "neha", 91000.10));
		
		//print them
		System.out.println("---------account list as it is ---------");
		printAccountList(accounts);
		//u have to help java to sort the object of accounts in to a list
		//Comparable(natual sort) and comparator(extra sort sequence)
		
		Collections.sort(accounts);
		System.out.println("---------account list sorted as per id ---------");
		printAccountList(accounts);
		
		
		Collections.sort(accounts, 
				new AccountSorterAsPerBalance());
		System.out.println("---------account list sorted as per balance ---------");
		printAccountList(accounts);
		
		//if balance is same if someone have name with bigger ascii value must come one the req

		Collections.sort(accounts,
				new AccountSorterAsPerBalanceAndThenAsPerNameRevOrder());
		
		Collections.sort(accounts, new AccountSorterAsPerBalance());
		System.out.println("---------if balance is same if someone have name with bigger ascii value must come one the req ---------");
		printAccountList(accounts);
	}
	
	
	

	private static void printAccountList(List<Account> accounts) {
		for(Account account: accounts) {
			System.out.println(account);
		}
	}

}
