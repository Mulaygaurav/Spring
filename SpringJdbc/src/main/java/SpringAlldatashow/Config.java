package SpringAlldatashow;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("SpringAlldatashow")
public class Config {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource d=new DriverManagerDataSource(); 
		d.setUsername("system");
		d.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		d.setPassword("root");
		return d;
	}
	
	@Bean
	public JdbcTemplate jdbcTem() {
		return new JdbcTemplate(dataSource());
	}
	

}
