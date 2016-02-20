package org.istvanbohm.tests;



public class Test2 {

	public static void main(String[] args) {
       int i = -8;
       System.out.println(Integer.toBinaryString(i));
       System.out.println(Integer.toBinaryString(i >> 1));
       System.out.println(Integer.toBinaryString(i >>> 1));
       System.out.println(Integer.toBinaryString(i >>> 2));
       System.out.println(i >>> 30);
	}

}
