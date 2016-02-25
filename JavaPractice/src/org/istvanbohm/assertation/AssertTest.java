package org.istvanbohm.assertation;

public class AssertTest {

	/*
	 * assert booleanExpression; 
	 * assert booleanExpression : errorMessage (if not true)
	 * 		-	the right side return type can't be void
	 * 		- 	the right side shouldn't have side effects
	 */
	
	private static int i=5;
	
	/*
	 * assert throws an Error if its expression is not true
	 */
	public static void test() {
		assert i>10 : "i=" + i + " is not bigger than 10.";
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch(Error ex) {
			System.out.println("Error catched: " + ex.getMessage());
		}
		
	}
	
	
}
