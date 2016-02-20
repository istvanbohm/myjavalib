package org.istvanbohm.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

class Element {
	int val;
	char c;
	
	public Element() {
		val = ThreadLocalRandom.current().nextInt(0,6);
		int t = ThreadLocalRandom.current().nextInt(0,26);
		c = (char) (t + (int)'a');
	}
	
	public String toString() {
		return c + " " + val;
	}

	@Override
	public boolean equals(Object o) {
		Element other = (Element) o;
		return val==other.val && c == other.c;
	}
	
	@Override
	public int hashCode() {
		return Character.hashCode(c);
	}
}

public class SortingPractice {
	
	public static ArrayList<Element> getArrayList(int size) {
		ArrayList<Element> res = new ArrayList<Element>();
		for(int i=0;i<size;++i) {
			res.add(new Element());
		}
		return res;
	}
	
	public static void print(ArrayList<Element> list) {
		for(Element e : list) System.out.print("[" + e + "] ");
		System.out.println("");
	}
	
	public static void sortByChar(ArrayList<Element> list) {
		Collections.sort(list,new Comparator<Element>() {
			public int compare(Element one, Element two) {
				return Character.compare(one.c,two.c);
			}
		});
	}
	
	public static void sortByVal(ArrayList<Element> list) {
		Collections.sort(list,new Comparator<Element>() {
			public int compare(Element one, Element two) {
				return Integer.compare(one.val,two.val);
			}
		});
	}
	
	
	public static void main(String[] args) {
		ArrayList<Element> list = getArrayList(10);
		print(list);
		sortByChar(list);
		print(list);
		sortByVal(list);
		print(list);
	}

}
