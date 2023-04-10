package com.abdalrhmn;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.stream.events.EndElement;

public class Person {
	private int id;
	private String personName;
	private Map<String,String>map;




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



	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	void display() {
		System.out.println("id:"+id+ "  personName:"+personName);
		Set<Entry<String,String>> set=map.entrySet();
	    Iterator<Entry<String,String>> it=set.iterator();
	    while (it.hasNext()) {
	   	Entry<String,String> entry=it.next();
	    	System.out.println("Adresses: " +entry.getKey()+" : "+entry.getValue());
		}
	}

}
