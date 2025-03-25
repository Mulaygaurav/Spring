package SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class EmployeeService {
	
	EmployeeDAOImpl ed;
	
	@Autowired
	public EmployeeService( EmployeeDAOImpl ed) {
		super();
		this.ed = ed;
	}
	
	public void show() {
		ed.addEmployee(null);
		ed.updateSalary(0, 0);
		ed.deleteEmployee(0);
		System.out.println(ed.getEmployee(0));
		System.out.println(ed.getAllEmployees());
	}
	
	

	
	
	
	
	
	
	
		
		
}
