package org.istvanbohm.bitmanipulation;

public class CountOnes {

	public static void ones(int num) {
		System.out.println("Count ones in: " + Integer.toBinaryString(num));
		
		int ones = 0;
		while(num>0) {
			ones += num & 1;
			num = num >> 1;
		}
		
		System.out.println("Ones: " + ones);
	}
	
	
	public static void main(String[] args) {
		ones(20);
		
	}

}
