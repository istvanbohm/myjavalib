package org.istvanbohm.datastructures.stack;



public class Stack {
	
	public class StackException extends Exception {
		public StackException(String msg) {
			super(msg);
		}
	}
	
	private int[] arr;
	private int i = -1;
	
	public Stack(int size) throws StackException {
		if(size<1) throw new StackException("Error, the stack size can't be less than 1.");
		arr = new int[size];
	}
	
	public void push(int num) throws StackException {
		if(isFull()) throw new StackException("Error, the stack is full.");
		arr[++i] = num;
	}
	
	public int pop() throws StackException {
		if(isEmpty()) throw new StackException("Error, the stack is empty.");
		return arr[i--];
	}
	
	public int top() throws StackException {
		if(isEmpty()) throw new StackException("Error, the stack is empty.");
		return arr[i];
	}
	
	public boolean isEmpty() {
		return i==-1;
	}
	
	public boolean isFull() {
		return i==arr.length-1;
	}

}
