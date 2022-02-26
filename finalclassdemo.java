package com.dkh.finalExam;
/*
class Dem {
	void set() {
		System.out.println("set dem method here");
	}
}

public class finalclassdemo extends Dem {
	public static void main(String[] args) {

		Dem dem = new Dem();
		dem.set();
	}
}*/



 final class Dem {  //final class can not inherit.
	void set() {
		System.out.println("set dem method here");
	}
}

public class finalclassdemo { //we can not extends Dem class due to final
public static void main(String[] args) {

		Dem dem = new Dem();
		dem.set();
	}
}