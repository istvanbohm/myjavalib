package org.istvanbohm.classes.inheritance;

class Class1 {
	String name;
	
	public Class1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name!=null?name:"nameless";
	}
	
	public void m(){
		System.out.println("Class1(" + getName() + ") - m()");
	}
	
	public void f() {
		System.out.println("Class1(" + getName() + ") - f()");
	}
	
	public void s() {
		System.out.println("Class1(" + getName() + ") - s()");
	}
}

class Class2 extends Class1 {
	
	public Class2(String name) {
		// Remember, there is no default constructor
		super(name); // the super call must be the first command
	}
	
	/*
	 * Override: 
	 * 	- access must be wider
	 *  - parameter list should be the same
	 *  - return type should be the same or a sub-type
	 *  - can't be final
	 */
	public void m() {
		System.out.println("Class2[" + getName() + "] - m()");
	}
	
	public void s() {
		System.out.println("Class2[" + getName() + "] - s()");
		super.s();	// we can call the super method from the base class too
	}
	
}

public class OverrideMethods {

	public static void main(String[] args) {
		Class2 c = new Class2("somename");
		c.m(); // Overridden method
		System.out.println("-------");
		c.f();	// Not overridden method
		System.out.println("-------");
		c.s();
		System.out.println("-------");
	}

}
