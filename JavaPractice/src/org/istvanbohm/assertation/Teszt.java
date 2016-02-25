package org.istvanbohm.assertation;

public class Teszt {

	/*
	 * assert booleanExpression; 
	 * assert booleanExpression : errorMessage 
	 * 		-	the right side return type can't be void
	 * 		- 	the right side shouldn't have side effects
	 */
	
	private static int i=5;
	
	public static int valueofI() {
		return i++;
	}
	
	/*
	 * assert throws an Error if its expression is not true
	 */
	public static void something() {
		assert i>10 : ++i;
	}
	
	public static void main(String[] args) {
		try {
			something();
		} catch(Error ex) {
			System.out.println("mehh :");
		}
	}
	
	
}
