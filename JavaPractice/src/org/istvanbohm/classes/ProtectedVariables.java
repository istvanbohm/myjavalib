package org.istvanbohm.classes;

class A {
	protected String w = "A";
	public void hello() {
		System.out.println(w);
	}
}

class B extends A {
	protected String w = "B";
}

class C extends A {
	protected String w = "C";
	public void hello() {
		System.out.println(w);
	}
}

class D extends A {
	public void hello() {
		System.out.println(w + w);
	}
}


public class ProtectedVariables {

	public static void main(String[] args) {
		A a = new A();
		a.hello();
		B b = new B();
		b.hello();
		C c = new C();
		c.hello();
		D d = new D();
		d.hello();
	}

}
