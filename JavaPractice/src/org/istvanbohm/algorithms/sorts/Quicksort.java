package org.istvanbohm.algorithms.sorts;

import org.istvanbohm.algorithms.sorts.Helper;

public class Quicksort {

	public static void sort(int[] arr) {
		quicksort(arr,0,arr.length-1);
	}
	
	private static void quicksort(int[] arr,int from, int to) {
		if(to<=from) return;
		int pivotplace = partitioning(arr,from,to);
		quicksort(arr,from,pivotplace-1);
		quicksort(arr,pivotplace+1,to);
	}
	
	private static int partitioning(int[] arr,int from, int to) {
		int i=from+1, j=to;
		int pivot = arr[from];
		while(i<=j) {
			while(i<=to && arr[i]<=pivot) ++i;
			while(j>from && arr[j]>pivot) --j;
			if(i<j) {
				swap(arr,i,j);
				++i;
				--j;
			}
		}
		--i;
		swap(arr,from,i);
		return i;
	}
	
	private static void swap(int[] arr,int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = Helper.getArr(20, 20);
		Helper.print(arr);
		Quicksort.sort(arr);
		Helper.print(arr);
	}
}
