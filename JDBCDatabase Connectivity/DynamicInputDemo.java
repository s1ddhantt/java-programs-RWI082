import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DynamicInputDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/railworld","root","root");
		
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
			System.out.println("New Record Added Successfully");
		}
		else {
			System.out.println("Record Addition Failed");
		}
		
		con.close();

	}

}
