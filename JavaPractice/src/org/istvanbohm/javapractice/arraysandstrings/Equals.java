package org.istvanbohm.javapractice.arraysandstrings;

public class Equals {
	public static void main(String[] args) {
		String a = new String("asd");
		String b = new String("asd");
		
		if(a==b) {
			System.out.println("a==b");
		} else {
			System.out.println("a!=b");
		}
		
		if(a.equals(b)) {
			System.out.println("a equals b");
		} else {
			System.out.println("a doesn't equal b");
		}
			
	}
}
