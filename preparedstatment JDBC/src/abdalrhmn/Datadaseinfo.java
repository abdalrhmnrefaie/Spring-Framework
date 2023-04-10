package abdalrhmn;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

 
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
	
	
	
}
