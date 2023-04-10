package com.abdalrhmn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext conx =new ClassPathXmlApplicationContext("appcontext.xml");
		Person p=(Person)conx.getBean("p");
		p.display();
	}

}
