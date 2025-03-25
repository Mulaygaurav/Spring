package SpringMVC;

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
    	EmployeeService es= (EmployeeService) con.getBean("employeeService");
    	es.show();
    
    }
}
