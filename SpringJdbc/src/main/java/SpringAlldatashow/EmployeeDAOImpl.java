package SpringAlldatashow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class EmployeeDAOImpl implements IEmployeeDAO {
	

	 JdbcTemplate jt;
	 
	 @Autowired
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	@Override
	public void addEmployee(Employee e) {
		jt.update("insert into employee values(?,?,?,?)",e.getId(),e.getName(),e.getDepartment(),e.getSalary());
		

	}

	@Override
	public int getEmployee(int id) {
		System.out.println("getting employee");
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		
		return jt.query("select * from employee",new RowM() );

	}

	@Override
	public void updateSalary(int id, int salary) {
		System.out.println("Update salary");

	}

	@Override
	public void deleteEmployee(int id) {
		System.out.println( "deleting employee");

	}
	
	

}
