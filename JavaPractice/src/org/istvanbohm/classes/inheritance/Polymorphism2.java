package org.istvanbohm.classes.inheritance;

class X {
	int var = 2;
	int val() { return var*3; }
}

class Y extends X {
	int var = 5;
	int val() { return var*7; }
}

public class Polymorphism2 {
	public static void main(String[] args) {
		X tmp = new Y();
		System.out.println(tmp.val()*tmp.var);
	}
}
