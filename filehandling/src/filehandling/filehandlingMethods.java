package filehandling;

import java.io.File;
import java.io.FileWriter;

public class filehandlingMethods {
   public static void main(String args[]) {
	   File f = new File("C:\\Users\\SIDDHANT\\Desktop\\siddhant.txt");
	   try(FileWriter writer = new FileWriter(f)){
		   writer.write("this file belongs to me");
		   writer.write("and i belongs to this file");
		   System.out.println(f.length());
		   System.out.println("Content added Succesfully");
	   }
	   catch(Exception e){
		   System.out.println(e);
		   
	   }
   }
}

