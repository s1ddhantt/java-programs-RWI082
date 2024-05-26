package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
         Student s1 = new Student();
        s1.setName("vivek");
        s1.setSirname("mittal");
        
        StudentAdd sd2 = new StudentAdd();
        sd2.setAge(45);
        sd2.setBloodGroup("Opositive");
        
        Session session= factory.openSession();
        Transaction ts = session.beginTransaction();
        
        session.save(s1);
        session.save(sd2);
        
        ts.commit();
        session.close();
        factory.close();
        
     
    }
}
