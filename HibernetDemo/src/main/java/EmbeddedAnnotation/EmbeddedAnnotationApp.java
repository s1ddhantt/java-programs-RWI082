package EmbeddedAnnotation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedAnnotationApp {
	
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Bank B1 = new Bank();
	        B1.setBankname("RBL Bank");
	        B1.setIFSCCode("RBL4345");
	        
	       
	        
	        Employee E1 = new Employee();
	        E1.setDesignation("Software Developer");
	        E1.setEmployeeName("Shubham Tiwari");
	        E1.setEmployeeSalary(21000);
	        
	       
	        
	        B1.setEmployee(E1);
	       
	       
	         
	        
	        Session session= factory.openSession();
	        Transaction ts = session.beginTransaction();
	        
	        session.save(B1);
	        
	       	        
	        ts.commit();
	        session.close();
	        factory.close();
	        
	     
	    }

}
