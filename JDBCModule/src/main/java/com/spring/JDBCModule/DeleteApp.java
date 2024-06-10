package com.spring.JDBCModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.cfg.resources.jdbcConfigFile;

public class DeleteApp {

	public static void main(String[] args) {
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfigFile.class);
	       JdbcTemplate temp = context.getBean(JdbcTemplate.class);
	       
	       
	       int rollno = 103;
	       String delete_sql_query = "DELETE FROM student WHERE std_roll = ?";
	       
	       int count = temp.update(delete_sql_query  , rollno);
	       
	       if(count>0) {
	    	   System.out.println("Deletion Successful");
	       }
	       else {
	    	   System.out.println("Deletion Failed");
	       }
	       
	}
}
