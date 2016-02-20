package org.istvanbohm.bitmanipulation;

public class Powerof4 {

	public static boolean isPowerOf4(int num) {
		if(num<4) return false;
		
		// check if is it the power of 2
		if( (num&(num-1))!=0 ) return false; 
		
		// count the 0s after the 1
		int zeroes = 0;
		int last =  num&1;
		while(last == 0) {
			zeroes+=1;
			num = num >> 1;
			last = (byte) (num&1);
		}
		return zeroes%2==0;
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 64;
		if(isPowerOf4(x)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
