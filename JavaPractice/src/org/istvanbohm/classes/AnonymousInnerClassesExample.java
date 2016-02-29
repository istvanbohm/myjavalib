package org.istvanbohm.classes;

interface SomeInterface {
	
}

class BaseClass {
	public void method() {
		System.out.println("Base");
	}
}

public class AnonymousInnerClassesExample {
	public static void main(String[] args) {
		
		/*
		 * Creating an instance of an anonymous inner class, what we inherit from the BaseClass
		 * (!!!) Pay attention: "new" + "()" + "{}" + ";"
		 * (!!!) Remember this is polymorphism too
		 */
		BaseClass var = new BaseClass() {
			public void method() {
				System.out.println("Anonymous from Class");
			}
		};
		
		/*
		 * We can implement an interface too
		 */
		Runnable var2 = new Runnable() {
			public void run() {
				System.out.println("Anonymous from Interface");
			}
		};
		
		/*
		 * If we want to use a new method
		 */
		new BaseClass() {
			public void newMethod() {
				System.out.println("Hello world!");
			}
		}.newMethod();
		
		
		/* 
		 * Argument-Defined Anonymous Inner Class example
		 * We can create an anonymous inner class as an argument
		 * (!!!) Pay attention: "});" instead of "};);"
		 */
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello world!");
			}
		});
		
		/*
		 * (!!!) An anonymous inner class can extend ONE(!) subclass OR(!) implement ONE(!) interface.
		 */
		
		var.method();
		var2.run();
	}
}
