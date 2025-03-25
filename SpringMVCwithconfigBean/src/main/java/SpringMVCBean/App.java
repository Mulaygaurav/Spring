package SpringMVCBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con= new AnnotationConfigApplicationContext(Config.class);
    	EmployeeService employeeService = con.getBean("employeeService", EmployeeService.class);

        
        employeeService.show();
       
    
    }
}
