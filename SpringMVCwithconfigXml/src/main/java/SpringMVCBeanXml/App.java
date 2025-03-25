package SpringMVCBeanXml;

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
    	ApplicationContext con= new ClassPathXmlApplicationContext("Config.xml");
    	EmployeeService employeeService = (EmployeeService) con.getBean("service");

        
        employeeService.show();
       
    
    }
}
