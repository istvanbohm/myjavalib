package org.istvanbohm.tricks;

public class IntegerCache {
	// http://javapapers.com/java/java-integer-cache/
	public static void main(String[] args) {
		Integer x=128, y=128;
		if(x==y) System.out.println(true);
		else System.out.println(false);
		x=127; y=127;
		if(x==y) System.out.println(true);
		else System.out.println(false);
	}
}
