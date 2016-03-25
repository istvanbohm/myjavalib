package org.istvanbohm.tests;

public class Test4 {


		static class Nested {}
		class Inner {}
		void method() { new Nested(); new Inner(); }
		
		
		static void staticMethod() { new Nested();  }
		
}
