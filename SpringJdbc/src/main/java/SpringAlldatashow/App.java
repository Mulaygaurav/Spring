package SpringAlldatashow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con= new AnnotationConfigApplicationContext(Config.class);
    	EmployeeService e3 = (EmployeeService) con.getBean("employeeService");
Employee e=new Employee();
e.setId(107);
e.setName("Saurabh");
e.setDepartment("Agri");
e.setSalary(10000000);
        
     
     for(Employee e1 : e3.getAllEmployee()) {
    	 System.out.println(e1);
     }
       
    
    }
}
