package com.dkh.this2;
//this can be used to invoke current class method(implicitly).
public class Thisdemo2 {
void dis() {
	System.out.println("hello all ==>>");
}
void show() {
	dis();//here implicitly this keyword compiler provide automatically.
//this.dis();
	System.out.println("This is defult compier method provid by java");
}
public static void main(String[] args) {
	 Thisdemo2 thisdemo2=new Thisdemo2();
	 thisdemo2.show();
	 thisdemo2.dis();
}
}
