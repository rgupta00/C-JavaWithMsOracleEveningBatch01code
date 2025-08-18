package com.session06.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//java collection : set dont allow duplate 
import java.util.*;

public class Ex5 {

	public static void main(String[] args)/* throws FileNotFoundException */ {
		// File handling=> design pattern => decorator design pattern
		// learning basics -> design pattern --> then learn programming once for ever!

		// System.out.println("START");
		
		//ARM automatic resouce manamgent
		
		
		Set<String> words = new TreeSet<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("demo.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					words.add(token.toLowerCase());
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException ex) {
			System.out.println("some other issue");
		} catch (Exception ex) {
			System.out.println("ex");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("clean up code");
			}
		}

		// print the set
		for (String word : words) {
			System.out.println(word);
		}

		// System.out.println("END");

	}
}
