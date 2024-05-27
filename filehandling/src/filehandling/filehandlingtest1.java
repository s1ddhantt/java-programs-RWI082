package filehandling;

import java.io.File;

public class filehandlingtest1 {
   public static void main (String args[]) {
	   File f = new File("C:\\Users\\SIDDHANT\\Desktop\\siddhant.txt");
	   File g = new File("C:\\Users\\SIDDHANT\\Desktop\\thakur.txt");
	  
	   try {
		   if(f.createNewFile()){
			   System.out.println("New file created succesfully");
		   }
		   else {
			   System.out.println("this file already exists on desktop");
		   }
		   
		   if(g.createNewFile()) {
			   System.out.println("New file created succesfully");
		   }
		   else {
			   System.out.println("this file already exists on desktop");
		   }
	   }
	   catch(Exception e) {
		   System.out.println(e);
	   }
   }
}
