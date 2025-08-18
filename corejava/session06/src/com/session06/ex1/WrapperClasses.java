package com.session06.ex1;
import java.util.*;
public class WrapperClasses {

	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<>();
//		list.add(55);
//		
		
		
		
//		//java 1.4
//	
		//what is the problem if u want to 
		//manipuate wrapper classe in java 1.4
		
		
//		int i=66;
//		Integer it=new Integer(i);
//
//		int temp=it.intValue();
//		temp++;
//		it=new Integer(temp);
		
//		int i=66;
//		Integer it=i;
//		i++;
		
		
		//java 5 have improved the wrapper classes
		//auto boxing and unboxing
		
//		int i=66;
//		Integer it=i;
//		it++;
		
		int i=129;
		//-127 to +128
		
		Integer it1=i;
		Integer it2=i;
		System.out.println(it1==it2);
		
	}
}
