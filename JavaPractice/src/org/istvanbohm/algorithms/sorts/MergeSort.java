package org.istvanbohm.algorithms.sorts;

public class MergeSort {

	public static void sort(int[] arr) {
		mergesort(arr,0,arr.length-1);
	}
	
	private static void mergesort(int[] arr,int from, int to) {
		if(to<=from) return;
		int split = (from+to)/2;
		mergesort(arr,from,split);
		mergesort(arr,split+1,to);
		merge(arr,from,split,to);
	}
	
	private static void merge(int[] arr,int from, int split, int to) {
		int i=from, j=split+1;
		while(i<j) {
			if(arr[i]>arr[j]) {
				swap(arr,i,j);
				bringPlace(arr,j,to);
			}
			++i;
		}
	}
	
	private static void bringPlace(int[] arr,int poz,int to) {
		for(int i=poz;i<to && arr[i]>arr[i+1];++i) {
			swap(arr,i,i+1);
		}
	}
	
	private static void swap(int[] arr,int left,int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = Helper.getArr(20, 20);
		Helper.print(arr);
		MergeSort.sort(arr);
		Helper.print(arr);
	}

}
