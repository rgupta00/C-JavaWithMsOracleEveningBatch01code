package com.oracle.session06collections.ex4;

import java.util.*;

import javax.xml.validation.Validator;

public class Ex3Map {
	
	public static void main(String[] args) {
		//assiciated array in python => map K--> v
		//student name ==> marks
		//K v may have any data type ( it should not be private)
		//user -> cookies
		// string -> string
		//customer --> order info
		//customer object --> list of order
		//Hashtable vs HashMap
		//syn poor performance vs HashMap better perforamce
		//dont allow key as null		null key is allowd
		
		Map<String, Integer> map=new HashMap<>();
		map.put("raj", 89);
		map.put("gunika", 99);
		map.put("ekta", 59);
		map.put("keshav", 77);
		map.put("gunika", 100);
		map.put(null, 65);
		
		Set<String> keySet = map.keySet();
		for(String key: keySet) {
			System.out.println(key +" : "+ map.get(key));
		}
		
//		System.out.println(map);
		
		
	}

}
