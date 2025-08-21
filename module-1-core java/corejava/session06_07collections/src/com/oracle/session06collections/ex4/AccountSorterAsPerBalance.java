package com.oracle.session06collections.ex4;

import java.util.Comparator;

public class AccountSorterAsPerBalance implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return Double.compare(o2.getBalance(), o1.getBalance());
	}

}
