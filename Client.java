package com.dkh.enclu;

public class Client {
public static void main(String[] args) {
	Emp emp=new Emp();
	emp.setId(101);
	emp.setName("dev");
	
	System.out.println(emp.getId() + " :and "+ emp.getName());
}
}
