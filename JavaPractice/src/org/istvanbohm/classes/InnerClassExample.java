package org.istvanbohm.classes;

@SuppressWarnings("unused")
class OuterClass {
	
	private int instancevar;
	private static int classvar;
	
	/*
	 * Non static nested class == Inner class
	 */
	
	class InnerClass {
		
		/*
		 * (!!!) The inner class has access to the outer class private members too 
		 */
		public void innerMethod() {
			++instancevar;
			++classvar;
			outerMethod();
		}
		
		/*
		 * (!!!) The inner class can't have static methods, 
		 * because it has access to the instance variables of the outer class
		 */
		
	}
	
	public void outerMethod() {
		++instancevar;
		++classvar;
		
		// Instantiate from the outer class
		InnerClass inner = new InnerClass();
	}
	
}

@SuppressWarnings("unused")
public class InnerClassExample {

	public static void main(String[] args) {
		
		// Instantiate from the outside of the outer class

		// Long version
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass longInstantiation = outer.new InnerClass();
		
		// Short version
		OuterClass.InnerClass shortInstantiation = new OuterClass().new InnerClass();
		
	}
	
}
