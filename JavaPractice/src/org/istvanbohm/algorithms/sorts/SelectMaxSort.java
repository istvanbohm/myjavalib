package org.istvanbohm.algorithms.sorts;

public class SelectMaxSort {

	public static void sort(int[] arr) {
		selectMaxShort(arr,0,arr.length-1);
	}
	
	private static void selectMaxShort(int[] arr,int from,int to) {
		if(to==from) return;
		int maxpoz = from;
		int max = arr[from];
		for(int i=from+1;i<=to;++i) {
			if(arr[i]>max) {
				maxpoz = i;
				max = arr[i];
			}
		}
		swap(arr,maxpoz,to);
		selectMaxShort(arr,from,to-1);
	}
	
	private static void swap(int[] arr,int left,int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = Helper.getArr(20, 20);
		Helper.print(arr);
		SelectMaxSort.sort(arr);
		Helper.print(arr);
	}

}
