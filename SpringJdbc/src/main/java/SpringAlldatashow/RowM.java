package SpringAlldatashow;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowM implements RowMapper<Employee> {

		
				
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee e1= new Employee();
		 
	
		e1.setId(rs.getInt("id"));
		e1.setName(rs.getString("name"));
		e1.setDepartment(rs.getString("Department"));
		e1.setSalary(rs.getInt("salary"));
		return e1;
	}

}
