package com.oracle.training.session1;

public class DateProblem {

	public static void main(String[] args) {
		int dd = 31, mm = 12, yyyy = 2025;
		System.out.println("dd/mm/yyyy:" + dd + "/" + mm + "/" + yyyy);

		// logic for leap year
		// logic for finding days in a months
		dd = dd + 1;
		if (dd > daysInMonth(mm, yyyy)) {
			dd = 1;
			mm = mm + 1;
			if (mm > 12) {
				mm = 1;
				yyyy++;
			}
		}

		System.out.println("dd/mm/yyyy:" + dd + "/" + mm + "/" + yyyy);

	}

	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true;
		else
			return false;
	}

	// stateless ness vs stateful
	// 2 2025
	public static int daysInMonth(int month, int year) {
		// noOfDaysInMonthArr[1]
		int noOfDaysInMonthArr[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeapYear(year)) {
			noOfDaysInMonthArr[2] = 29;
		}

		return noOfDaysInMonthArr[month];

	}
}
