package org.istvanbohm.bitmanipulation;

public class MultiplyBy2 {

	public static void run(int num) {
		Helper.printNum(num);
		System.out.println("I'm multipling by 2...");
		Helper.printNum(num<<1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(50);
	}

}
