package abdalrhmn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ApplicationContext conx =new ClassPathXmlApplicationContext("application.xml");
		
		Datadaseinfo di=(Datadaseinfo)conx.getBean("dbi");
//		insert
//		ps.setInt(5,p.getPhone());
//    	di.insertPerson(new Person("ahmed","refaie",19,"beni souif",011111111));
		
//		delete
		Person p=new Person();
		p.setId(9);
		di.deletePerson(p);
//		
		
		
//		update
		
		
//	     di.updatetPerson(new Person(4,"hossam","refaie",29,"beni souif",10101010));
		
//		System.out.println(ins);
		
		
	}

}
