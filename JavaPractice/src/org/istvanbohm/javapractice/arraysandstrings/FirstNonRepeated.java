package org.istvanbohm.javapractice.arraysandstrings;

import java.util.HashMap;

public class FirstNonRepeated {

	// ASCII VERSION
	public static char findFirstNonRepeatedV1(String s) {
		int tmp[] = new int[256];
		
		// Count the character occurrences 
		try {
			for(char c : s.toCharArray()) {
				System.out.println(c + " " + (int)c);
				tmp[c]+=1;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + s + " is not an ASCII string.");
			return (char)0;
		}
		
		// Find the first non repeated.
		for(char c : s.toCharArray()) {
			if(tmp[c]==1) {
				return c;
			}
		}
		
		// There is no non repeated character
		return 0;
	}
	
	// NOT CASE SENSITIVE
	public static char findFirstNonRepeatedV2(String s) {
		return findFirstNonRepeatedV1(s.toLowerCase());
	}

	// HASH TABLE FOR UNICODE 
	public static char findFirstNonRepeatedV3(String s) {
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		
		// Count the character occurrences 
		for(char ch:s.toCharArray()) {
			m.put(ch,m.containsKey(ch)?m.get(ch)+1:1);
		}
		
		// Find the first non repeated.
		for(char ch:s.toCharArray()) {
			if(m.get(ch)==1) return ch;
		}
		
		// There is no non repeated character
		return 0;
	}
	
	
	// HASH TABLE FOR UNICODE, BETTER VERSION
	public static char findFirstNonRepeatedV4(String s) {
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		
		Integer one = 1;
		Integer more = 2;
		
		// Count the character occurrences 
		for(char ch:s.toCharArray()) {
			m.put(ch,m.containsKey(ch)?more:one);
		}
		
		// Find the first non repeated.
		for(char ch:s.toCharArray()) {
			if(m.get(ch)==one) return ch;
		}
		
		// There is no non repeated character
		return 0;
	}
	
	
	public static void main(String[] args) {
		char c = findFirstNonRepeatedV3("interview");
		System.out.println(c);
	}

}
