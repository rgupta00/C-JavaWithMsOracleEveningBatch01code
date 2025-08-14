package com.day1.assignment3;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {4,6,78,90};
		
		int copyArr[]=copyOf(arr);
		copyArr[0]=8888;
		
		for(int temp: arr) {
			System.out.println(temp);
		}
		
	}

	private static int[] copyOf(int[] arr) {
		//return arr;
		return  Arrays.copyOf(arr, arr.length);
	}
}
