package org.istvanbohm.datastructures.linkedlist;

public class SimpleLinkedList {
	
	class Node {
		int val;
		Node next;
		
		public Node(int v) {
			val = v;
		}
	}

	Node head = new Node(0);
	Node current;
	
	public void first() throws Exception {
		if(head.next==null) throw new Exception("Error, the list is empty.");
		else current=head.next;
	}
	
	public void next() throws Exception {
		if(current==null) throw new Exception("Error, there is no current item.");
		if(current.next==null) throw new Exception("Error, there is no next item.");
		current=current.next;
	}
	
	public int getCurrentVal() throws Exception {
		if(current==null || current == head) throw new Exception("Error, there is no current item.");
		else return current.val;
	}
	
	public void appendToEnd(int v) {
		Node i = head;
		while(i.next!=null) i=i.next;
		i.next = new Node(v);
	}
	
	public void appendToCurrent(int v) throws Exception {
		if(current==null) throw new Exception("Error, there is no current item.");
		Node n = new Node(v);
		n.next = current.next;
		current.next=n;
	}
	
	public void deleteCurrent() throws Exception {
		if(current==null) throw new Exception("Error, there is no current item.");
		else {
			if(current.next!=null) {
				// the current item is not the last one
				current.val = current.next.val;
				current.next = current.next.next;
			} else {
				// the current item is the last one
				Node i = head;
				while(i.next!=current) i=i.next;
				i.next = null;
				current = null;
			}
		}
	}
	
	public boolean isEmpty() {
		return head.next==null;
	}
	
	public boolean isCurrentNull() {
		return current==null;
	}
	
	public boolean isCurrentLast() throws Exception {
		if(current==null) throw new Exception("Error, there is no current item.");
		return current.next == null;
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		Node i = head.next;
		while(i!=null) {
			
			if(i==current) b.append("[" + i.val + "]" + " ");
			else b.append(i.val + " ");
			i=i.next;
		}
		return b.toString();
	}
	
	public static void main(String[] args) throws Exception {
		SimpleLinkedList list = new SimpleLinkedList();
		list.appendToEnd(4);
		list.appendToEnd(5);
		list.appendToEnd(7);
		list.appendToEnd(6);
		list.appendToEnd(3);
		System.out.println("The list: " + list.toString());
		list.first();
		System.out.println("Select the first item of the list: " + list.toString());
		System.out.println("The current item value: " + list.getCurrentVal());
		list.deleteCurrent();
		System.out.println("After deleting the current item: " + list.toString());
		System.out.println("The new current item value: " + list.getCurrentVal());
		list.next();
		System.out.println("Next item: " + list.toString());
		list.next();
		System.out.println("Next item: " + list.toString());
		list.deleteCurrent();
		System.out.println("After deleting the current item: " + list.toString());
		list.deleteCurrent();
		System.out.println("After deleting the current item: " + list.toString());
		System.out.println("Is current null: " + list.isCurrentNull());
		list.first();
		System.out.println("Select the first item of the list: " + list.toString());
		 list.appendToCurrent(4);
		System.out.println("Append 4 to the current: " + list.toString());
	}
	
	
}
