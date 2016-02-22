package org.istvanbohm.algorithms.sorts;

public class InsertionShort {

	public static void sort(int[] arr) {
		for(int j=0;j<arr.length-1;++j) {
			int curr = arr[j+1];
			int i = j;
			while(i>=0 && arr[i]>curr) {
				arr[i+1]=arr[i];
				--i;
			}
			arr[i+1] = curr;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = Helper.getArr(20, 20);
		Helper.print(arr);
		InsertionShort.sort(arr);
		Helper.print(arr);
	}

}
