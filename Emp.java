package com.dkh.enclu;

public class Emp {
	private int id;
	private String name;

	public void setId(int eid) {
		// this.id=eid; ORR
		id = eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
		
	
}