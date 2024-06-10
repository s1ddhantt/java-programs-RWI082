package com.spring.JDBCModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.cfg.resources.jdbcConfigFile;

/**
 * Hello world!
 *
 */
public class InsertApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfigFile.class);
       JdbcTemplate temp = context.getBean(JdbcTemplate.class);
       
       
       int std_rollno = 103;
       String std_name = "Vivek";
       float std_marks = 92.0f;
       
       String insert_sql_query = "INSERT INTO student values(?, ? ,?)";
      int count = temp.update(insert_sql_query , std_rollno , std_name , std_marks);
      
      
      if(count > 0) {
    	  System.out.println("Insetion Successful");
      }
      else {
    	  System.out.println("Insertion Failed");
      }
    }
}
