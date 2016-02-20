package org.istvanbohm.algorithms;

import java.util.Random;

public class PrintArr {
	
	
	public static void print(int[] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	public static void print(int[] arr,int from, int to) {
		if(from>=to || to>=arr.length) {
			System.out.println("ARR INDEX HIBA" + from + " " + to);
		}
		for(int i=from;i<=to;++i) {
			System.out.print("(" + i + "," + arr[i] + ") ");
		}
		System.out.println("");
	}
	
	public static int[] getArr(int size) {
		Random rg = new Random();
		int arr[] = new int[size];
		for(int i=0;i<size;++i) {
			arr[i] = rg.nextInt(10);
		}
		return arr;
	}
}
