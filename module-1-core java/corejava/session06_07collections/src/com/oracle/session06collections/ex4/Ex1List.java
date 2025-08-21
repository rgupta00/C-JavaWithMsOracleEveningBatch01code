package com.oracle.session06collections.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex1List {

	public static void main(String[] args) {
//		Car car=new Car()
//		Vehical v=new Car();
		List<Integer> list = new LinkedList<>();// growable array
		list.add(666);
		list.add(7);
		list.add(87);
		list.add(70);

		list.add(667);
		list.add(709);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//Binary search vs linerar search
		int pos=Collections.binarySearch(list, 7);
		System.out.println(pos);
		

		// System.out.println(list);---> iterator
//		for(Integer a: list) {
//			System.out.println(a);

	// Iterator, ListIterator, Enumerator

//		Iterator<Integer> itr=list.iterator();
//		//allow to iterator the list and to mutate it
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			//itr.remove();
//		}

	}
}
