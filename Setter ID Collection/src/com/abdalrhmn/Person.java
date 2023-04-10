package com.abdalrhmn;

import java.util.Iterator;
import java.util.List;

import javax.xml.stream.events.EndElement;

public class Person {
	private int id;
	private String personName;
	private List<String>list;




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




	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	void display() {
		System.out.println("id:"+id+ "  personName:"+personName);
	    Iterator<String>it=list.iterator();
	    while (it.hasNext()) {
	    	System.out.println(it.next());
		}
	}

}
