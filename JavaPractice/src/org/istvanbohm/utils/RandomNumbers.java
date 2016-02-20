package org.istvanbohm.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {	
	
	/*	Generate random numbers
	 * 	The min and max values are inclusive too.
	 */
	
	public static int getRandomInteger(int min, int max, long seed) {
		// we get the same numbers with the same seed
		Random rg = new Random(seed);
		return rg.nextInt(max-min+1)+min;
	}
	
	public static int getRandomInteger(int min, int max) {
		Random rg = new Random();
		return rg.nextInt(max-min+1)+min;
	}
	
	
	public static int getRandomIntegerJava7Plus(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min,max+1);
	}
	
	
	public static void main(String[] args) {
		for(int i=0;i<20;++i)
		System.out.println(getRandomInteger(5,10) + " ");
	}

}
