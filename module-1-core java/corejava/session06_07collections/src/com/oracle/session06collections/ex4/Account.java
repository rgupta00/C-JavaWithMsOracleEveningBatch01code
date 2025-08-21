package com.oracle.session06collections.ex4;

import java.util.Objects;

public class Account implements Comparable<Account>{

	private int id;
	private String name;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Account() {}
	
	public void print() {
		System.out.println("id : "+ id +" name: "+ name+"balance : "+balance);
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	//contract bw eq and hashcode, why is hasing and why we need it
	//listen 1 video https://www.youtube.com/watch?v=o1_e95-mY8o&list=PLv2-IhRmhbyQK19NcFRRJbK9Xf2YX_BgW&index=5&t=23s
	//listen 2 video https://www.youtube.com/watch?v=mFY0J5W8Udk&t=885s
	
	//what is hasing
	//There is a contract bw eq and hashcode
	//if 2 object are same then there hashcode must be same
	//if 2 ob have eq hashcode then they may be same many not be same
	
	//some ds: HashMap, Hashset
	
	@Override
	public int hashCode() {
		return Objects.hash(balance, id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance) && id == other.id
				&& Objects.equals(name, other.name);
	}
	//Natual sort
	@Override
	public int compareTo(Account a) {
		// Logic, i need to teach java how to sort accuonts object
		return Integer.compare(this.id, a.id);
	}
	
	
	
}
