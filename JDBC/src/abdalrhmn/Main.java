package abdalrhmn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ApplicationContext conx =new ClassPathXmlApplicationContext("application.xml");
		
		Datadaseinfo di=(Datadaseinfo)conx.getBean("dbi");
//		insert
//		int ins=di.insertPerson(new Person("abdalrhmn","refaie",24,"beni souif",011566666));
		
//		delete
//		Person p=new Person();
//		p.setId(3);
//		int ins=di.deletePerson(p);
//		
		
		
//		update
		
		
		int ins=di.updatetPerson(new Person(4,"ahmed","refaie",15,"beni souif",011566666));
		
		System.out.println(ins);
		
		
	}

}
