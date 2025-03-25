package SpringMVCBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SpringMVC")
public class Config {
	 @Bean
	    public EmployeeDAOImpl employeeDAOImpl() {
	        return new EmployeeDAOImpl();
	    }

	    @Bean
	    public EmployeeService employeeService() {
	        return new EmployeeService(employeeDAOImpl()); 
	    }
}
