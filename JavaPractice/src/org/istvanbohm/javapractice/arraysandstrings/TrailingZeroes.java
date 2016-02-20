package org.istvanbohm.javapractice.arraysandstrings;

public class TrailingZeroes {

	
	public static int trailingZeroes(int fact) {
		if(fact < 1) return -1;
		
		int result = 0;
		
		
		int i=0; 
		int fives = 0;
		int nextstep = 5;
		while(i<=fact) {
			if(i==nextstep) {
				++fives;
				nextstep*=5;
			}
			result+=fives; 
			i+=5;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6250;
		System.out.println(trailingZeroes(x));
	}

}
