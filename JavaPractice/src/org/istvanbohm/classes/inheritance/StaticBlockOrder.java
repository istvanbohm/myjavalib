package org.istvanbohm.classes.inheritance;

class Other {
	public Other(String name) {
		System.out.println("Constructor - Other(" + name + ")");
	}
}


class SBO1 {
	static{
		System.out.println("SBO1 static block");
	}
}

class SBO2 extends SBO1 {
	static{
		System.out.println("SBO2 static block");
	}
}

public class StaticBlockOrder extends SBO2 {

	public static final Other o1 = new Other("O1");
	static{
		System.out.println("StaticBlockOrder static block");
	}
	public static final Other o2 = new Other("O2");
	
	public StaticBlockOrder() {
		
	}
	
	public static void main(String[] args) {
		// Hint: base class first
		StaticBlockOrder x = new StaticBlockOrder();
	}
}
