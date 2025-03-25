package SpringMVCBeanXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class EmployeeService {
	
	EmployeeDAOImpl ed;
	public EmployeeService() {
		
	}
	
	
	
	public EmployeeDAOImpl getEd() {
		return ed;
	}



	public void setEd(EmployeeDAOImpl ed) {
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
