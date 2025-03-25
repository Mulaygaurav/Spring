package SpringMVCBeanXml;

import java.util.List;

import org.springframework.stereotype.Component;


public class EmployeeDAOImpl implements IEmployeeDAO {

	public EmployeeDAOImpl() {
		
	}
	@Override
	public void addEmployee(Employee e) {
		System.out.println( "adding employee");

	}

	@Override
	public int getEmployee(int id) {
		System.out.println("getting employee");
		return 0;
	}

	@Override
	public List getAllEmployees() {
		System.out.println("All Employee");
		return null;

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
