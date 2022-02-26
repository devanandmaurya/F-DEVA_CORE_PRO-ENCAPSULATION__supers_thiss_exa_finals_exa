package com.dkh.this3;
/*//this() can be used to current class constructor 
public class Thisdemo3 {

	Thisdemo3(){
	System.out.println("no argument constructor");
	}

	Thisdemo3(int i)
	{ this();//by this it calles first construtore
		System.out.println("parametrize constructor");
	}
public static void main(String[] args) {
	Thisdemo3 thisdemo3=new Thisdemo3(12);//(12) by this its call para cons
	
}
}
*/

//this() can be used to current class constructor 
public class Thisdemo3 {

	Thisdemo3(){
		this(10);//by this(10) call parameterize constructor
	System.out.println("no argument constructor");
	}

	Thisdemo3(int i)
	{ //this();//by this it calls first construtore current class
		System.out.println("parametrize constructor");
	}
public static void main(String[] args) {
	Thisdemo3 thisdemo3=new Thisdemo3();//(12) by this its call para cons
	
}
}
