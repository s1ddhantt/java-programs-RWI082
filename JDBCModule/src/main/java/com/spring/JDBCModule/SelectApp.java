package com.spring.JDBCModule;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rowmapper.StudentRowMapper;

import in.sp.beans.Student;
import jdbc.cfg.resources.jdbcConfigFile;

public class SelectApp {
	
	public static void main(String[] args) {
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfigFile.class);
	       JdbcTemplate temp = context.getBean(JdbcTemplate.class);
	       
	       
	       
	       String select_sql_query = "SELECT * FROM student";
	       
	     List<Student> std_list =  temp.query(select_sql_query, new StudentRowMapper());
	     
	     for(Student std : std_list) {
	    	 System.out.println("Roll Number : " + std.getRollno());
	    	 System.out.println("Student Name : " + std.getName());
	    	 System.out.println("Student Marks : " + std.getMarks());
	    	 System.out.println("______________________________________");
	     }
	       
	       
	       
	}

}
