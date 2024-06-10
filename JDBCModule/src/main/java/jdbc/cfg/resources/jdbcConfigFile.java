package jdbc.cfg.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class jdbcConfigFile {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3308/spring_jdbcModule");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
		
	}
	
	
	@Bean
	public JdbcTemplate myjdbcTemplate() {
		
		JdbcTemplate jdbctemp = new JdbcTemplate();
		jdbctemp.setDataSource(myDataSource());
		
		return jdbctemp;
	}

}
