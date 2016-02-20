package org.istvanbohm.collections;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ListPractice {

	class MyItem implements Comparable<MyItem> {
		private String name;
		private int size;
		
		public MyItem(String name,int size) {
			this.name = name;
			this.size = size;
		}
		
		public int compareTo(MyItem other) {
			return name.compareTo(other.name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
	}
	
	class MyItemSizeCompare implements Comparator<MyItem> {
		public int compare(MyItem one,MyItem two) {
			return Integer.compare(one.size,two.size);
		}
	}
	
	private LinkedList<MyItem> myList = new LinkedList<MyItem>();
	
	public ListPractice() {
		buildList();
	}
	
	private void buildList() {
		int size = 10;
		int maxval = 10;
		for(int i=0;i<size;++i) {
			int itemSize = ThreadLocalRandom.current().nextInt(maxval);
			String itemName = getRandomWord();
			myList.add(new MyItem(itemName,itemSize));
		}
	}
	
	private String getRandomWord() {
		String[] words = {"eph","kruger","trient","barbell","ozs","zeroing","cobra","apteria","blouse","tenter"};
		Random rg = new Random();
		int i = ThreadLocalRandom.current().nextInt(0,words.length);
		return words[i];
	}
	
	private void printList() {
		StringBuilder sb = new StringBuilder();
		for(MyItem item : myList) {
			sb.append("[n:" + item.name + " s:" + item.size + "] ");
		}
		sb.append('\n');
		System.out.println(sb);
	}
	
	public void sortListByItemSize() {
		MyItemSizeCompare itemSizeCompare = new MyItemSizeCompare();
		Collections.sort(myList,itemSizeCompare);
	}
	
	public void sortListByItemName() {
		Collections.sort(myList,new Comparator<MyItem>() {
			public int compare(MyItem one,MyItem two) {
				return one.name.compareTo(two.name);
			}
		});
	}
	
	
	public static void main(String[] args) {
		ListPractice myPractice = new ListPractice();
		myPractice.printList();
		myPractice.sortListByItemSize();
		myPractice.printList();
		myPractice.sortListByItemName();
		myPractice.printList();
	}
	
}
