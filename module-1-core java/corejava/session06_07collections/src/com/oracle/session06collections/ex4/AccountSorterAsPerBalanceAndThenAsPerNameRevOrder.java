package com.oracle.session06collections.ex4;

import java.util.Comparator;

public class AccountSorterAsPerBalanceAndThenAsPerNameRevOrder implements Comparator<Account>{

	//if balance is same if someone have name with bigger ascii value must come one the req
	@Override
	public int compare(Account o1, Account o2) {
		int value=Double.compare(o2.getBalance(), o1.getBalance());
		if(value==0) {
			value=o2.getName().compareTo(o1.getName());
		}
		return value;
	}

}
