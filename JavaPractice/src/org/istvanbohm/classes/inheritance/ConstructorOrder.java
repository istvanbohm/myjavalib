package org.istvanbohm.classes.inheritance;

class Base {
	public Base() {
		System.out.println("Base constructor");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived constructor");
	}
}

public class ConstructorOrder {	
	public static void main(String[] args) {
		// Hint: Base class first 
		Derived d = new Derived();
	}
}
