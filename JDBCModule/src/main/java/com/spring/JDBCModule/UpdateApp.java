package com.spring.JDBCModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.cfg.resources.jdbcConfigFile;

public class UpdateApp {

	public static void main(String[] args) {
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfigFile.class);
	       JdbcTemplate temp = context.getBean(JdbcTemplate.class);
	       
	       float marks = 100.0f;
	       int rollno = 101;
	       String update_sql_query = "UPDATE student SET std_marks = ? WHERE std_roll = ?";
	       
	       int count = temp.update(update_sql_query , marks , rollno);
	       
	       if(count>0) {
	    	   System.out.println("Updation Successful");
	       }
	       else {
	    	   System.out.println("Updation Failed");
	       }
	       
	}

}
