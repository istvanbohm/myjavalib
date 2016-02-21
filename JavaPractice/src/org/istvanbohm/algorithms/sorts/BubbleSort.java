package org.istvanbohm.algorithms.sorts;

public class BubbleSort {

	public static void sort(int[] arr) {
		
		for(int j=arr.length-1;j>0;--j) 
		{
			for(int i=0;i<j;++i) {
				if(arr[i+1]<arr[i]) {
					swap(arr,i,i+1);
				}
			}
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
		BubbleSort.sort(arr);
		Helper.print(arr);
	}

}
