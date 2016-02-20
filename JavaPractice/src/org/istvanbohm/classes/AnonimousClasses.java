package org.istvanbohm.classes;

class HelloWorld {
	public void hello(String name) {
		System.out.print("Hello " + name);
	}
	public void hello() {
		hello("World!");
	}
}


public class AnonimousClasses {

	public static void main(String[] args) {
		
		new HelloWorld() {
			public void hello(String name) {
				System.out.print("Szia " + name);
			}
			public void hello() {
				hello("Világ!");
			}
		}.hello();

	}

}
