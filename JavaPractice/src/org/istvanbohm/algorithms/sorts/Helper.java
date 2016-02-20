package org.istvanbohm.algorithms.sorts;

import java.util.Random;

public class Helper {
	
	public static void print(int[] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	public static void print(int[] arr,int u, int v) {
		for(int i=u;i<=v;++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void print(int[] arr,int u, int v, int selected) {
		for(int i=u;i<=v;++i) {
			if(i==selected) {
				System.out.print("[" + arr[i] + "] ");
			} else {
				System.out.print(arr[i] + " ");
			}	
		}
		System.out.println("");
	}
	
	public static void print(int[] arr,int u, int v, int selected1,int selected2) {
		for(int i=u;i<=v;++i) {
			if(i==selected1 || i==selected2) {
				System.out.print("[" + arr[i] + "] ");
			} else {
				System.out.print(arr[i] + " ");
			}	
		}
		System.out.println("");
	}
	
	
	
	public static int[] getArr(int size,int range) {
		Random rg = new Random();
		int arr[] = new int[size];
		for(int i=0;i<size;++i) {
			arr[i] = rg.nextInt(range);
		}
		return arr;
	}
	
}
