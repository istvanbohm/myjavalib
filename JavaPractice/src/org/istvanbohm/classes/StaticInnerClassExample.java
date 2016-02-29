package org.istvanbohm.classes;

@SuppressWarnings("unused")
class OuterClass2 {
	
	private int instancevar;
	private static int classvar;
	
	
	/*
	 * Non static nested class == Inner class
	 */
	
	static class StaticInnerClass {
		
		/*
		 * (!!!) The static-nested class has access to the outer class private static members too
		 * (!!!) But only its static members 
		 */
		public void innerMethod() {
			++classvar;
			staticOuterMethod();
		}
		
		/*
		 * It can have static members too
		 */
		public static void innerStaticMethod() {
			++classvar;
			staticOuterMethod();
		}
		
		
	}
	
	public void outerMethod() {
		++instancevar;
		++classvar;
		
		// Instantiate from the outer class
		OuterClass2 inner = new OuterClass2();
	}
	
	public static void staticOuterMethod() {
		// Instantiate from the outer class
		OuterClass2 inner = new OuterClass2();
	}
	
}

@SuppressWarnings("unused")
public class StaticInnerClassExample {

	public static void main(String[] args) {
		
		// Instantiate from the outside of the outer class
		OuterClass2.StaticInnerClass instantiation = new OuterClass2.StaticInnerClass();
		
	}
	
}
