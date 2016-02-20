package org.istvanbohm.classes;

class X {
	public void f() {
		System.out.println("X");
	}
}

class Y extends X {
	public void f() {
		System.out.println("Y");
	}
}

class Z extends Y {
	public void f() {
		super.f();
		
	}
}



public class Super {

	public static void main(String[] args) {
		Z z = new Z();
		z.f();
		
	}

}
