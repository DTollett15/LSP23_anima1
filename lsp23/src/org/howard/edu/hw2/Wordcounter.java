package org.howard.edu.hw2;

/**
 * Name: Darius Tollett
 */

import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Wordcounter {
	
	static void CountWord (String filename, Map <String, Integer> words) throws FileNotFoundException {
		
		Scanner file = new Scanner (new File ("src/main/java/resources/file.txt"));
		
		while (file.hasNext()) {
						
			String word = file.next();
			Integer count = words.get(word);
			
			word = word.toLowerCase();
			
			if (word.length() <= 3) {
				continue;
			}
			
			if (count != null) {
				count++;
				words.put(word,count);
			}
				
			else {
				count = 1;
				words.put(word,count);
			}
		}
		file.close();
	}


	public static void main(String[] args) throws FileNotFoundException {
		
		Map <String,Integer> words = new HashMap <String, Integer> ();
		CountWord("src/main/java/resources/file.txt",words);
		System.out.println(words);
	}
}