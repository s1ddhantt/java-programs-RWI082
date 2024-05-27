package filehandling;

import java.io.File;

public class filehandlingTest2 {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\SIDDHANT\\Desktop\\siddhant.txt");
		 File g = new File("C:\\Users\\SIDDHANT\\Desktop\\thakur.txt");
		if(f.exists() || g.exists() ) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.length());
			System.out.println(g.delete());
		}
		else {
			System.out.println("File do not exist");
		}
	}
	

}
