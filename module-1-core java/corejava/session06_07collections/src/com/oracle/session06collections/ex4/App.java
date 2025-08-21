package com.oracle.session06collections.ex4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//performance diff bw     arraylist 			vs 		linkedlist
//						growable array					DLL
//					random search o(1)					o(n)
///				add/del		o(n)						o(1)

//Time taken: 1438 ms for ArrayList
//Time taken: 4 ms for LinkedList
public class App {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		//doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();

		/*
		 * // Add items at end of list for(int i=0; i<1E5; i++) { list.add(i); }
		 */

		// Add items elsewhere in list
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}
