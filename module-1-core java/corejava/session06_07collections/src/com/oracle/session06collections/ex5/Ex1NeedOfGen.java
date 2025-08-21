package com.oracle.session06collections.ex5;
import java.util.ArrayList;
import java.util.List;
public class Ex1NeedOfGen {
	
	public static void main(String[] args) {
		
		//in java 1.5
		//compile time safty net Integer
		
		List<Integer> list=getData();
		
		Integer val=list.get(1);
		System.out.println(val);
	
		//ClassCastException
		
	}
	
	
	public static List<Integer> getData() {
		List<Integer> list=new ArrayList<>();
		list.add(55);
		list.add(555);
		return list;
	}

}
