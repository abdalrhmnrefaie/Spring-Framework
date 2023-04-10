package com.abdalrhmn;

public class Person {
	private int id;
	private String personName;
	private Addresses addresses;
	public Person() {
		super();
	}
	
	public Person(int id, String personName, Addresses addresses) {
		super();
		this.id = id;
		this.personName = personName;
		this.addresses = addresses;
	}

	void display() {
		System.out.println("id:"+id+ " personName:"+personName);
		System.out.println("Addresses:"+addresses.infoAddresses());
		
		
	}

}
