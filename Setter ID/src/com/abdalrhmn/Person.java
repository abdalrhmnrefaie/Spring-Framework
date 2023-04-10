package com.abdalrhmn;

public class Person {
	private int id;
	private String personName;
	private Addresses add;




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Addresses getAdd() {
		return add;
	}

	public void setAdd(Addresses add) {
		this.add = add;
	}



	void display() {
		System.out.println("id:"+id+ " personName:"+personName+ " Addresses:"+add.infoAddresses());
	
	}

}
