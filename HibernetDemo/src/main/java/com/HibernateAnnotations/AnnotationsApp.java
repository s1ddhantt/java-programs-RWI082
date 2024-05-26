package com.HibernateAnnotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HibernateAnnotations.AnnotationsDemo;


public class AnnotationsApp {
	
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	         AnnotationsDemo ad = new AnnotationsDemo();
	         ad.setName("Vineeta Tanwar");
	         ad.setAge(21);
	         ad.setAddress("Maheshwar");
	         ad.setWorking(true);
	         ad.setJoiningDate(new Date());
	         
	        
	        Session session= factory.openSession();
	        Transaction ts = session.beginTransaction();
	        
	        session.save(ad);
	       	        
	        ts.commit();
	        session.close();
	        factory.close();
	        
	     
	    }

}
