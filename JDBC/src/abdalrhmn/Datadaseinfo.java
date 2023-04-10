package abdalrhmn;
import org.springframework.jdbc.core.JdbcTemplate;

 
public class Datadaseinfo {

	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template ) {
		this.template=template;
	}
	
	
	
	public int insertPerson(Person p) {
		
		String insertData ="INSERT INTO person (`fname`, `lname`, `age`, `adress`, `phone`) VALUES ("
			+"'"+p.getLname()+ "'"+ "," +"'"+p.getFname()+ "'"+ "," +"'"+p.getAge()+ "'"+","+"'"+p.getAdress()+ "'"+","+"'"+p.getPhone()+"'"+")";
		return template.update(insertData);
	}
	
	
   public int updatetPerson(Person p) {

	   String updateData =  " UPDATE person SET "+
	       "fname="+"'"+p.getFname()+"'"+",lname="+"'"+p.getLname()+"'"+",age="+"'"+p.getAge()+"'"+
		   ",adress="+"'"+p.getAdress()+"'"+",phone="+"'"+p.getPhone()+"'"+"WHERE id= "+p.getId();
	   return template.update(updateData);
	   
	   
//		String updateData ="UPDATE person SET(`fname`, `lname`, `age`, `adress`, `phone`) VALUES( "+
//		"`fname`="+p.getFname()+",`lname`="+p.getLname()+",`age`="+p.getAge()+",`adress`="+p.getAdress()+",`phone`="+p.getPhone()+"WHERE id="+p.getId()+")";
//		return template.update(updateData);
	}
	

	public int deletePerson(Person p) {
		
		String deleteData ="DELETE FROM `person` WHERE id="+p.getId()+"";
		return template.update(deleteData);
	}
	
	
	
}
