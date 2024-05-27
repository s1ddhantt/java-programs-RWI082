package filehandling;

import java.io.File;

public class filehandlingRename {

	public static void main(String[] args) {
		 File f = new File("C:\\Users\\SIDDHANT\\Desktop\\siddhant.txt");
		 File g = new File("C:\\Users\\SIDDHANT\\Desktop\\thakurSiddhant.txt");
		 
			 if(f.exists()) {
				
				 System.out.println(f.renameTo(g));
			 System.out.println("File renamed succesfully");
			 }
			 else {
				 System.out.println("File does not exist");
			 }
		 
		
	}

}
