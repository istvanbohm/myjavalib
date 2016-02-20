package org.istvanbohm.assertation;

public class Teszt {

	static int i=5;
	
	public static int valueofI() {
		return i++;
	}
	
	public static void something() {
		assert i>10 : ++i;
	}
	
	
	public static void main(String[] args) {
		try {
			something();
		} catch(Error ex) {
			System.out.println("mehh :");
		}
		
		int i=5,j=8;
		j=j|(i++&13);
		System.out.println(i);
		System.out.println(j);
	}
	
	
}
