package com.dkh.this5;

//This keyword can be pass as an agrument in the constructor
class Test {
	Test(ThisDemo5 td) {//as parameter pass of main class
		System.out.println("test class constructor");
	}
}

public class ThisDemo5 {
	void m1(){
		Test t = new Test(this);
	}

	public static void main(String[] args) {
		ThisDemo5 thisDemo5 = new ThisDemo5();
	//	ThisDemo5 thisDemo5 = new ThisDemo5(this);//here comple time error show Cannot use
		//this in a static context
		thisDemo5.m1();
	}
}