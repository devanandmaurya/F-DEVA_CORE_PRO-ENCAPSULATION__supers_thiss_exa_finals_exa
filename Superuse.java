package com.dkh.enclu.superexample;

//super keyword is a reference variable which is used to refer 
//immediate parrent class object.
class Testing {
	int i = 10;
}

public class Superuse extends Testing {
	int i = 20;

	void show(int i) {
		System.out.println("the value of i" + i);
		// i print int i parameter 30
		System.out.println(this.i);
		// this print current class instance that is 20.
		System.out.println(super.i);
		// super print parent class instance that is 10.
	}

	public static void main(String args) {
		Superuse s = new Superuse();
		System.out.println("hThis is Testing examp");
		s.show(30);
	}
}
