package com.HibernateAnnotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingDataGetandLoadMethods {

	public static void main(String[] args) {
		
		//Configuration setup first
		  Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       
	       
	       //Session factory setup second 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session= factory.openSession();
	        
	        AnnotationsDemo ad = (AnnotationsDemo)session.get(AnnotationsDemo.class, 3);
	        System.out.println(ad);
	        
	        AnnotationsDemo ad2 = (AnnotationsDemo)session.get(AnnotationsDemo.class, 2);
	        System.out.println(ad2.getName() + ":" + ad2.getAddress());
	        
	        AnnotationsDemo ad3 = (AnnotationsDemo)session.load(AnnotationsDemo.class, 5);
	        System.out.println(ad3);
	        
	        
	        
	        session.close();
	        factory.close();

	}

}
