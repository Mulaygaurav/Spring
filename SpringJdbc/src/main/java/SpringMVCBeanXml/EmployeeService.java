package SpringMVCBeanXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class EmployeeService {
	
	EmployeeDAOImpl ed;
	public EmployeeService(EmployeeDAOImpl ed) {
		
		this.ed=ed;
	}
	
	
	
	


	public void addEmployee(Employee e) {
		ed.addEmployee(e);
	}
	
	

	
	
	
	
	
	
	
		
		
}
