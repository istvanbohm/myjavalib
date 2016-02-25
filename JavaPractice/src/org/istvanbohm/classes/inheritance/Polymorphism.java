package org.istvanbohm.classes.inheritance;

class A {
	public A() {
		System.out.println("Constructor - A");
	}
	
	public void run() {
		System.out.println("Run - A");
	}
	
	public void m1() {
		
	}
}

class B extends A {
	public B() {
		System.out.println("Constructor - B");
	}
	
	public void run() {
		System.out.println("Run - B");
	}
	
	public void m2() {
		
	}
}



public class Polymorphism {

	public static void main(String[] args) {
		A a = new A();
		a.run();
		System.out.println("-------");
		
		B b = new B();
		b.run();
		System.out.println("-------");
		
		// B ba = new A(); -- Compilation error
		
		A ab = new B();
		ab.run();	// it uses the version from the Inherited class class 
		System.out.println("-------");
		
		// ab.m2(); -- Compilation error
		ab.m1(); // we can use only the methods from the Base class
		
	}

}
