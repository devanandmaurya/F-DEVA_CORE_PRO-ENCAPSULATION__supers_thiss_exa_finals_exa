package com.dkh.finalExam;

class Demodemo {
	void methods() { 
		// ager final likha to dusere class me error aayega complile karne par
		System.out.println("i am in demos class method");
	}
}

public class Finalmethods extends Demodemo {
	  void methods() { 
		
		// cannot override the final method from Demodemo
		System.out.println("i am  ghdghgdf  rom main method class");
	}

	public static void main(String[] args) {
		System.out.println("+++++++++++");
		Demodemo demodemo = new Demodemo();
		demodemo.methods();
	}
}
