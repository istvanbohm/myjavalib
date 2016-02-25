package org.istvanbohm.bitmanipulation;

public class PowerOf2 {

	public static boolean isPowerOf2(int num) {
		if((num & (num-1)) == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int numb = 64;
		Helper.printNum(numb);
		System.out.print("Power of 2: ");
		if(isPowerOf2(numb)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
