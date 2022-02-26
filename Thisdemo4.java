package com.dkh.this4;
//this keyword can be use to  pass as an argument in the method
public class Thisdemo4 {
void m1(Thisdemo4 td) { 
	System.out.println(" i am m1 method");
	}
void m2() {
	m1(this);
	//here this is as an argument for m1 method
}
public static void main(String[] args) {
	Thisdemo4 thisdemo4=new Thisdemo4();
	thisdemo4.m2();
}
}
