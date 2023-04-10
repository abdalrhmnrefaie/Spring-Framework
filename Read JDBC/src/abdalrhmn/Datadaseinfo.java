package abdalrhmn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

 
public class Datadaseinfo {

	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template ) {
		this.template=template;
	}
	
	
	
	public Boolean insertPerson(Person p) {
		
		String insertData ="INSERT INTO person (`fname`, `lname`, `age`, `adress`, `phone`) VALUES (?,?,?,?,?)"; 
		
		return template.execute(insertData,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		
				ps.setString(1,p.getFname());
				ps.setString(2,p.getLname());
				ps.setInt(3,p.getAge());
				ps.setString(4,p.getAdress());
				ps.setInt(5,p.getPhone());
				
				return ps.execute();
			}
			
		});
	}
	
	
	
	

		public Boolean updatetPerson(Person p) {
			
			String updateData ="UPDATE person SET `fname`=?,`lname`=?,`age`=?,`adress`=?,`phone`=? WHERE id =?";
			
			return template.execute(updateData,new PreparedStatementCallback<Boolean>() {

				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			
					ps.setString(1,p.getFname());
					ps.setString(2,p.getLname());
					ps.setInt(3,p.getAge());
					ps.setString(4,p.getAdress());
					ps.setInt(5,p.getPhone());
					ps.setInt(6,p.getId());

					return ps.execute();
				}
				
			});
		
		
	   
	   
//		String updateData ="UPDATE person SET(`fname`, `lname`, `age`, `adress`, `phone`) VALUES( "+
//		"`fname`="+p.getFname()+",`lname`="+p.getLname()+",`age`="+p.getAge()+",`adress`="+p.getAdress()+",`phone`="+p.getPhone()+"WHERE id="+p.getId()+")";
//		return template.update(updateData);
		}

		
		
		
	public Boolean deletePerson(Person p) {
		
		String deleteData ="DELETE FROM `person` WHERE id=?";
		return template.execute(deleteData,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
                ps.setInt(1,p.getId());
				
				return ps.execute();
			}
		});
	}

	
	
public List <Person>viewAll() {
		
		String ReadData ="SELECT * FROM person";
		return template.query(ReadData, new RowMapper<Person>(){

			public Person mapRow(ResultSet rs, int rownum) throws SQLException {
				Person p=new Person();
				p.setId(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setAge(rs.getInt(4));
				p.setAdress(rs.getString(5));
				p.setPhone(rs.getInt(6));
				return p;
			}
			
			
		}	);	
				
		
	}
	
	
}
