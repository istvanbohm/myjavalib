package org.istvanbohm.algorithms;

public class QuickSort {

	public static void quicksort(int[] arr) {
		quicksort(arr,0,arr.length-1);
	}
	
	public static void quicksort(int[] arr,int from, int to) {
		if(from>arr.length || from>=to) return;
		int pivot = partition(arr,from,to);
		if(from<pivot) quicksort(arr,from,pivot-1);
		if(pivot<to) quicksort(arr,pivot,to);
	}
	
	private static void swap(int[] arr,int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	private static int partition(int[] arr,int from, int to) {
		System.out.println("Partitioning start");
		int i = from;
		int j = to-1;
		int pivot = arr[to];
		PrintArr.print(arr, from, to);
		while(i<j) {
			while(arr[i]<=pivot && i<j) ++i;
			while(arr[j]>pivot && i<j) --j;
			if(i<j) { 
				System.out.println("swap i:" + i + ", j:" + j);
				swap(arr,i,j);
				++i;
				--j;
				PrintArr.print(arr, from, to);
			}
		} 
		
		
		if(arr[j]<pivot) {
			System.out.println("meeehhhh");
			
		} else {
			swap(arr,j,to);
			//j++;
			//swap(arr,j,to);
		}
		
		PrintArr.print(arr, from, to);
		System.out.println("Partitioning end");
		return j;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = PrintArr.getArr(20);
		PrintArr.print(arr);
		
		quicksort(arr);
		PrintArr.print(arr);
	}

}
