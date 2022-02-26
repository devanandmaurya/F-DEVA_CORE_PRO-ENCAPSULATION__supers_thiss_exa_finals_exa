package com.dkh.this6;
//This keyword can be used to return current class instance from the method.

public class ThisDemo6 {

	ThisDemo6 m1() { // current class instance method .
		System.out.println("this class instance methods");
		return this;
	}

	public static void main(String[] args) {
		ThisDemo6 thisDemo6 = new ThisDemo6();
		thisDemo6.m1();
	}
}
