package org.istvanbohm.bitmanipulation;

public class SetBit {

	public static void fromRightTo1(int num, int k) {
		Helper.printNum(num);
		int tmp = 1<<(k-1);
		Helper.printNum(num|tmp);
	}
	
	public static void fromRightTo0(int num, int k) {
		Helper.printNum(num);
		int tmp = 1<<(k-1);
		Helper.printNum(num&~tmp);
	}
	
	
	
	
	public static void main(String[] args) {
		fromRightTo1(555,3);
		System.out.println("------------");
		fromRightTo0(559,3);
	}

}
