package org.istvanbohm.datastructures.stack;

import org.istvanbohm.datastructures.stack.Stack.StackException;
import org.istvanbohm.io.ConsoleReader;

public class TestStack {
	
	private Stack stack;
	
	public TestStack() {
		try {
			stack = new Stack(10);
		} catch (StackException e) {

		}
	}

	private void push() {
		int val = ConsoleReader.readInt("Please enter an integer", "Error, you have to enter an integer");
		try {
			stack.push(val);
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void pop() {
		try {
			int val = stack.pop();
			System.out.println("Pop " + val + " from the stack.");
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void top() {
		try {
			int val = stack.top();
			System.out.println("The top item in the stack is " + val + ".");
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void printMenu() {
		System.out.println("1) Push");
		System.out.println("2) Pop");
		System.out.println("3) Top");
		System.out.println("4) Exit");
	}
	
	public void run() {
		int menu = 0;
		do {
			printMenu();
			menu = ConsoleReader.readInt("Please select: ","Error, you have to enter an integer");
			switch(menu) {
				case 1:
					push();
					break;
				case 2:
					pop();
					break;
				case 3:
					top();
					break;
				case 4:
					// Exit
					return;
				default: 
					System.out.println("Error, you have to enter an integer between 1 and 4 inclusive.");
					break;
			}
			System.out.println();
		}while(true);
	}
	
	public static void main(String[] args) {
		TestStack test = new TestStack();
		test.run();
	}
	
}
