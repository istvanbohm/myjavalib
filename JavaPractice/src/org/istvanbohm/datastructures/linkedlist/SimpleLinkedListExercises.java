package org.istvanbohm.datastructures.linkedlist;

public class SimpleLinkedListExercises {

	
	public static void printReversedOrder(SimpleLinkedList list) throws Exception {

		if(list.isCurrentNull()) {
			System.out.print("The list in reverse order: ");
			list.first();
			printReversedOrder(list);
			System.out.println("");
		} else  {
			int val = list.getCurrentVal();
			if (list.isCurrentLast()) {
				System.out.print(val + " ");
			} else {
				list.next();
				printReversedOrder(list);
				System.out.print(val + " ");
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		SimpleLinkedList list = new SimpleLinkedList();
		list.appendToEnd(4);
		list.appendToEnd(5);
		list.appendToEnd(7);
		list.appendToEnd(6);
		list.appendToEnd(3);
		System.out.println("The list: " + list.toString());
		printReversedOrder(list);
	}

}
