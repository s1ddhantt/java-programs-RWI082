import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class smallProjectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/railworld","root","root");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Insertion Opeartion.");
		System.out.println("Press 2 for Updation Opeartion.");
		System.out.println("Press 3 for Deletion Opeartion.");
		
		System.out.println("Enter Your Number : ");
		
		int number = sc.nextInt();
		
		if(number==1) {
			System.out.println("You selected Insertion Opeartion !");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name:");
			String name = br.readLine();
			
			
			System.out.println("Enter Password:");
			String password = br.readLine();
			
			
			System.out.println("Enter Mobile Number:");
			String mobile = br.readLine();
			
			
			PreparedStatement ps = con.prepareStatement("Insert into emp values(?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, mobile);
			
			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Record Added Succesfully !");
			}
			else {
				System.out.println("Record can not be Added..");
			}
			con.close();
		}
		else if(number == 2) {
			System.out.println("You selected Updation Opeartion !");
			String name = "rickey";
			String mobile = "12345";
			
			PreparedStatement ps = con.prepareStatement("update emp set name=? where mobile=?");
			ps.setString(1, name);
			ps.setString(2, mobile);
			
			int count = ps.executeUpdate();
			
			if(count>0) {
				System.out.println("Record Updated Successfully !");
			}
			else {
				System.out.println("Record Updation Failed !");
			}
			
			con.close();

		}
		else if(number == 3) {
			System.out.println("You selected Deletion Opeartion !");
			String mobile = "12345";
	 		
			PreparedStatement ps = con.prepareStatement("Delete from emp where mobile=?");
			ps.setString(1, mobile);
			int count = ps.executeUpdate();
			
			if(count>0) {
				System.out.println("Record Deleted Succesfully");
			}
			else {
				System.out.println("Record Already Deleted");
			}
			con.close();		

	}
	else {
		System.out.println("Invalid Number Entered");
	}

}
}
