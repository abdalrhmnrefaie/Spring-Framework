package abdalrhmn;

public class Person {

	private int id;
	private String fname;
	private String lname;
	private int age;
	private String adress;
	private int phone;
	
	
	public Person() {
		super();
	}
	

	public Person(int id, String fname, String lname, int age, String adress, int phone) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.adress = adress;
		this.phone = phone;
	}


	public Person( String fname,String lname, int age, String adress, int phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.adress = adress;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
	public String display() {
		return id+" "+fname+" "+lname+" "+age+" "+adress+" "+phone;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
