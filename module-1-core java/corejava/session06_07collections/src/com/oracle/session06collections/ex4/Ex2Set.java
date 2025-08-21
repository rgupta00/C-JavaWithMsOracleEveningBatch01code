package com.oracle.session06collections.ex4;
import java.util.*;
public class Ex2Set {
	public static void main(String[] args) {
		
		Set<Integer> set=new TreeSet<>();//HashSet vs LinkedHashSet vs TreeSet
		set.add(5);
		set.add(75);
		set.add(509);
		set.add(509);
		set.add(599);
		
		System.out.println(set);
		
		
	}

}
