package SpringMVC;

import java.util.List;

public interface IEmployeeDAO {
	
	public void addEmployee(Employee e);
	public int getEmployee(int id);
	public List getAllEmployees();
	public void updateSalary(int id,int salary);
	public void deleteEmployee(int id);

}
